<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="true" %>
<html>
<head>
    <title>Home</title>

    <%--Main CSS--%>
    <link rel="stylesheet" href="/resources/css/main.css">

    <%--Bootstrap--%>
    <link rel="stylesheet" href="webjars/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">

</head>
<style>
    .form-control-feedback{
        font-size: 12px;
    }
    .form-group{
        height: 90px;
    }
</style>
<body>
<%--Navigation Menu--%>
<jsp:include page="templates/navbar.jsp" />

<div class="container">
    <div class="row justify-content-md-center">
        <div class="col-md-4">
            <form:form method="post" action="${loginProcessingUrl}" id="signinForm" modelAttribute="User">
                <h3 class="form-signin-heading">Login</h3>
                <small>Default credentials are user/password</small>
                <c:if test="${Error != null}">
                    <div class="alert alert-danger" role="alert">
                        <strong>Invalid credentials</strong>
                    </div>
                </c:if>

                <div class="form-group">
                    <form:label path="username">Username</form:label>
                    <form:input path="username" cssClass="form-control"/>
                    <div class="form-control-feedback"></div>
                </div>

                <div class="form-group">
                    <form:label path="password">Password</form:label>
                    <form:password path="password" class="form-control" cssClass="form-control" />
                    <div class="form-control-feedback float-right"><a href="/register/">Click here to Register</a></div>
                </div>


                <input type="submit" class="btn btn-primary btn-block" name="submit" value="submit" />
            </form:form>
        </div>
    </div>
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />
<script src="/webjars/jquery-validation/1.16.0/jquery.validate.min.js"></script>
<script>
    $(document).ready(function () {

        $('#signinForm').validate({
            errorElement: 'span',
            errorClass: 'form-control-feedback',
            rules: {
                username: {
                    minlength: 1,
                    maxlength: 30,
                    required: true
                },
                password: {
                    minlength: 5,
                    maxlength: 30,
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

