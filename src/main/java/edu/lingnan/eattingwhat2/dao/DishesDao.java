package edu.lingnan.eattingwhat2.dao;

import edu.lingnan.eattingwhat2.entity.Dishes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Dishes)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@Mapper
@Repository
public interface DishesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dishes queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Dishes> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dishes 实例对象
     * @return 对象列表
     */
    List<Dishes> queryAll(Dishes dishes);

    /**
     * 新增数据
     *
     * @param dishes 实例对象
     * @return 影响行数
     */
    int insert(Dishes dishes);

    /**
     * 修改数据
     *
     * @param dishes 实例对象
     * @return 影响行数
     */
    int update(Dishes dishes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}