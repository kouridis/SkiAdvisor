<%-- 
    Document   : result
    Created on : Oct 12, 2016, 1:46:31 AM
    Author     : kouridis
--%>

<%@ page import="java.util.*" %>

<html>
<link href="style.css" rel="stylesheet" type="text/css">
<body>
    <ul>
        <li><a href="/SkiAdvisor">Home</a></li>
        <%String username = (String) request.getAttribute("username");
        if (username != null) { %>
            <li style="float:right"><form method="POST" action="Logout.do">
                                    <input type="submit" value="Logout"/></form></li>
            <li style="float:right"><a href=""><%out.print(username);%></a></li>
        <%} else { %>
            <li style="float:right"><a class="active" href="login.jsp">Login</a></li>
        <%}%>
    </ul>
    <br><br>
    <div align="center">
        <div class="result">
            <h1 align="center">Ski Equipment Recommendations</h1>
            <%
              List styles = (List) request.getAttribute("styles");
              String level = (String) request.getAttribute("level");
              out.print("For a/an " + level + ":");
              out.print("<br/>");
              Iterator it = styles.iterator();
              while(it.hasNext()) {
                out.print("<br>o " + it.next());
              }
            %>
            <br><br>
            <form action="/SkiAdvisor/">
                <input type="submit" value="Back" />
            </form>
        </div>
    </div>
</body>
</html>