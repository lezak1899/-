package edu.lingnan.eattingwhat.controller;

import edu.lingnan.eattingwhat.entity.OrderingDishes;
import edu.lingnan.eattingwhat.service.OrderingDishesService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private OrderingDishesService orderingDishesService;


}