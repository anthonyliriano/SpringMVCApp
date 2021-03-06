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
            <div class="card col-md-12">
                <div class="card-block">
                    <h4 class="card-title">
                        <a href="#" class="card-link"><span class="glyphicon glyphicon-arrow-up" aria-hidden="true"></span>
                        </a>
                        <a class="post-title" href="/post/view/${item.getPostId()}">
                            <c:out value="${item.getTitle()}"></c:out>
                        </a>
                    </h4>
                    <span class="card-subtitle text-muted col-md-8">
                          <%--Votes--%>
                            ${item.getVotes()} points by
                          <%--Creator--%>
                          <a href="/user/profile/${PostCreator.getUserByUserName(item.getAuthor()).getUserID()}">
                              ${item.getAuthor()}
                          </a>  on

                          <%--Date--%>
                          ${item.getLocalDateTime().getMonth()} ${item.getLocalDateTime().getDayOfMonth()},
                          <%--Time--%>
                          ${item.getLocalDateTime().getHour()}:${item.getLocalDateTime().getMinute()}
                    </span>
                    <div class="card-text col-md-10">
                        <c:out value="${item.getContent()}"></c:out>
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

