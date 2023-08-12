package edu.lingnan.eattingwhat.modules.service.impl;

import edu.lingnan.eattingwhat.modules.entity.Store;
import edu.lingnan.eattingwhat.modules.dao.StoreDao;
import edu.lingnan.eattingwhat.modules.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Store)表服务实现类
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@Service("storeService")
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreDao storeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Store queryById(Integer id) {
        return this.storeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Store> queryAllByLimit(int offset, int limit) {
        return this.storeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param store 实例对象
     * @return 实例对象
     */
    @Override
    public Store insert(Store store) {
        this.storeDao.insert(store);
        return store;
    }

    /**
     * 修改数据
     *
     * @param store 实例对象
     * @return 实例对象
     */
    @Override
    public Store update(Store store) {
        this.storeDao.update(store);
        return this.queryById(store.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.storeDao.deleteById(id) > 0;
    }

    @Override
    public List<Store> queryAll(Store store) {
        return storeDao.queryAll(store);
    }

    @Override
    public List<Store> selectByNameLike(String storeNameStr) {
        return storeDao.selectByNameLike(storeNameStr);
    }
}