package com.zhang.servlet;

import com.sun.deploy.net.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ContextServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //默认编码 ISO-8859-1
        System.out.println(resp.getCharacterEncoding());
        //设置服务器编码为UTF-8，浏览器编码不一致也会乱码
        //resp.setCharacterEncoding("UTF-8");
        //通过响应头设置浏览器编码也为UTF-8
        //resp.setHeader("Content-Type","text/html;charset=utf-8");

        //resp.setContentType("text/html;charset=utf-8");
        System.out.println("转换编码之后："+resp.getCharacterEncoding());
        PrintWriter writer = resp.getWriter();
        writer.write("好好学习");
    }
}
