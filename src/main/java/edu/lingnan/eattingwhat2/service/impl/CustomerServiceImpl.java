package edu.lingnan.eattingwhat2.service.impl;

import edu.lingnan.eattingwhat2.entity.Customer;
import edu.lingnan.eattingwhat2.dao.CustomerDao;
import edu.lingnan.eattingwhat2.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Customer)表服务实现类
 *
 * @author makejava
 * @since 2020-06-14 11:02:45
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao customerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Customer queryById(Integer id) {
        return this.customerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Customer> queryAllByLimit(int offset, int limit) {
        return this.customerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    @Override
    public Customer insert(Customer customer) {
        this.customerDao.insert(customer);
        return customer;
    }

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    @Override
    public Customer update(Customer customer) {
        this.customerDao.update(customer);
        return this.queryById(customer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.customerDao.deleteById(id) > 0;
    }

    @Override
    public Customer loginByPhone(String phone, String password) {
        return customerDao.loginByPhone(phone,password);
    }

    @Override
    public Customer getByName(String customerName) {
        Customer customer = new Customer();
        customer.setName(customerName);
        List<Customer> list=customerDao.queryAll(customer);
        if(list.size()==0)
            return null;
        else
            return list.get(0);

    }

    @Override
    public Customer getByPhone(String customerPhone) {
        Customer customer = new Customer();
        customer.setName(customerPhone);
        List<Customer> list=customerDao.queryAll(customer);
        if(list.size()==0)
            return null;
        else
            return list.get(0);
    }
}