<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
    
        <form method="post" action="form">
            <label for="name">Lastname : </label>
            <input type="text" id="lastname" name="lastname" />
            </br>
             <label for="login">Firstname : </label>
            <input type="text" id="firstname" name="firstname" />
            <p>   
            <input type="submit" />
            </p>
        </form>
        <ul>
            <c:forEach var="user" items="${ users }">
                <li><c:out value="${ user.firstname }" /> <c:out value="${ user.lastname }" /></li>
            </c:forEach>
        </ul>   

   
    </body>
</html>
