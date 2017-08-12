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
            <img src="/resources/images/no-avatar.png" class="rounded float-left" alt="...">
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
                <th>Tags</th>
                <th>Date</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="post" items="${UserPost}">
                <tr>
                    <th scope="row">${post.getVotes()}</th>
                    <td>${post.getTitle()}</td>
                    <td>${post.getTags()}</td>
                    <td>${post.getLocalDateTime().toString()}</td>
                </tr>
            </c:forEach>

            </tbody>
            </table>
        </div>
    </div>
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

</body>
</html>
