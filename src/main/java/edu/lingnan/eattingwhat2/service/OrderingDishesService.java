package edu.lingnan.eattingwhat2.service;

import edu.lingnan.eattingwhat2.entity.OrderingDishes;
import java.util.List;

/**
 * (OrderingDishes)表服务接口
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
public interface OrderingDishesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderingDishes queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderingDishes> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderingDishes 实例对象
     * @return 实例对象
     */
    OrderingDishes insert(OrderingDishes orderingDishes);

    /**
     * 修改数据
     *
     * @param orderingDishes 实例对象
     * @return 实例对象
     */
    OrderingDishes update(OrderingDishes orderingDishes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


    List<OrderingDishes> queryAllByOrderingId(int OrderingId);





}