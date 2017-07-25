<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<html>
    <head>
        <title>Home</title>

        <%--Main CSS--%>
        <link rel="stylesheet" href="/resources/css/main.css">

        <%--Bootstrap--%>
        <link rel="stylesheet" href="/webjars/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">



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
                    <h4 class="card-title">${item.getTitle()}</h4>
                    <h6 class="card-subtitle mb-2 text-muted">${item.getAuthor()}</h6>
                    <p class="card-text">${item.getContent()}</p>
                    <a href="#" class="card-link">Upvote</a>
                    <a href="#" class="card-link">Downvote</a>
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

