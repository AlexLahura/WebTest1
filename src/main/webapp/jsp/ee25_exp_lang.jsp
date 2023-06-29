<%--
  Created by IntelliJ IDEA.
  User: lahura7alex
  Date: 1/10/2023
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page isELIgnored="true" %>--%>
<html>
<head>
    <title>Title</title>
</head>
</br>
    \${stud.name}
    ${stud.name}
</br>
    \${stud["name"]}
    ${stud["name"]}
</br>
    \${stud.age}
    ${stud.age}
</br>
    \${stud["age"]}
    ${stud["age"]}
</br>
    \${requestScope.stud.name}
    ${requestScope.stud.name}
</br>
    \${requestScope.stud.age}
    ${requestScope.stud.age}
</br>
    \${sessionScope.stud.name}
    ${sessionScope.stud.name}
</br>
    \${applicationScope.stud.name}
    ${applicationScope.stud.name}
</br>
    \${list[0]}
    ${list[0]}
</br>
    \${list[1]}
    ${list[1]}
</br>
    \${map["one"]}
    ${map["one"]}
    \${map.two}
    ${map.two}
    \${1+2*3/2}
    ${1+2*3/2}
    \${map.two == 2}
    ${map.two == 2}
    \${map.two > 1}
    ${map.two > 1}
    \${map.two != 1 ? "one" : "two"}
    ${map.two != 1 ? "one" : "two"}

    <jsp:setProperty name="stud" property="name" value="${Mr}.${Max}"/>
    \${1,2,3,}
    \%@ page isELIgnored="true" %> если в ипорте jsp страницы поставить это выражение то экспрес ленгвичь не будет компилироваться


<br/>
    jsp-config>
<br/>jsp-property-group>
            <br/>url-pattern>/jsp/*jsp/url-pattern>
            <br/>el-ignored>true<br/>/el-ignored> Если в файле web.xml поставить переключатель на true, то не будут работать на всех страничках
<br/>/jsp-property-group>

<br/>jsp-property-group>
<br/>url-pattern>*.jsp /url-pattern>
<br/>scripting-invalid>false /scripting-invalid>Если в файле web.xml поставить переключатель на true, то не будут работать Java code
<br/>/jsp-property-group>
<br/>/jsp-config>

<br/>
    \${cookie.JSESSIONID}
<br/>
<br/>${cookie.get(JSESSIONID).name}
<br/>\${header.}
<br/>\${param}
<br/>\${paramValues}


</body>
</html>
