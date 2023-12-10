<%@ page import="az.company.services.MyService" %>
<%@ page import="az.company.services.MyService" %>
<%@ page import="az.company.entities.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: mr_ra
  Date: 10.12.2023
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    MyService myService = new MyService();
    List<User> users = myService.selectUsers();
    for (User user : users) { %>
<p><%= user.id() %>
    <%= user.name() %>
    <%= user.surname() %>
    <%= user.email() %>
</p>
<% }
%>


<h1>users</h1>
</body>
</html>
