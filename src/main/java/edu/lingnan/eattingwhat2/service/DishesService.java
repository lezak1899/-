package edu.lingnan.eattingwhat2.service;

import edu.lingnan.eattingwhat2.entity.Dishes;
import java.util.List;

/**
 * (Dishes)表服务接口
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
public interface DishesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dishes queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Dishes> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dishes 实例对象
     * @return 实例对象
     */
    Dishes insert(Dishes dishes);

    /**
     * 修改数据
     *
     * @param dishes 实例对象
     * @return 实例对象
     */
    Dishes update(Dishes dishes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


    List<Dishes> queryAllByStoreId(int storeId);

}