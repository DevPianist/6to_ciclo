<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="b" uri="/struts-bootstrap-tags"%>
<%@ taglib prefix="jq" uri="/struts-jquery-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de libros</title>
<!-- BOOTSTRAP-TAGS -->
<b:head />
<!-- BOOTSTRAP -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<style type="text/css">
* {
	margin: 0px;
	padding: 0px;
	box-sizing: border-box;
}

.container-1 {
	background-image: url("./images/bg2.jpg");
	background-repeat: no-repeat;
	height: 100vh;
	width: 100vw;
	background-size: cover;
	display: grid;
	grid-template-rows: 100%;
	align-items: center;
}
"
}
</style>
</head>
<body>
	<div class="container-1">
		<div class="container m-auto p-auto">
			<h1 class="text-light">Lista de libros</h1>
			<div class="card-columns p-5">
				<div class="card">
					<img class="card-img-top" src="./images/libro.jpg"
						style="width: 100%; height: 250px;" alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title">Nombre del libro:Design patterns</h5>
						<p class="card-text">
							<strong>Código:</strong> 01022<br> <strong>Autor:</strong>
							Oscar Delgadillo<br> <strong>Editorial:</strong> Santillana<br>
							<strong>Género: </strong>Informática<br> <strong>País
								del autor: </strong>Perú<br> <strong>Año de edicion:</strong> 2007<br>
							<strong>Número de páginas</strong> 200<br> <strong>Precio:</strong>
							S./30.0<br>
						</p>
					</div>
				</div>
				<div class="card">
					<img class="card-img-top" src="./images/libro.jpg"
						style="width: 100%; height: 250px;" alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title">Nombre del libro:Design patterns</h5>
						<p class="card-text">
							<strong>Código:</strong> 01022<br> <strong>Autor:</strong>
							Oscar Delgadillo<br> <strong>Editorial:</strong> Santillana<br>
							<strong>Género: </strong>Informática<br> <strong>País
								del autor: </strong>Perú<br> <strong>Año de edicion:</strong> 2007<br>
							<strong>Número de páginas</strong> 200<br> <strong>Precio:</strong>
							S./30.0<br>
						</p>
					</div>
				</div>
				<div class="card">
					<img class="card-img-top" src="./images/libro.jpg"
						style="width: 100%; height: 250px;" alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title">Nombre del libro:Design patterns</h5>
						<p class="card-text">
							<strong>Código:</strong> 01022<br> <strong>Autor:</strong>
							Oscar Delgadillo<br> <strong>Editorial:</strong> Santillana<br>
							<strong>Género: </strong>Informática<br> <strong>País
								del autor: </strong>Perú<br> <strong>Año de edicion:</strong> 2007<br>
							<strong>Número de páginas</strong> 200<br> <strong>Precio:</strong>
							S./30.0<br>
						</p>
					</div>
				</div>
			</div>
			<a class="text-light" href="index.jsp">Regresar al menú</a>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>