package edu.lingnan.eattingwhat.modules.dao;

import edu.lingnan.eattingwhat.modules.entity.Evaluation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Evaluation)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-18 11:29:29
 */
@Mapper
@Repository
public interface EvaluationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Evaluation queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Evaluation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param evaluation 实例对象
     * @return 对象列表
     */
    List<Evaluation> queryAll(Evaluation evaluation);

    /**
     * 新增数据
     *
     * @param evaluation 实例对象
     * @return 影响行数
     */
    int insert(Evaluation evaluation);

    /**
     * 修改数据
     *
     * @param evaluation 实例对象
     * @return 影响行数
     */
    int update(Evaluation evaluation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}