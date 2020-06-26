<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Medicamento</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<div class="container-1">
		<div class="container m-auto p-auto">
			<h1>Registrar medicamento</h1>
			<!-- BOOTSTRAP-TAGS -->
			<s:form cssClass="form" action="registrarMedicamento">
				<s:textfield label="Nombre" name="medicamento.nombre" />
				<s:textfield label="Precio" name="medicamento.precio" />
				<s:textfield label="Marca" name="medicamento.marca" />
				<s:textfield label="Stock" name="medicamento.stock" />
				<s:textfield label="Proveedor" name="medicamento.proveedor" />
				<s:submit value="Registrar" cssClass="btn btn-success" />
			</s:form>
			<br>
			<div style="width: 400px">
				<p class="alert alert-success">
					<s:property value="resultado" />
				</p>
			</div>

			<a href="index.jsp" class="text-light">Regresar al menú</a>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>