package edu.lingnan.eattingwhat2.service.impl;

import edu.lingnan.eattingwhat2.entity.Ordering;
import edu.lingnan.eattingwhat2.entity.OrderingDishes;
import edu.lingnan.eattingwhat2.dao.OrderingDishesDao;
import edu.lingnan.eattingwhat2.service.OrderingDishesService;
import edu.lingnan.eattingwhat2.vo.OrderingDishesInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
     * @param limit 查询条数
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
        OrderingDishes orderingDishes =new OrderingDishes();
        orderingDishes.setOrderingId(orderingId);
        return orderingDishesDao.queryAll(orderingDishes);
    }

    public OrderingDishes newTestInstance(){
        OrderingDishes orderingDishes =new OrderingDishes();
        orderingDishes.setDishesCount(111);
        orderingDishes.setDishesName("Test");
        return orderingDishes;
    }
}