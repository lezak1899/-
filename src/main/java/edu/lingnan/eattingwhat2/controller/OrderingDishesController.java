package edu.lingnan.eattingwhat2.controller;

import edu.lingnan.eattingwhat2.entity.OrderingDishes;
import edu.lingnan.eattingwhat2.service.OrderingDishesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OrderingDishes)表控制层
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@RestController
@RequestMapping("orderingDishes")
public class OrderingDishesController {
    /**
     * 服务对象
     */
    @Resource
    private OrderingDishesService orderingDishesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrderingDishes selectOne(Integer id) {
        return this.orderingDishesService.queryById(id);
    }

}