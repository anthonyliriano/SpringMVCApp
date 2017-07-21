<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <nav class="navbar navbar-toggleable-md navbar-inverse bg-primary">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="/">Navbar</a>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/post/create">Submit a Post <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/">Link</a>
                </li>
            </ul>
        </div>
    </nav>
<%--End Navigation Menu--%>

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


<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
<script src="webjars/tether/1.4.0/js/tether.min.js"></script>
<script src="webjars/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>
</body>
</html>

