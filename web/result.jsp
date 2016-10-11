<%-- 
    Document   : result
    Created on : Oct 12, 2016, 1:46:31 AM
    Author     : kouridis
--%>

<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Ski Equipment Recommandation JSP View</h1>
<p>

<%
  List styles = (List) request.getAttribute("styles");
  Iterator it = styles.iterator();
  while(it.hasNext()) {
    out.print("<br>try: " + it.next());
  }
%>

</body>
</html>