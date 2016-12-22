<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <title>用户登录</title>
        <meta charset="utf-8">
    </head>
    <body>
        <form action="./login" method="post">
            <label for="userName">用户名：</label>
            <input type="text" name="userName" id="userName"/><br/>
            <label for="password">密码：</label>
            <input type="password" name="password" id="password"/><br/>
            <input type="submit" value="登录"/>
        </form>
    </body>
</html>
