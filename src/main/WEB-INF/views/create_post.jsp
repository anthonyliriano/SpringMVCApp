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
            <div class="form-group row" style="min-height:68px;">

                <form:label path="title" cssClass="col-1 col-form-label">Title</form:label>
                <div class="col-6">
                    <form:input path="title" cssClass="form-control"/>
                    <div class="form-control-feedback"></div>
                </div>
            </div>

            <%--Form Labels--%>
            <div class="form-group row">
                <form:label path="tags" cssClass="col-1 col-form-label">Tags</form:label>
                <div class="form-group col-4">
                    <form:input path="tags" cssClass="form-control" placeholder="php,css,html"/>
                </div>
            </div>

            <%--Post Content--%>
            <div class="form-group" style="height:125px;">
                <form:label path="content" cssClass="col-form-label">Content</form:label>
                <form:textarea path="content" cssClass="form-control" rows="3"></form:textarea>
            </div>

            <%--Hidden Variables--%>
            <form:hidden path="postId" value="${Post.generateId()}"></form:hidden>

            <div class="form-group">
                <input type="submit" class="btn btn-primary"  value="Create Post">
            </div>

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
            errorElement: 'span',
            errorClass: 'form-control-feedback',
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
                $(element).closest('.form-group').removeClass('success').addClass('error');

                //Add Bootstrap Validation Indicator..
                $(element).closest('.form-group').removeClass('has-success').addClass('has-danger');
            },
            success: function (element) {
                element.addClass('valid')
                    .closest('.form-group').removeClass('error').addClass('success');

                //Remove Bootstrap has-warning & add has-success
                element.closest('.form-group').removeClass('has-danger').addClass('has-success');
            }
        });

    });
</script>


</body>
</html>