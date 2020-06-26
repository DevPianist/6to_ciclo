<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="b" uri="/struts-bootstrap-tags"%>
<%@ taglib prefix="jq" uri="/struts-jquery-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CLÍNICA VETERINARIA RASSIM</title>
<!-- BOOTSTRAP-TAGS -->
<b:head />
<!-- BOOTSTRAP -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

</head>
<body>
	<div class="container border my-4 py-3"
		style="border-width: 2px !important; width: 35%;">
		<div class="container my-4 text-center">
			<h1>CLÍNICA VETERINARIA RASSIM</h1>
			<h3>Gestión de pacientes</h3>
			<div class="container px-3 py-3">
					<a class="btn btn-primary text-light" href="listar">Listar</a>
					<a class="btn btn-success text-light" href="registrar.jsp">Registrar</a>
					<a class="btn btn-warning text-light" href="modificar.jsp">Modificar</a>
					<a class="btn btn-info text-light" href="buscar.jsp">Buscar</a>
					<a class="btn btn-danger text-light" href="eliminar.jsp">Eliminar</a>
			</div>
			<h3>Gestión de medicamentos</h3>
			<div class="container px-3 py-3">
					<a class="btn btn-primary text-light" href="listarMedicamento.jsp">Listar</a>
					<a class="btn btn-success text-light" href="registrarMedicamento.jsp">Registrar</a>
					<a class="btn btn-warning text-light" href="modificarMedicamento.jsp">Modificar</a>
					<a class="btn btn-info text-light" href="buscarMedicamento.jsp">Buscar</a>
					<a class="btn btn-danger text-light" href="eliminarMedicamento.jsp">Eliminar</a>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>