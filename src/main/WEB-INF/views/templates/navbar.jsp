<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

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
        </ul>


    <sec:authorize access="isAnonymous()">
        <ul class="nav navbar-nav navbar-right">
            <li class="nav-item"><a class="nav-link" href="/login">Login </a></li>
        </ul>
    </sec:authorize>

    <sec:authorize access="hasRole('USER')">
        <ul class="nav navbar-nav navbar-right">
            <li class="nav-item"><a class="nav-link" href="/logout">Log out</a></li>
        </ul>
    </sec:authorize>
    </div>
</nav>
