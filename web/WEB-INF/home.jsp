<%-- 
    Document   : home
    Created on : Sep 26, 2019, 9:10:39 AM
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
        <h1>Home Page</h1>
        <h3>Hello ${showUser}.</h3>
        <a href="login?logout">Log out</a>
    </body>
</html>
