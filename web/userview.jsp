<%-- 
    Document   : userview
    Created on : Oct 20, 2016, 12:33:14 AM
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
        
        <li style="float:right"><form method="POST" action="Logout.do">
                                <input type="submit" value="Logout"/></form></li>
        <li style="float:right"><a href=""><%
              String username = (String) request.getAttribute("username");
              out.print(username);
        %></a></li>
    </ul>
    <br><br>
    <div align="center">
        <div class="form">
            <h1 align="center">Ski Equipment Advisor</h1>
            <form  method="POST" action="SelectSki.do">
                <label for="level">Select Level</label>
                <select id="level" name="level">
                    <option value="beginner">Beginner</option>
                    <option value="intermediate">Intermediate</option>
                    <option value="experienced">Experienced</option>
                </select> 
                <br><br>
                <input type="submit" value="Submit">
            </form>
        </div>
    </div>
</body>
</html>
