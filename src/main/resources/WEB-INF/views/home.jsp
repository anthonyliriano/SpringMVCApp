<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<html>
    <head>
        <title>Home</title>

        <%--Bootstrap--%>
        <link rel="stylesheet" href="webjars/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">

    <style>

    </style>
    </head>

<body>
    <nav class="navbar navbar-toggleable-md bg-inverse">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="/">Navbar</a>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/createpost/">Submit a Post <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/">Link</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="container">
        <div class="col-md-10">
            <div class="card">
                <div class="card-block">
                    <h4 class="card-title">Post 1,000</h4>
                    <h6 class="card-subtitle mb-2 text-muted">The 10,000 post?</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="card-link">Upvote</a>
                    <a href="#" class="card-link">Downvote</a>
                </div>
            </div>
        </div>

    </div>



<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
<script src="webjars/tether/1.4.0/js/tether.min.js"></script>
<script src="webjars/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>
</body>
</html>

