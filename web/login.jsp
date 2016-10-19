<%-- 
    Document   : login
    Created on : Oct 20, 2016, 12:59:44 AM
    Author     : kouridis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="style.css" rel="stylesheet" type="text/css">
<title>Ski Equipment Advisor</title>
<body>
    <ul>
        <li><a href="/SkiAdvisor">Home</a></li>
        <li style="float:right"><a class="active" href="login.html">Login</a></li>
    </ul>
    <br><br>
    <div align="center">
        <div class="form">
            <h1 align="center">UTH Login</h1>
            <form  method="POST" action="Login.do">
                <label><b>Username</b></label>
                <input type="text" placeholder="Enter Username" name="username" required>
                
                <label><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="password" required>
                <button type="submit">Login</button>
            </form>
        </div>
    </div>
</body>
</html>

