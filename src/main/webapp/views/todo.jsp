<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <title>Document</title>
  </head>
  <body>
    <div class="container">
      <h1 class="mt-5">Add New Todo</h1>
      <form:form action="" method="post" class="mt-3" modelAttribute="todo">
        Description:
        <form:input
          class="form-control"
          type="text"
          placeholder="Default input"
          aria-label="default input example"
          path="description"
        />
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
        <p class="mt-2">
          <form:errors cssClass="text-danger " path="description" />
        </p>
      </form:form>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
