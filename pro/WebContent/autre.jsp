<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
    <h1>You're redirected from the other page </h1>
    <c:if test="${ !empty sessionScope.name && !empty sessionScope.login}">
            <p>Hi ${sessionScope.name} you are connected as ${ sessionScope.login } ! </p>
    </c:if>
       
    </body>
</html>
