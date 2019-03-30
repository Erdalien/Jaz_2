<%--
  Created by IntelliJ IDEA.
  User: Erdalien
  Date: 30.03.2019
  Time: 09:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login with username and password</h2>
<form action="login" method="post">
    <label>Username<input type="text" name="name" id="name" required/></label><br/>
    <label>Password<input type="password" name="pass" id="pass" required/></label><br/>
    <input type="submit" value="Login"/>
</form>
If you are new user, please <a href="index.jsp">register</a>.
</body>
</html>