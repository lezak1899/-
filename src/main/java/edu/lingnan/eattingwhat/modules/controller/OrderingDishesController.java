package edu.lingnan.eattingwhat.modules.controller;

import edu.lingnan.eattingwhat.modules.service.OrderingDishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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