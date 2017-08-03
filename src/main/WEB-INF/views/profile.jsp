<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<html>
<head>
    <title>Profile</title>

    <%--Main CSS--%>
    <link rel="stylesheet" href="/resources/css/main.css">

    <%--Bootstrap--%>
    <link rel="stylesheet" href="/webjars/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="/webjars/bootstrap-glyphicons/bdd2cbfba0/css/bootstrap-glyphicons.css">

</head>

<body>
<%--Navigation Menu--%>
<jsp:include page="templates/navbar.jsp" />

<div class="container">
    <div class="row">
        <div class="col-12 col-md-auto">
            <img src="/resources/images/blank_image.svg" class="rounded float-left" alt="...">
        </div>
        <div class="col-4">
            ${User.getUsername()} <br/>
        </div>
    </div>
    <div class="row">
        <div class="col-12">
            <%--Will serve to display the last 5 posts--%>
            <table class="table">
            <thead>
            <tr>
                <th>Points</th>
                <th>Title</th>
                <th>Content</th>
                <th>Date</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row"></th>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            </tbody>
            </table>
        </div>
    </div>
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

</body>
</html>
