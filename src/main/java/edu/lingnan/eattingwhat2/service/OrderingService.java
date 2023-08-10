package edu.lingnan.eattingwhat2.service;

import edu.lingnan.eattingwhat2.entity.Ordering;
import java.util.List;

/**
 * (Ordering)表服务接口
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
public interface OrderingService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Ordering queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Ordering> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ordering 实例对象
     * @return 实例对象
     */
    Ordering insert(Ordering ordering);

    /**
     * 修改数据
     *
     * @param ordering 实例对象
     * @return 实例对象
     */
    Ordering update(Ordering ordering);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


    List<Ordering> queryAllByCustomerId(int customerId);

    Ordering newTestInstance();


    public void insertIntoOrdering() throws Exception;




}