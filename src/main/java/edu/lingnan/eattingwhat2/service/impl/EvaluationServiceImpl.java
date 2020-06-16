package edu.lingnan.eattingwhat2.service.impl;

import edu.lingnan.eattingwhat2.entity.Evaluation;
import edu.lingnan.eattingwhat2.dao.EvaluationDao;
import edu.lingnan.eattingwhat2.service.EvaluationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Evaluation)表服务实现类
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@Service("evaluationService")
public class EvaluationServiceImpl implements EvaluationService {
    @Resource
    private EvaluationDao evaluationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Evaluation queryById(Integer id) {
        return this.evaluationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Evaluation> queryAllByLimit(int offset, int limit) {
        return this.evaluationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param evaluation 实例对象
     * @return 实例对象
     */
    @Override
    public Evaluation insert(Evaluation evaluation) {
        this.evaluationDao.insert(evaluation);
        return evaluation;
    }

    /**
     * 修改数据
     *
     * @param evaluation 实例对象
     * @return 实例对象
     */
    @Override
    public Evaluation update(Evaluation evaluation) {
        this.evaluationDao.update(evaluation);
        return this.queryById(evaluation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.evaluationDao.deleteById(id) > 0;
    }
}