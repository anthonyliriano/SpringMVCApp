<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="true" %>
<html>
<head>
    <title>Create Post</title>

    <%--Main CSS--%>
    <link rel="stylesheet" href="/resources/css/main.css">

    <%--Boostrap--%>
    <link rel="stylesheet" href="/webjars/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">

</head>

<body>

<%--Navigation Menu--%>
<jsp:include page="templates/navbar.jsp" />


<div class="container">
    <div class="row">
        <div class="col-md-8" style="margin-top: 10px;">

            <h2>Submit a Post</h2>

        <form:form method="post" action="/post/submit/" commandName="Post" id="postForm" class="TEST">

            <%--Post Title--%>
            <div class="form-group row">

                <form:label path="title" cssClass="col-1 col-form-label">Title</form:label>
                <div class="col-6">
                    <form:input path="title" cssClass="form-control"/>
                </div>

                <form:label path="tags" cssClass="col-1 col-form-label">Tags</form:label>
                <div class="col-4">
                    <form:input path="tags" cssClass="form-control" placeholder="php,css,html"/>
                </div>

            <%--Post Author--%>
<%--                <form:label path="author" cssClass="col-1 col-form-label">Author</form:label>
                <div class="col-4">
                    <form:input path="author" cssClass="form-control"  />
                </div>--%>
            </div>

            <%--Post Content--%>
            <div class="form-group">
                <form:label path="content">Content</form:label>
                <form:textarea path="content" cssClass="form-control" rows="3"></form:textarea>
            </div>

            <%--Hidden Variables--%>
            <form:hidden path="postId" value="${Post.generateId()}"></form:hidden>
            <%--<form:hidden path="localDateTime" value="${Post.generateDate()}"></form:hidden>--%>


            <input type="submit" class="btn btn-primary"  value="Submit">

        </form:form>
        </div>
    </div>
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

<%--Form Validation--%>
<script src="/webjars/jquery-validation/1.16.0/jquery.validate.min.js"></script>
<script>
    $(document).ready(function () {

        $('#postForm').validate({
            rules: {
                title: {
                    minlength: 5,
                    maxlength: 30,
                    required: true
                },
                content: {
                    minlength: 50,
                    maxlength: 400,
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