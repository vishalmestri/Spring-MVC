<!doctype html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
  </head>
  <body>
    <nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Emp Master</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#">x Master</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">Y Master</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<form:form class="form-control" modelAttribute="empModel" action="processNewEmp" method="POST">
<div class="container-fluid">
 <div class="row">
  <div class=".col-mb-6">
    <label for="exampleInputEmail1" class="form-label">Employee Name:</label>
    <form:input path="name" class="form-control" id="exampleInputEmail1" />
  </div>
  <div class=".col-mb-6">
    <label for="exampleInputEmail1" class="form-label">Gender:</label>
    Male&nbsp;<form:radiobutton path="gender" class="form-check-input" id="exampleInputEmail2"  value="Male"/>
    Female&nbsp;<form:radiobutton  path="gender"  class="form-check-input" id="exampleInputEmail2" value="Femole"/>
    
  </div>
  </div>
   <div class="row">
  <div class=".col-mb-6">
  <button type="submit" class="btn btn-primary">Submit</button>
  </div>
  </div>
</div>
</form:form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
  </body>
</html>