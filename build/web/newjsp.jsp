<%-- 
    Document   : newjsp
    Created on : Dec 6, 2019, 7:41:54 PM
    Author     : ngochuu
--%>

<%@page import="huudn.dtos.UserDTO"%>
<%@page import="java.io.OutputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            response.setContentType("image/gif");
            OutputStream os = response.getOutputStream();
            os.write((byte[])session.getAttribute("avatar"));
            os.flush();
            os.close();
        %>
    </body>
</html>
