<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="b" uri="/struts-bootstrap-tags"%>
<%@ taglib prefix="jq" uri="/struts-jquery-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar</title>
<!-- BOOTSTRAP-TAGS -->
<b:head />
<!-- BOOTSTRAP -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

</head>
<body>
	<div class="container border my-4  p-5">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Codigo de cuidador responsable</th>
					<th scope="col">Nombre</th>
					<th scope="col">Domicilio</th>
					<th scope="col">Telefono</th>
					<th scope="col">Celular</th>
					<th scope="col">Paciente</th>
					<th scope="col">Especie</th>
					<th scope="col">Raza</th>
					<th scope="col">Color</th>
					<th scope="col">Sexo</th>
					<th scope="col">Edad</th>
					<th scope="col">Motivo</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Oscar Sandro</td>
					<td>Lima</td>
					<td>01527421</td>
					<td>946451021</td>
					<td>Boby</td>
					<td>Perro</td>
					<td>Doberman</td>
					<td>Negro</td>
					<td>Macho</td>
					<td>2 años</td>
					<td>Alergia</td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td>Oscar Sandro</td>
					<td>Lima</td>
					<td>01527421</td>
					<td>946451021</td>
					<td>Boby</td>
					<td>Perro</td>
					<td>Doberman</td>
					<td>Negro</td>
					<td>Macho</td>
					<td>2 años</td>
					<td>Alergia</td>
				</tr>
				<tr>
					<th scope="row">3</th>
					<td>Oscar Sandro</td>
					<td>Lima</td>
					<td>01527421</td>
					<td>946451021</td>
					<td>Boby</td>
					<td>Perro</td>
					<td>Doberman</td>
					<td>Negro</td>
					<td>Macho</td>
					<td>2 años</td>
					<td>Alergia</td>
				</tr>
			</tbody>
		</table>

		<a href="index.jsp">Regresar al menú</a>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>