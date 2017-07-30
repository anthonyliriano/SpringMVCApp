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

    <style>

    </style>
    </head>

<body>
<%--Navigation Menu--%>
<jsp:include page="templates/navbar.jsp" />

    <div class="container">
        <%--For each Post create a col-md-10--%>
        <c:forEach items="${Post}" var="item">
        <div class="row">
            <div class="card col-md-10">
                <div class="card-block col-md-8">
                    <h4 class="card-title">
                        <a href="#" class="card-link"><span class="glyphicon glyphicon-arrow-up" aria-hidden="true"></span>
                        </a>
                        <a class="post-title" href="/post/view/${item.getPostId()}">
                            ${item.getTitle()}
                        </a>
                    </h4>
                    <span class="card-subtitle text-muted">
                          "X points.."  Submitted by ${item.getAuthor()} on ${item.getLocalDateTime().getMonth()}
                        ${item.getLocalDateTime().getDayOfMonth()},
                            ${item.getLocalDateTime().getHour()}:${item.getLocalDateTime().getMinute()}
                    </span>
                    <div class="card-text col-md-10" style="word-wrap: break-word;">
                            ${item.getContent()}
                    </div>

                </div>
            </div>
        </div>
        <%--End Post Iteration--%>
        </c:forEach>

    </div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

</body>
</html>

