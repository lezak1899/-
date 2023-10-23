package edu.lingnan.luckymall.modules.orderingdishes.service.impl;

import edu.lingnan.luckymall.modules.orderingdishes.entity.OrderingDishes;
import edu.lingnan.luckymall.modules.orderingdishes.dao.OrderingDishesDao;
import edu.lingnan.luckymall.modules.orderingdishes.service.OrderingDishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * (OrderingDishes)表服务实现类
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@Service("orderingDishesService")
public class OrderingDishesServiceImpl implements OrderingDishesService {


    @Autowired
    private OrderingDishesService orderingDishesService;

    @Autowired
    private OrderingDishesDao orderingDishesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderingDishes queryById(Integer id) {
        return this.orderingDishesDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderingDishes> queryAllByLimit(int offset, int limit) {
        return this.orderingDishesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderingDishes 实例对象
     * @return 实例对象
     */
    @Override
    public OrderingDishes insert(OrderingDishes orderingDishes) {
        this.orderingDishesDao.insert(orderingDishes);
        return orderingDishes;
    }

    /**
     * 修改数据
     *
     * @param orderingDishes 实例对象
     * @return 实例对象
     */
    @Override
    public OrderingDishes update(OrderingDishes orderingDishes) {
        this.orderingDishesDao.update(orderingDishes);
        return this.queryById(orderingDishes.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.orderingDishesDao.deleteById(id) > 0;
    }

    @Override
    public List<OrderingDishes> queryAllByOrderingId(int orderingId) {
        OrderingDishes orderingDishes = new OrderingDishes();
        orderingDishes.setOrderingId(orderingId);
        return orderingDishesDao.queryAll(orderingDishes);
    }


    @Override
    public OrderingDishes newTestInstance() {
        OrderingDishes orderingDishes = new OrderingDishes();
        orderingDishes.setDishesCount(111);
        orderingDishes.setDishesName("Test");
        return orderingDishes;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void insertIntoOrderingDishes() throws Exception {
        this.orderingDishesService.insert(this.orderingDishesService.newTestInstance());
        //throw new RuntimeException();
    }


}