<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>

    <%--Main CSS--%>
    <link rel="stylesheet" href="/resources/css/main.css">

    <%--Bootstrap--%>
    <link rel="stylesheet" href="/webjars/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="/webjars/bootstrap-glyphicons/bdd2cbfba0/css/bootstrap-glyphicons.css">

    <style>

    </style>
</head>

<body>
<%--Navigation Menu--%>
<jsp:include page="templates/navbar.jsp" />

<div class="container">

    Whoops! Your request could not be processed. <br />
    ${Error}
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

</body>
</html>

