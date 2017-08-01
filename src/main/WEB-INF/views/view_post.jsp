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
                    ${Post.getTitle()}</h3>
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
                ${Post.getContent()}
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8 tags">

                <span class="badge badge-default">${Post.getTags()}</span>
        </div>
    </div>
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

</body>
</html>

