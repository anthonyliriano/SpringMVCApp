<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="true" %>
<html>
<head>
    <title>Home</title>

    <%--Main CSS--%>
    <link rel="stylesheet" href="/resources/css/main.css">

    <%--Bootstrap--%>
    <link rel="stylesheet" href="webjars/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">



    <style>

    </style>
</head>

<body>
<%--Navigation Menu--%>
<jsp:include page="templates/navbar.jsp" />

<div class="container">
    <div class="row">
        <form:form method="post" action="/login" class="form-signin" modelAttribute="User">
            <h3 class="form-signin-heading">Please sign in</h3>
            <h4><c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/></h4>
            
            <form:label path="" for="username">Username</form:label>
            <form:input path="username" id="username" cssClass="form-control"/>

            <form:label path="" for="password">Password</form:label>
            <form:password path="password" id="password" cssClass="form-control" />
            
            <input type="submit" class="btn btn-primary btn-block" name="submit" value="submit" />
        </form:form>
    </div>
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

</body>
</html>

