<%-- 
    Document   : logout
    Created on : Mar 30, 2017, 4:32:38 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OES</title>
    </head>
    <body>
        <% session.invalidate();
          response.sendRedirect("index.jsp");%>
    </body>
</html>
