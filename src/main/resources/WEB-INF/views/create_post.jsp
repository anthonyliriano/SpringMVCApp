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

<%--Navigation Menu--%>
<jsp:include page="templates/navbar.jsp" />


<div class="container">
    <div class="row">
        <div class="col-md-8" style="margin-top: 10px;">

            <h2>Submit a Post</h2>

        <form:form method="post" action="/post/submit" commandName="Post" id="postForm">

            <%--Post Title--%>
            <div class="form-group row">

                <form:label path="title" cssClass="col-1 col-form-label">Title</form:label>
                <div class="col-4">
                    <form:input path="title" cssClass="form-control"/>
                </div>

            <%--Post Author--%>

                <form:label path="author" cssClass="col-1 col-form-label">Author</form:label>
                <div class="col-4">
                    <form:input path="author" cssClass="form-control"  />
                </div>
            </div>

            <%--Post Content--%>
            <div class="form-group">
                <form:label path="content">Content</form:label>
                <form:textarea path="content" cssClass="form-control" rows="3"></form:textarea>
            </div>

            <input type="submit" class="btn btn-primary"  value="Submit">

        </form:form>
        </div>
    </div>
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

<%--Form Validation--%>
<script src="/webjars/jquery-validation/1.16.0/jquery.validate.min.js"></script>
<%--<script>--%>
    <%--$(document).ready(function () {--%>

        <%--$('#postForm').validate({--%>
            <%--rules: {--%>
                <%--title: {--%>
                    <%--minlength: 5,--%>
                    <%--required: true--%>
                <%--},--%>
                <%--author: {--%>
                    <%--minlength: 5,--%>
                    <%--required: true--%>
                <%--},--%>
                <%--content: {--%>
                    <%--minlength: 2,--%>
                    <%--maxlength: 400,--%>
                    <%--required: true--%>
                <%--}--%>
            <%--},--%>
            <%--highlight: function (element) {--%>
                <%--$(element).closest('.control-group').removeClass('success').addClass('error');--%>
            <%--},--%>
            <%--success: function (element) {--%>
                <%--element.text('OK!').addClass('valid')--%>
                    <%--.closest('.control-group').removeClass('error').addClass('success');--%>
            <%--}--%>
        <%--});--%>

    <%--});--%>
<%--</script>--%>


</body>
</html>