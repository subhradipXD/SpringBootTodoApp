<%@ include file="include/header.jspf" %> <%@ include file="include/navbar.jspf"
%>
<div class="container mt-5">
  <h1 class="text-center text-primary mb-4">Welcome to the Welcome Page!</h1>
  <h2 class="text-center mb-3">Name: <span class="text-info">${name}</span></h2>
  <div class="text-center">
    <a href="list-todos" class="btn btn-success">Manage Your Todos &gt;</a>
  </div>
</div>

<%@ include file="include/footer.jspf" %>
