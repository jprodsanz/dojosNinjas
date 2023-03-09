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
    <title>Ninja Hub</title>
    <%--    Bootstrap--%>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<h1 class="display-1 text-center" >Add a Ninja  </h1>
<div class="container">
    <form:form action="/ninja/new" method="POST" modelAttribute="ninja">
        <div class="mb-3">
            <form:label for="firstName" class="form-label" path="firstName">First Name :</form:label>
            <form:input style="width:250px;" type="text" class="form-control" id="firstName" aria-describedby="firstName" path="firstName"/>
            <form:errors path="firstName" class="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label for="lastName" class="form-label" path="lastName">Last Name :</form:label>
            <form:input style="width:250px;" type="text" class="form-control" id="lastName" aria-describedby="lastName" path="lastName"/>
            <form:errors path="lastName" class="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label for="age" class="form-label" path="age">Age:</form:label>
            <form:input style="width:250px;" type="number" class="form-control" id="age" aria-describedby="age" path="age"/>
            <form:errors path="age" class="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="dojo">Dojo</form:label>
                <select class="form-select" style="width:250px;" path="dojo" aria-label="Default select example" >
                    <option selected>Make a selection</option>
<%--                    <c:forEach var="" items="">--%>
<%--                        <option value="">--%>
<%--                            <c:out value=""></c:out>--%>
<%--                        </option>--%>
<%--                    </c:forEach>--%>
                </select>
        </div>
        <button type="submit" class="btn btn-outline-primary">Add Ninja</button>
    </form:form>
</body>
</html>
