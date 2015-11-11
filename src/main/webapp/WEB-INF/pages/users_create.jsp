<%--
  Created by IntelliJ IDEA.
  User: DCLab
  Date: 11/11/2015
  Time: 8:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create user</title>
</head>
<body>
    <form method="post" enctype="multipart/form-data">
        <span>Username</span><input id="username" name="username" type="text"><br>
        <span>Password</span><input id="password" name="password" type="password"><br>
        <span>Email</span><input id="email" name="email" type="text"><br>
        <span>Age</span><input id="age" name="age" type="text"><br>
        <span>Gender</span><input id="gender" name="gender" type="text"><br>
        <span>Photo</span><input id="image" name="image" type="file"><br>
        <button id="add_user" type="submit">Add User</button>
    </form>
</body>
</html>
