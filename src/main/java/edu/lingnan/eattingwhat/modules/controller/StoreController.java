package edu.lingnan.eattingwhat.modules.controller;


import edu.lingnan.eattingwhat.modules.entity.Dishes;
import edu.lingnan.eattingwhat.modules.entity.Evaluation;
import edu.lingnan.eattingwhat.modules.entity.Store;
import edu.lingnan.eattingwhat.modules.service.DishesService;
import edu.lingnan.eattingwhat.modules.service.EvaluationService;
import edu.lingnan.eattingwhat.modules.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * (Store)表控制层
 *
 * @author makejava
 * @since 2020-06-14 11:02:47
 */
@Controller
@RequestMapping("store")
public class StoreController {
    /**
     * 服务对象
     */
    @Autowired
    private StoreService storeService;

    @Autowired
    private DishesService dishesService;

    @Autowired
    private EvaluationService evaluationService;




    @GetMapping("toStreet")
    public String toLogin(Model model) {
        List<Store> allStore = storeService.queryAll(null);
        model.addAttribute("allStore", allStore);
        return "store_street";
    }

    @GetMapping("enterStoreBystoreId")
    public String enterStoreBystoreId(int storeId,Model model) {

        //店铺实体类，用于展示店铺信息
        Store store=storeService.queryById(storeId);
        model.addAttribute("store", store);
        //菜单列别
        List<Dishes> dishes=dishesService.queryAllByStoreId(storeId);
        model.addAttribute("dishes", dishes);
        //评价列表evaluationList

        List<Evaluation> evaluationList =evaluationService.queryAllByStoreId(storeId);
        model.addAttribute("evaluationList",evaluationList);


        //System.out.println(this.getClass().getName()+"::::123");
        return "store_detail";
    }

    @GetMapping("suggestByStr")
    @ResponseBody
    public List<Store> suggestByStr(String str) {


        if(str=="") return  null;


        List<Store> list = storeService.selectByNameLike(str);


        return list;

    }

    @RequestMapping("/search")
    public String search(String storeNameLike,Model model) {
        List<Store> list = storeService.selectByNameLike(storeNameLike);
        model.addAttribute("allStore", list);
        return "store_street";
    }



}