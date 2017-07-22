<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="true" %>
<html>
<head>
    <title>Create Post</title>

    <%--Bootstrap--%>
    <!-- Latest compiled and minified CSS -->
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">--%>

    <link rel="stylesheet" href="/webjars/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">
    <!-- Optional theme -->
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">--%>

    <!-- Latest compiled and minified JavaScript -->
    <%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>--%>
    <style>

    </style>
</head>

<body>
<%--<div class="container-fluid">--%>
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
                <a class="nav-link" href="#">Link</a>
            </li>
        </ul>
    </div>
</nav>


<div class="container">
    <div class="row">
        <div class="col-md-8" style="margin-top: 10px;">

            <h2>Submit a Post</h2>

        <form:form method="post" action="/post/submit" modelAttribute="Post" id="postForm">

            <%--Post Title--%>
            <div class="form-group row">
                <label for="title" class="col-1 col-form-label ">Title</label>
                <div class="col-4">
                    <form:input path="title" class="form-control"  type="text" id="title" name="title" />
                </div>

            <%--Post Author--%>

                <label for="author" class="col-1 col-form-label">Author</label>
                <div class="col-4">
                    <form:input path="author" class="form-control" type="text" id="author" placeholder="John Doe"  />
                </div>
            </div>

            <%--Post Content--%>
            <div class="form-group">
                <label for="content">Content</label>
                <form:textarea path="content" class="form-control" id="content" rows="3"></form:textarea>
            </div>

            <input class="btn btn-primary" type="submit" value="Submit">

        </form:form>
        </div>
    </div>
</div>



<script src="/webjars/jquery/3.2.1/jquery.min.js"></script>
<script src="/webjars/tether/1.4.0/js/tether.min.js"></script>
<script src="/webjars/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>
<script src="/webjars/jquery-validation/1.16.0/jquery.validate.min.js"></script>
<script>
    $(document).ready(function () {

        $('#postForm').validate({
            rules: {
                title: {
                    minlength: 5,
                    required: true
                },
                author: {
                    minlength: 5,
                    required: true
                },
                content: {
                    minlength: 2,
                    required: true
                }
            },
            highlight: function (element) {
                $(element).closest('.control-group').removeClass('success').addClass('error');
            },
            success: function (element) {
                element.text('OK!').addClass('valid')
                    .closest('.control-group').removeClass('error').addClass('success');
            }
        });

    });
</script>


</body>
</html>