<%@ page import="java.util.Date" %>
<%@ page import="jsp.JSPHelper" %><%--
  Created by IntelliJ IDEA.
  User: lahura7alex
  Date: 12/30/2022
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<br>
<h1 class = alert >JSP</h1>
<%-- hello world--%>
<!--comment-->

</br>
Тип кода declaration !, обьявляем переменные/методы
<%! int i = 5; %>
<%! private  void doJob(){
    System.out.println("Hello");
}%>

</br>
Expression = выражение в JAVA которое должно возвращать Стринг, или каким то образом превращаться в стирнгу.
<%= "Hello World"%>
</br>
<%= i + 1 + 2%>
</br>
<%= new Date()%>
</br>
<%= JSPHelper.minus(5,4)%>

</br>Скриплет, там где можно писать код
<%
    class Student{
        public Student(String name) {
            this.name = name;
        }

        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
%>
<%if(Math.random()>0.5) {%>
    </br>
    hello multi line scriptlet
   <% } %>


</body>
</html>
