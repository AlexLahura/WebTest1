<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello">Hello Servlet</a>
<br/>
<a href="liveCycle">Hello LiveCycle Method</a>
<br/>
<a href="temp">Temp Method</a>
<br/>
<a href="temp_two?one=hello&one=world&two=again&abc=bitch">Temp_Two Method</a>
<br/>
<a href="temp_three">Temp_Three Method</a>
<br/>
<a href="ee_nine">EE 9 Method</a>
<br/>
<a href="ee_ten">EE 10 Method</a>
<br/>
<a href="ee_11gzip">EE 11 Gzip</a>
<br/>
<a href="ee_12status">EE 12 Status</a>
<br/>
<a href="cookies">EE 13 Cookies</a>
<br/>
<a href="ee_14session">EE 14 Session</a>
<br/>
<a href="ee_15sync">EE 15 Sync Servlet</a>
<br/>
<a href="jsp/temp.jsp">EE 17 JSP 2 Java код на JSP странице</a>
<br/>
<a href="jsp/ee19_override_variable.jsp">EE 19 JSP 4 Предопределенные переменные</a>
<br/>
<a href="jsp/ee20-page_directive.jsp">EE 20 JSP 5 Page directive</a>
<br/>
<a href="jsp/ee21-nclude-other-pages.jsp">EE 21 JSP 6 Включение других JSP стриниц в главную страницу</a>
<br/>
<a href="jsp/ee22-jsp7-redirect-action.jsp">Java EE 22: JSP 7: перенаправление запроса</a>
<br/>
<a href="jsp/ee23_beans.jsp">EE 23 JSP 8 Beans</a>
<br/>
<a href="mycontroller">EE 24, JSP 9 MVC</a>
<br/>
<a href="ee25_expression_language_controller">EE 25, JSP 10 Expression Language</a>
<br/>
<a href="ee26-context">Java EE 26: JSP 11: Servlet Context</a>
<br/>
<a href="ee26-other">Java EE 26: JSP 11: Other</a>

<br/>
<a href="jsp/ee27-init.jsp">Java EE 27: JSP 12: JSP инициализация</a>

</body>
</html>