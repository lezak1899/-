package edu.lingnan.eattingwhat2.controller;


import com.alibaba.fastjson.JSON;
import edu.lingnan.eattingwhat2.entity.*;
import edu.lingnan.eattingwhat2.service.DishesService;
import edu.lingnan.eattingwhat2.service.EvaluationService;
import edu.lingnan.eattingwhat2.service.OrderingService;
import edu.lingnan.eattingwhat2.service.StoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * (Evaluation)表控制层
 *
 * @author makejava
 * @since 2020-06-14 11:02:46
 */
@Controller
@RequestMapping("evaluation")
public class EvaluationController {
    /**
     * 服务对象
     */
    @Resource
    private EvaluationService evaluationService;

    @Resource
    private DishesService dishesService;

    @Resource
    private OrderingService orderingService;

    @Resource
    private StoreService storeService;

    @GetMapping("toEvaluationCheck")
    public String toEvaluationCheck(HttpSession session,Model model) {

        Customer loginBean = (Customer) session.getAttribute("loginBean");
        List<Evaluation> evaluationList= evaluationService.queryAllByCustomerId(loginBean.getId());


        model.addAttribute("evaluationList",evaluationList);


        return "pages/evaluation_check";
    }




    @GetMapping("toEvaluateOrdering")
    public String toEvaluateOrdering(Model model,int orderingId) {

        Ordering ordering = orderingService.queryById(orderingId);
        Store store = storeService.queryById(ordering.getStoreId());

        model.addAttribute("ordering",ordering);

        model.addAttribute("store",store);


        return "pages/ordering_evaluateOrdering";
    }

    //提交订单分2个步骤，第一个步骤上传图片，并将图片的新名字回调
    @ResponseBody
    @RequestMapping("/submitEvaluation1")
    public String submitEvaluation1(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {


        //设置图片上传路径,是目标文件夹的路径
        String filePath = "E:\\idea_workspace\\eattingwhat2\\target\\classes\\static\\upload";
        //String filePath = request.getSession().getServletContext().getRealPath("/static/upload");

        // 获取原始图片的扩展名
        String originalFilename = file.getOriginalFilename();

        //获取最后一个.的位置
        int lastIndexOf = originalFilename.lastIndexOf(".");
        //获取文件的后缀名 .jpg,从start开始到结束的字符串
        String suffix = originalFilename.substring(lastIndexOf);

        // 生成文件新的名字
        String newFileName = UUID.randomUUID().toString().replaceAll("-", "") + suffix;

        // 封装上传文件位置的全路径
        File targetFile = new File(filePath, newFileName);
        file.transferTo(targetFile);

        Map<String,String> map=new HashMap<>();
        map.put("image",newFileName);

        String data= JSON.toJSONString(map);

        return data;
    }

    @ResponseBody
    @RequestMapping("/submitEvaluation2")
    public String submitEvaluation2(@RequestBody Evaluation evaluation, HttpSession session) {

        if(evaluation.getEvaluation().length()<5){
            return "评价不能小于5个字哦！";
        }



        Customer loginBean=(Customer) session.getAttribute("loginBean");
        Date date = new Date();

        evaluation.setCustomerId(loginBean.getId());
        evaluation.setCustomerImage(loginBean.getImage());
        evaluation.setCustomerName(loginBean.getName());
        evaluation.setDate(date);


        Customer customer=(Customer)session.getAttribute("loginBean");

        Ordering ordering= orderingService.queryById(evaluation.getOrderingId());
        ordering.setOrderingState(3);
        orderingService.update(ordering);
        evaluationService.insert(evaluation);
        return "success";

    }

}