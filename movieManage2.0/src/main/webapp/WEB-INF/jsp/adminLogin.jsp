<%--
  Created by IntelliJ IDEA.
  User: swmmmm
  Date: 2019/6/14
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path =request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/login.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-offset-3 col-md-6">
            <form class="form-horizontal" id="loginForm" >
                <fmt:bundle basename="login"/>
                <span class="head"><fmt:message key="header"/> <%--管理员登录--%></span>
                <div class="form-group">
                    <fmt:message key="username" var="username"/>
                    <input type="text" id="username" name="username" class="form-control" placeholder="${username}">
                </div>
                <div class="form-group">
                    <fmt:message key="password" var="password"/>
                    <input type="password" id="password" name="password" class="form-control" placeholder="${password}">
                </div>
                <div class="form-group">
                    <button id="loginBtn" class="btn btn-info"  type="button" onclick="login()"><fmt:message key="btn"/> <%--登录--%></button><br>
                    <a href="/?l=en_US">English</a>  |  <a href="/?l=zh_CN">中文</a>
                </div>
            </form>
        </div>
    </div>
</div>
<script type="text/javascript" src="<%=basePath%>static/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>static/js/bootstrap.js"></script>
<script type="text/javascript">
    function login() {
        $.post("/login",$("#loginForm").serialize(),function (data) {

            if (data==2){
                alert("登录成功");
                location.href="/movie";
            }else{
                alert(data);
            }
        });
    };
</script>
</body>
</html>
