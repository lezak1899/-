package edu.lingnan.eattingwhat2.service.impl;

import edu.lingnan.eattingwhat2.entity.Dishes;
import edu.lingnan.eattingwhat2.dao.DishesDao;
import edu.lingnan.eattingwhat2.service.DishesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dishes)表服务实现类
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@Service("dishesService")
public class DishesServiceImpl implements DishesService {
    @Resource
    private DishesDao dishesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Dishes queryById(Integer id) {
        return this.dishesDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Dishes> queryAllByLimit(int offset, int limit) {
        return this.dishesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dishes 实例对象
     * @return 实例对象
     */
    @Override
    public Dishes insert(Dishes dishes) {
        this.dishesDao.insert(dishes);
        return dishes;
    }

    /**
     * 修改数据
     *
     * @param dishes 实例对象
     * @return 实例对象
     */
    @Override
    public Dishes update(Dishes dishes) {
        this.dishesDao.update(dishes);
        return this.queryById(dishes.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dishesDao.deleteById(id) > 0;
    }

    @Override
    public List<Dishes> queryAllByStoreId(int storeId) {

        Dishes dishes =new Dishes();
        dishes.setStoreId(storeId);

        return dishesDao.queryAll(dishes);
    }

    @Override
    public List<Dishes> queryAllByOrderingId(int orderingId) {
        Dishes dishes =new Dishes();
        dishes.setStoreId(orderingId);
        return dishesDao.queryAll(dishes);
    }
}