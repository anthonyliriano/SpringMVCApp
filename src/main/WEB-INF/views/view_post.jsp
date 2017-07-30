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

</head>

<body>
<%--Navigation Menu--%>
<jsp:include page="templates/navbar.jsp" />

<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="page-header">
                <h3>${Post.getTitle()}<br />
                    <small class="small">
                        ${Post.getAuthor()}
                            ${item.getLocalDateTime().toLocalDate()}
                            ${item.getLocalDateTime().getHour()}:${item.getLocalDateTime().getMinute()}
                    </small></h3>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="page-header">
                ${Post.getContent()}
            </div>
        </div>
    </div>
</div>

<%--Footer--%>
<jsp:include page="templates/footer.jsp" />

</body>
</html>

