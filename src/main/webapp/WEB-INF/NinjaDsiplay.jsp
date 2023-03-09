<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>Title</title>
  <%--    Bootstrap--%>
  <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<div class="container">
  <h1 class="text-center"> Welcome to Ninjas    </h1>
  <p> <a href="/dojo/new" class="btn btn-outline-primary">Add a Dojo </a>
      <a href="/ninja/new" class="btn btn-outline-secondary">Add a Ninja </a>
  </p>
  <table class="table table-striped table-bordered text-center">
    <thead class="table-dark">
    <tr>
      <th scope="col">First Name</th>
      <th scope="col">Last Name  </th>
      <th scope="col">Age </th>
      <th scope="col">Actions </th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="ninja" items="${allNinjas}">
      <tr>
        <td><c:out value="${ninja.firstName}"/></td>
        <td><c:out value="${ninja.lastName}"/></td>
        <td><c:out value="${ninja.age}"/></td>
        <td>
          <a href="/ninja/${id}" class="btn btn-primary">View</a>
        </td>
      </tr>

      <%--            <td>--%>
      <%--                <a href="/burger/${burger.id}/delete" class="btn btn-danger">Delete</a>--%>
      <%--            </td>--%>

<%--      <td>--%>
<%--        <form action="/trip/${trip.id}" method="POST">--%>
<%--          <input type="hidden" name="_method" value="delete"/>--%>
<%--          <button class="btn btn-danger">Delete</button>--%>
<%--        </form>--%>
<%--        <a href="/trip/${trip.id}" class="btn btn-primary">Update</a>--%>
<%--      </td>--%>

    </c:forEach>

    </tbody>
  </table>
</div>

</body>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</html>
