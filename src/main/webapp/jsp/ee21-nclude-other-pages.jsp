<%--
  Created by IntelliJ IDEA.
  User: lahura7alex
  Date: 1/13/2023
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="temp.jsp"%>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <br/>%@include file="ee20page_directive.jsp"%  - препроцесорное, происходит на этапе компиляции

    <jsp:include page="temp.jsp"/>
    <br/>jsp:include page="temp.jsp" происходит на этапе реквеста. Что бі подключить переменные с другого файл надо
    использовать include file="temp.jsp", но лучше использовать jsp:include page="temp.jsp"
<%--    <%= i %>--%>
    <jsp:include page="/hello"/>
    <jsp:include page="/WEB-INF/text.txt"/>
    <br/> jsp:include page="/WEB-INF/text.txt" файлы которые инклюдим, лучше хранить в /WEB-INF/ эта папка не видна для браузера





</body>
</html>
