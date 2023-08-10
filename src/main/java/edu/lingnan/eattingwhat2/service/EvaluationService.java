package edu.lingnan.eattingwhat.service;

import edu.lingnan.eattingwhat.entity.Dishes;
import edu.lingnan.eattingwhat.entity.Evaluation;
import java.util.List;

/**
 * (Evaluation)表服务接口
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
public interface EvaluationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Evaluation queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Evaluation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param evaluation 实例对象
     * @return 实例对象
     */
    Evaluation insert(Evaluation evaluation);

    /**
     * 修改数据
     *
     * @param evaluation 实例对象
     * @return 实例对象
     */
    Evaluation update(Evaluation evaluation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<Evaluation> queryAllByCustomerId(int customerId);

    List<Evaluation> queryAllByStoreId(int storeId);






}