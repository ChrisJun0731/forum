<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<html>
    <head>
        <meta charset="utf-8">
        <title>用户注册</title>
        <script>

        </script>
    </head>
    <body>
        用户注册信息:
        <form action="register" method="post">
            <c:if test="${!empty errorMsg}">
                <div style="color=red">${errorMsg}</div>
            </c:if>
            <table border="1px" style="width:60%">
                <tr>
                    <td style="width:20%">用户名</td>
                    <td style="width:80%"><input type="text" name="userName"/></td>
                </tr>
                <tr>
                    <td style="width:20%">密码</td>
                    <td style="width:80%"><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td style="width:20%">密码确认</td>
                    <td style="width:80%"><input type="password" name="again"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="保存"/>
                        <input type="reset" value="重置"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>