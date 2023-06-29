<%--
  Created by IntelliJ IDEA.
  User: lahura7alex
  Date: 1/13/2023
  Time: 5:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:forward page="temp.jsp"></jsp:forward>
    различие между форвардом и редиректом, что форвад перенаправляет сразу на другую страницу(ничего не отправляем браузеру)
    режирект же стачала отправляет 302 статус в браузер, а он в свою очередб перенаправляет на нужную страницу
</body>
</html>
