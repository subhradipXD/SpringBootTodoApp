<%@ include file="include/header.jspf" %> <%@ include file="include/navbar.jspf"
%>
<div class="container mt-3">
  <h1 class="text-success text-center mb-4">Your Todos</h1>

  <table class="table table-striped table-bordered table-hover text-center">
    <thead class="table-dark">
      <tr>
        <!-- <th>Id</th> -->
        <th>Description</th>
        <th>Target Date</th>
        <th>Is Done?</th>
        <th>UPDATE</th>
        <th>DELETE</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${todos}" var="todo">
        <tr>
          <!-- <td>${todo.id}</td> -->
          <td>${todo.description}</td>
          <td>${todo.targetDate}</td>
          <td>${todo.done}</td>
          <td>
            <a href="update-todo?id=${todo.id}" class="btn btn-warning"
              >UPDATE</a
            >
          </td>
          <td>
            <a href="delete-todo?id=${todo.id}" class="btn btn-danger"
              >DELETE</a
            >
          </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

  <a href="add-todo" class="btn btn-success">Add Todo</a>
</div>

<%@ include file="include/footer.jspf" %>
