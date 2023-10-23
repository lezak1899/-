package edu.lingnan.luckymall.interceptor;

import edu.lingnan.luckymall.modules.customer.entity.Customer;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        //获取sessiond的登陆信息loginBean
        HttpSession session = request.getSession();
        Customer loginBean = (Customer) session.getAttribute("loginBean");

        //判断session中是否有用户数据，如果有，则返回true，继续向下执行
        if (loginBean != null) {
            return true;
        }
        //不符合条件的给出提示信息，并转发到登录页面
        request.setAttribute("msg", "访问受限,请先登录！");


        request.getRequestDispatcher("/customer/toLogin").forward(request, response);
        request.setAttribute("msg", "你访问的页面需要先登陆才可以查看，请先登陆！");
        return false;
    }

}