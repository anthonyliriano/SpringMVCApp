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

            <label for="inputUsername" class="sr-only">Username</label>
            <input type="text" path="username" id="inputUsername" class="form-control" placeholder="Username" />

            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" path="password" id="inputPassword" class="form-control" placeholder="Password" />

            <button class="btn btn-primary btn-block" type="submit">Sign in</button>
        </form:form>
    </div>
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

</body>
</html>

