<%@ page import="mvc_ee24.Student" %><%--
  Created by IntelliJ IDEA.
  User: lahura7alex
  Date: 1/8/2023
  Time: 10:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<%= ((Student)request.getAttribute("Student")).getName(); %>--%>

    <jsp:useBean id="Student" class="mvc_ee24.Student" scope="request"/>
    <%--    <jsp:useBean id="Student" class="mvc_ee24.Student" scope="session" />--%>
    <%--    <jsp:useBean id="Student" class="mvc_ee24.Student" scope="application" />--%>
    <jsp:getProperty name="Student" property="name"/>

</body>
</html>
