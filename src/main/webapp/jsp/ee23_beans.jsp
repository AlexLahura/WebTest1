<%@ page import="jsp.Person" %>
<%@ page import="java.io.StringReader" %><%--
  Created by IntelliJ IDEA.
  User: lahura7alex
  Date: 1/4/2023
  Time: 5:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <jsp:useBean id="run" class="jsp.MyThread" type="java.lang.Runnable">--%>

<%--    <% Person person1 = new Person(); %>--%>
<%--    <%  person1.setName("Max1"); %>--%>
<%--    <%= person1.getName(); %>--%>

    <%! String name = "Max New";%>

    <jsp:useBean id="person" class="jsp.Person" scope="application"/>
    <p>scope="page" бин будет видно только на этой странице</p>
    <p>scope="request" во бремя одного реквеста везде будет доступен этот бин(даже если форварднем на другую или заинклюдим)</p>
    <p>scope="session" бин будет использоваться на многих страничках в рамках одной сессии</p>
    <p>scope="application" на уровне приложения. ВЕЗДЕ</p>
    <p></p>


    <jsp:setProperty name="person" property="name" value="Max"/>
    <jsp:getProperty name="person" property="name"/>
    <br>
    <jsp:setProperty name="person" property="name" value="<%=name%>"/>
    <jsp:getProperty name="person" property="name"/>

<%--    <jsp:setProperty name="person" property="name" value="<%=request.getParameter("name")%>"/>--%>
<%--<jsp:getProperty name="person" property="name"/>--%>
<%--    если явно указать параметр в адресной строке http://localhost:8181/WebTest1_war/jsp/ee23_beans.jsp?name=Max--%>


<%--    <jsp:setProperty name="person" property="*"/>--%>
<%--&lt;%&ndash;    * СРАЗУ указывает все параметры&ndash;%&gt;--%>
<%--    <jsp:getProperty name="person" property="name"/>--%>
<%--    <jsp:getProperty name="person" property="age"/>--%>


    <jsp:useBean id="person1" class="jsp.Person" scope="session">
        <jsp:setProperty name="person1" property="name" value="Nikkolas again"/>
    </jsp:useBean>
    <br>
   <jsp:getProperty name="person1" property="name"/>
    <br>
    Когда проходим первый раз и бина не сущевствует, заходим в конструкцию и создеться.
    Но еслди на уровне сессии бин уже сущевствует, то в консрукцию не заходит






</body>
</html>
