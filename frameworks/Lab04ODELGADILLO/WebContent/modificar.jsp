<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="b" uri="/struts-bootstrap-tags"%>
<%@ taglib prefix="jq" uri="/struts-jquery-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modificar</title>
<!-- BOOTSTRAP-TAGS -->
<b:head />
<!-- BOOTSTRAP -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

</head>
<body>
	<div class="container border my-4 py-3"
		style="border-width: 2px !important; width: 35%;">
		<div class="container m-auto p-auto">
			<h1>Modificar</h1>
			<!-- BOOTSTRAP-TAGS -->
			<s:form cssClass="form">
				<s:textfield label="Codigo de cuidador responsable"/>
				<s:textfield label="Nombre" cssClass="" />
				<s:textfield label="Domicilio" />
				<s:textfield label="Telefono" />
				<s:textfield label="Celular" />
				<s:textfield label="Paciente" />
				<s:textfield label="Especie" />
				<s:textfield label="Raza" />
				<s:textfield label="Color" />
				<s:textfield label="Sexo" />
				<s:textfield label="Edad" />
				<s:textfield label="Motivo de consulta" />
				<s:submit value="Modificar" cssClass="btn btn-warning text-light" />
			</s:form>


			<a href="index.jsp">Regresar al menú</a>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>