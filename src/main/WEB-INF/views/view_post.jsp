<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<html>
<head>
    <title>Home</title>

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
        <div class="col-md-12">
            <div class="page-header">

                <h3>
                    <span>
                    <a href="#" class="card-link"><span class="glyphicon glyphicon-arrow-up" aria-hidden="true"></span>
                    </a>
                </span>
                    <c:out value="${Post.getTitle()}"></c:out>
                </h3>
                <small class="small text-muted">
                    "X points.."  Submitted by ${Post.getAuthor()} on ${Post.getLocalDateTime().getMonth()}
                    ${Post.getLocalDateTime().getDayOfMonth()},
                    ${Post.getLocalDateTime().getHour()}:${Post.getLocalDateTime().getMinute()}
                </small>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="page-header">
                <c:out value="${Post.getContent()}"></c:out>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8 tags">
            <c:forEach var="tag" items="${Post.getTags().split(',')}">
                <span class="badge badge-default">
                   ${tag}
                </span>
            </c:forEach>
        </div>
    </div>
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

</body>
</html>

