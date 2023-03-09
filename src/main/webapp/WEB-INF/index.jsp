<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- c:out ; c:forEach etc. -->
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
    <%@ page isErrorPage="true" %>
<html>
<head>
    <title>Dojos and Ninjas</title>
<%--    Bootstrap--%>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<h1 class="display-1 text-center" >Dojo & Ninjas  Hub </h1>
<div class="container">
    <p> <a href="/dojo/new" class="btn btn-outline-primary">Add a Dojo </a>
        <a href="/ninja/new" class="btn btn-outline-secondary">Add a Ninja </a>
    </p>
<%--    <form:form>--%>
<%--        <div class="mb-3">--%>
<%--            <form:label for="name" class="form-label" path="name">Dojo Name :</form:label>--%>
<%--            <form:input style="width:250px;" type="text" class="form-control" id="name" aria-describedby="name" path="name"/>--%>
<%--            <form:errors path="name" class="text-danger"/>--%>
<%--        </div>--%>
<%--    </form:form>--%>
</div>
</body>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</html>
