<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020年05月10日 0010
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--1.声明类属性
    2.声明static静态代码块
    3.声明类方法
    4.声明内部类
    --%>

<%--1.声明类属性 --%>
    <%!
        private String a;
        private Integer b;
        private static Map<String,Object> map;
    %>
<%-- 2.声明static静态代码块 --%>
     <%!
        static {
            map = new HashMap<String,Object>();
            map.put("key1","1");
        }
     %>
<%-- 3.声明类方法 --%>

    <%!
        public void a(){
            System.out.println("jsp");
        }
    %>
<%-- 3.声明内部类 --%>
    <%!
        public static class A{
            private String a;
            private Integer b;
        }
    %>

<%--
    1.输出整型
    2.输出浮点型
    3.输出字符串
    4.输出对象
--%>
    <%=12%>
    <br>
    <%=12.2%>
    <br>
    <%="我是字符串"%>
    <br>
    <%=map%>
    <br>
    <%=request.getParameter("usernam")%>
<%--
    1.if语句
	2.for循环
	3....
--%>
    <%
        int aa = 10;
        if(aa > 9){
            System.out.println("输出数字"+aa);
        }
    %>
</body>
</html>
