<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>VNZ</title>

	<link rel="stylesheet" href="css/holovna.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		  crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#">Головна</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Дім <span class="sr-only">(current)</span></a>
      </li>

      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Контактні данні
        </a>
        <li>
       <div class="dropdown">
             <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                       Спеціальності
                     </a>
             <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
               <a class="dropdown-item"></a>
               <a class="dropdown-item">081 Право</a>
               <a class="dropdown-item">017 Компютерна інженерія</a>
               <a class="dropdown-item">019 Компютерна інженерія</a>
               <a class="dropdown-item"></a>
               <a class="dropdown-item"></a>

             </div>
           </div>
            </li>

        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="#">0979807246</a>
          <a class="dropdown-item" href="#">sasha.borovskiy2003@gmail.com</a>
        </div>
      </li>
    </ul>
  </div>



</nav>





	<div class="sidebar" >

	</div>
	<#list vyzs as vyz>

	<div class="content" >
<div class="card text-center">
  <div class="card-header">
    ${vyz.title}
  </div>
  </div>
  <div class="card-body">
    <h5 class="card-title">


    <!-- Example single danger button -->
    <div class="btn-group">
      <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        Спеціальності
      </button>
      <div class="dropdown-menu">
        <a class="dropdown-item">Кібербезпека</a>
        <a class="dropdown-item">Право</a>
        <a class="dropdown-item"">Біологія</a>
        <a class="dropdown-item" >Економіка</a>
      </div>
    </div>

    </h5>
    <p class="card-text">${vyz.town}.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
  <div class="card-footer text-muted">
    2 days ago
  </div>
</div>

    </div>
</#list>


	<div class="footer"> info </div>

		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    			integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    			crossorigin="anonymous"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    			integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    			crossorigin="anonymous"></script>
    	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    			integrity="sha384z-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    			crossorigin="anonymous"></script>
</body>
</html>