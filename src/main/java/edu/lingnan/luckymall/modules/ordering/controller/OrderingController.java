package edu.lingnan.luckymall.modules.ordering.controller;

import edu.lingnan.luckymall.modules.customer.entity.Customer;
import edu.lingnan.luckymall.modules.customer.service.CustomerService;
import edu.lingnan.luckymall.modules.dishes.service.DishesService;
import edu.lingnan.luckymall.modules.ordering.entity.Ordering;
import edu.lingnan.luckymall.modules.orderingdishes.entity.OrderingDishes;
import edu.lingnan.luckymall.modules.ordering.service.OrderingService;
import edu.lingnan.luckymall.modules.orderingdishes.service.OrderingDishesService;
import edu.lingnan.luckymall.modules.store.service.StoreService;
import edu.lingnan.luckymall.modules.dishes.vo.DishesJson;
import edu.lingnan.luckymall.modules.orderingdishes.vo.OrderingDishesInfo;
import edu.lingnan.luckymall.modules.orderingdishes.vo.OrderingWithDishes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * (Ordering)表控制层
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@Controller
@RequestMapping("ordering")
public class OrderingController {
    /**
     * 服务对象
     */
    @Autowired
    private OrderingService orderingService;

    @Autowired
    private OrderingDishesService orderingDishesService;

    @Autowired
    private StoreService storeService;

    @Autowired
    private DishesService dishesService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private Ordering ordering;

    @Autowired
    private OrderingDishes orderingDishes;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Ordering selectOne(Integer id) {
        return this.orderingService.queryById(id);
    }


    @PostMapping("submitOrdering")
    public String submitOrdering(@RequestBody List<DishesJson> jsonArray) {

        /**
         * 以下为插入order表
         */
        //只需要获取一次的值
        int storeId = Integer.parseInt(jsonArray.get(0).getStoreId());
        int customerId = Integer.parseInt(jsonArray.get(0).getCustomerId());
        int dishesId = Integer.parseInt(jsonArray.get(0).getDishesId());
        ;

        //获取当前时间
        Date date = new Date();

        Customer customer = customerService.queryById(customerId);
        //Customer customer=customerService.getById(customerId);

        //需要进入jsonArray获取每一个值 的值
        int dishesNum;
        double dishesPrice;
        double priceSum = 0;

        System.out.println(this.getClass().getName() + ":::" + jsonArray);
        for (DishesJson item : jsonArray
        ) {

            //获取 ordering（订单信息表）的总价格
            dishesPrice = Double.parseDouble(item.getDishesPrice());
            dishesNum = Integer.parseInt(item.getDishesNmb());
            priceSum += (dishesPrice * dishesNum);

        }
        //给ordering（订单信息表）赋值
        ordering.setId(null);
        ordering.setUserId(customerId);
        ordering.setDelivererId(30170001);
        ordering.setStoreId(storeId);
        //ordering.setOrderingDishesId(null);
        ordering.setStartTime(date);
        ordering.setAddress(customer.getAddress());
        ordering.setOrderingState(1);
        ordering.setEndTime(null);
        ordering.setPriceSum(priceSum);

        //插入数据库
        orderingService.insert(ordering);
        //获得ordering的订单编号,需要在mapper文件的 insert方法里面 加入 useGeneratedKeys="true" keyProperty="id"
        int orderingId = ordering.getId();

        //System.out.println(this.getClass().getName()+":::orderingId:::"+orderingId);

        /**
         * 以下为插入 order_dishes 表,需要循环插入
         */
        for (DishesJson item : jsonArray
        ) {
            orderingDishes.setId(null);
            orderingDishes.setOrderingId(orderingId);
            orderingDishes.setDishesCount(Integer.parseInt(item.getDishesNmb()));
            orderingDishes.setDishesId(Integer.parseInt(item.getDishesId()));
            orderingDishes.setDishesName(item.getDishesName());
            orderingDishes.setDishesPrice(Double.parseDouble(item.getDishesPrice()));
            orderingDishesService.insert(orderingDishes);

        }

        //由于是使用ajax提交的，故不会受视图解释器控制，需要在ajax的success函数控制跳转,这里写什么页面都可以，但是不能写错误的页面会因为报404回不到success函数

        return "redirect:/ordering/toOrderingCheck";
    }


    @GetMapping("toOrderingCheck")
    public String toOrderingCheck(HttpSession session, Model model) {

        //Integer customerId = httpSession.getAttribute("loginBean");
        Customer customer = (Customer) session.getAttribute("loginBean");

        List<OrderingWithDishes> orderingWithDishesList = new ArrayList<>();//用来传输数据到前端
        //OrderingWithDishes orderingWithDishesTemp=new OrderingWithDishes(); 不正确的写法，注释掉，应该写到for循环里面


        List<Ordering> orderingList = orderingService.queryAllByCustomerId(customer.getId());


        for (Ordering item : orderingList
        ) {
            //如果orderingWithDishesTemp对象放在foreach循环外面则不可,会导致orderingWithDishesList的所有值会引用同一个orderingWithDishesTemp上
            OrderingWithDishes orderingWithDishesTemp = new OrderingWithDishes();//赋值给orderingWithDishesList的临时对象
            orderingWithDishesTemp.setId(item.getId());
            orderingWithDishesTemp.setAddress(item.getAddress());
            orderingWithDishesTemp.setDelivererId(item.getDelivererId());
            orderingWithDishesTemp.setEndTime(item.getEndTime());
            //orderingWithDishesTemp.setOrderingDishesId(item.getOrderingDishesId());
            orderingWithDishesTemp.setOrderingState(item.getOrderingState());
            orderingWithDishesTemp.setPriceSum(item.getPriceSum());
            orderingWithDishesTemp.setStartTime(item.getStartTime());
            orderingWithDishesTemp.setStoreId(item.getStoreId());
            orderingWithDishesTemp.setUserId(item.getUserId());
            orderingWithDishesTemp.setStoreName(storeService.queryById(item.getStoreId()).getName());


            List<OrderingDishes> orderingDishesList = orderingDishesService.queryAllByOrderingId(item.getId());
            //List<OrderingDishes> orderingDishesList= orderingDishesService.selectByOrderingId(item.getId());
            List<OrderingDishesInfo> orderingDishesInfoList = new ArrayList<>();


            //将orderingDishesList的值赋到orderingDishesInfoList
            for (OrderingDishes dishes : orderingDishesList
            ) {
                OrderingDishesInfo orderingDishesInfo = new OrderingDishesInfo();
                orderingDishesInfo.setId(dishes.getId());
                orderingDishesInfo.setDishesCount(dishes.getDishesCount());
                orderingDishesInfo.setDishesId(dishes.getDishesId());
                orderingDishesInfo.setDishesName(dishes.getDishesName());
                orderingDishesInfo.setDishesPrice(dishes.getDishesPrice());
                orderingDishesInfo.setDishesPrice(dishes.getDishesPrice());
                orderingDishesInfo.setOrderingId(dishes.getOrderingId());
                orderingDishesInfo.setImage(dishesService.queryById(dishes.getDishesId()).getImage());
                orderingDishesInfo.setDescrible(dishesService.queryById(dishes.getDishesId()).getDescrible());
                orderingDishesInfoList.add(orderingDishesInfo);
            }

            orderingWithDishesTemp.setOrderingDishesInfoList(orderingDishesInfoList);


            orderingWithDishesList.add(orderingWithDishesTemp);
        }

        model.addAttribute("orderingWithDishesList", orderingWithDishesList);

        return "pages/ordering_check";
    }

    @GetMapping("deliveryConfirmine")
    public String deliveryConfirmine(int orderingId) {

        Date date = new Date();
        Ordering ordering = orderingService.queryById(orderingId);
        ordering.setOrderingState(2);
        ordering.setEndTime(date);
        orderingService.update(ordering);


        return "redirect:/ordering/toOrderingCheck";
    }

}