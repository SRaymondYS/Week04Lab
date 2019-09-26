<%-- 
    Document   : login
    Created on : Sep 26, 2019, 9:10:33 AM
    Author     : 794471
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            Username: <input type="text" name="username">
            <br>
            Password: <input type="text" name="password">
            <br>
            <input type="submit" value="Log in">
        </form>
    </body>
</html>
