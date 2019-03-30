<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register form</title>
</head>
<body>
<form action="register" method="post">
    <h2>Provide all the fields for registration</h2>
    <label>Username: <input type="text" name="name" id="name" required/></label><br/>
    <label>Password: <input type="password" name="pass" id="pass" required/></label><br/>
    <label>Confirm Password: <input type="password" name="cPass" id="confirmPass" required/></label><br/>
    <label>Email: <input type="email" name="mail" id="mail" pattern=".+@.+\..+" required/></label><br/><br/>
    <input type="submit" value="Registration"/>
</form>
If you are registered user, please <a href="login.jsp">login</a>.
</body>
</html>