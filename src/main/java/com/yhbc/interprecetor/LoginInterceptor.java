package com.yhbc.interprecetor;

import com.silverbox.entity.Administrator;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fyj
 * @version v1.0.0
 * @date 2017-10-30 11:33
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // 1、拦截请求url
        // 2、从cookie中取token
        // 3、如果没有toke跳转到登录页面。
        // 4、取到token，需要调用sso系统的服务查询用户信息。
        Administrator admin = null;//userService.getUserByToken(request, response);
        // 5、如果用户session已经过期，跳转到登录页面
        if (admin == null) {
//            response.sendRedirect("");
//            return false;
        }
        // 6、如果没有过期，放行。
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }
}
