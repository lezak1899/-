package edu.lingnan.eattingwhat2.controller;

import edu.lingnan.eattingwhat2.entity.Dishes;
import edu.lingnan.eattingwhat2.service.DishesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Dishes)表控制层
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@RestController
@RequestMapping("dishes")
public class DishesController {
    /**
     * 服务对象
     */
    @Resource
    private DishesService dishesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Dishes selectOne(Integer id) {
        return this.dishesService.queryById(id);
    }

}