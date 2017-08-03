<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<html>
<head>
    <title>Edit Profile</title>

    <%--Main CSS--%>
    <link rel="stylesheet" href="/resources/css/main.css">

    <%--Bootstrap--%>
    <link rel="stylesheet" href="/webjars/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="/webjars/bootstrap-glyphicons/bdd2cbfba0/css/bootstrap-glyphicons.css">

</head>

<body>
<%--Navigation Menu--%>
<jsp:include page="templates/navbar.jsp" />

<div class="container">
    <div class="row">
        <div class="col-6">
            <form>
                <div class="form-group">
                    <label for="formGroupExampleInput">Current Password</label>
                    <input type="password" class="form-control" id="formGroupExampleInput" placeholder="Example input">
                </div>
                <%--Change Password--%>
                <div class="form-group">
                    <label for="formGroupExampleInput2">Password</label>
                    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input">
                </div>
                <div class="form-group">
                    <label for="verifyPassword">Verify Password</label>
                    <input type="text" class="form-control" id="verifyPassword" placeholder="Another input">
                </div>
                <%--Change E-mail Address--%>
                <div class="form-group">
                    <label for="changeEmail">E-mail</label>
                    <input type="email" class="form-control" id="changeEmail" value="${User.getEmail()}">
                </div>
            </form>
        </div>
    </div>
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

</body>
</html>
