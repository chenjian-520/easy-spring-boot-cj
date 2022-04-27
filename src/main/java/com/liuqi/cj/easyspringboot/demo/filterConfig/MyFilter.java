package com.liuqi.cj.easyspringboot.demo.filterConfig;/**
 * @author John
 * @since 2022/4/27 21:59
 */

import javax.servlet.FilterConfig;
import javax.servlet.*;
import java.io.IOException;

/**
 * @author cj
 * @version 1.0
 * @since 2022/4/27 21:59
 * 解释： @WebFilter注解 filterName属性表示filter的名称，urlPatter表示要拦截的URL资源，可以是一个或者多个。
 * 两张方法配置 方法一使用注解  @WebFilter 配置   第二种  配置类  filterConfig
 */
//@Order(0)
//@WebFilter(filterName = "myFilter", urlPatterns = {"/*"})
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化过滤器:MyFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入目标资源之前先干点啥");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("处理一下服务端返回的response");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器被销毁了");
    }
}
