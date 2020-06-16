package edu.lingnan.eattingwhat2.service.impl;

import edu.lingnan.eattingwhat2.entity.Ordering;
import edu.lingnan.eattingwhat2.dao.OrderingDao;
import edu.lingnan.eattingwhat2.service.OrderingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Ordering)表服务实现类
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@Service("orderingService")
public class OrderingServiceImpl implements OrderingService {
    @Resource
    private OrderingDao orderingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Ordering queryById(Integer id) {
        return this.orderingDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Ordering> queryAllByLimit(int offset, int limit) {
        return this.orderingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ordering 实例对象
     * @return 实例对象
     */
    @Override
    public Ordering insert(Ordering ordering) {
        this.orderingDao.insert(ordering);
        return ordering;
    }

    /**
     * 修改数据
     *
     * @param ordering 实例对象
     * @return 实例对象
     */
    @Override
    public Ordering update(Ordering ordering) {
        this.orderingDao.update(ordering);
        return this.queryById(ordering.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.orderingDao.deleteById(id) > 0;
    }

    @Override
    public List<Ordering> queryAllByCustomerId(int customerId) {
        Ordering ordering=new Ordering();
        ordering.setUserId(customerId);
        return orderingDao.queryAllByDesc(ordering);
    }
}