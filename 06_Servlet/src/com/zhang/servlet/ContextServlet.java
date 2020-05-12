package com.zhang.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext1 = getServletConfig().getServletContext();
        ServletContext servletContext = getServletContext();
        System.out.println("context-param的参数值是："+servletContext1.getInitParameter("namespaceContext"));
        System.out.println("context-param的参数值是："+servletContext.getInitParameter("namespaceContext"));

        //获取当前工程路径
        System.out.println("获取当前工程路径:"+servletContext.getContextPath());

        //获取工程部署后在服务器硬盘上的绝对路径
        /**
         * / 表示服务器解析的地址为：http://ip:port/工程名/  映射到idea代码的web目录
         */
        System.out.println("获取工程部署路径:"+servletContext.getRealPath("/"));

    }
}
