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
        <div class="col-md-10">
            <div class="card">
                <div class="card-block">
                    <h4 class="card-title">
                        <a href="/post/view/${item.getPostId()}">
                            ${item.getTitle()}
                        </a>
                        <small>
                                ${item.getLocalDateTime().toLocalDate()}
                                ${item.getLocalDateTime().getHour()}:${item.getLocalDateTime().getMinute()}
                        </small>
                    </h4>
                    <h6 class="card-subtitle mb-2 text-muted">${item.getAuthor()}</h6>
                    <p class="card-text">${item.getContent()}</p>
                    <a href="#" class="card-link"><span class="glyphicon glyphicon-arrow-up" aria-hidden="true"></span>
                    </a>
                    <span>0</span>
                    <a href="#" class="card-link"><span class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span>
                    </a>
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

