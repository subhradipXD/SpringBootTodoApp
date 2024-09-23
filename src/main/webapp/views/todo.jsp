<%@ include file="include/header.jspf" %> <%@ include file="include/navbar.jspf"
%>
<div class="container">
  <h1 class="mt-3">Add New Todo</h1>
  <form:form action="" method="post" class="mt-3" modelAttribute="todo">
    <fieldset>
      <form:label path="description" class="mb-2"> Description: </form:label>
      <form:input
        class="form-control"
        type="text"
        placeholder="Default input"
        aria-label="default input example"
        path="description"
      />
      <form:errors cssClass="text-danger " path="description" />
    </fieldset>

    <fieldset>
      <form:label path="targetDate" class="mb-2"> Target Date: </form:label>
      <form:input
        class="form-control"
        type="Date"
        placeholder="Default input"
        aria-label="default input example"
        path="targetDate"
      />
      <form:errors cssClass="text-danger " path="targetDate" />
    </fieldset>

    <form:input
      class="form-control"
      type="hidden"
      placeholder="Default input"
      aria-label="default input example"
      path="id"
    />
    <form:input
      class="form-control"
      type="hidden"
      placeholder="Default input"
      aria-label="default input example"
      path="done"
    />
    <button type="submit" class="btn btn-success mt-3">Submit</button>
    <p class="mt-2"></p>
  </form:form>
</div>

<%@ include file="include/footer.jspf" %>
