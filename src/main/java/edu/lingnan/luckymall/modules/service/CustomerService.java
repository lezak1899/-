package edu.lingnan.luckymall.modules.service;

import edu.lingnan.luckymall.modules.entity.Customer;

import java.util.List;

/**
 * (Customer)表服务接口
 *
 * @author makejava
 * @since 2020-06-14 11:02:45
 */
public interface CustomerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Customer queryById(Integer id);


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Customer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    Customer insert(Customer customer);

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    Customer update(Customer customer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


    /**
     * 通过手机号码登陆
     *
     * @param
     * @return 是否成功
     */
    Customer loginByPhone(String phone, String password);

    Customer getByName(String customerName);

    Customer getByPhone(String customerPhone);

}