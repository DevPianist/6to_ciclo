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
			<h1 class="text-light">Modificar libro</h1>
			<!-- BOOTSTRAP-TAGS -->
			<s:form cssClass="form">
				<s:textfield label="Código del libro" />
				<s:textfield label="Nombre del libro" />
				<s:textfield label="Editorial" />
				<s:textfield label="Autor" />
				<s:textfield label="Género" />
				<s:textfield label="País del autor" />
				<s:textfield label="Número de páginas" />
				<s:textfield label="Año de edición" />
				<s:textfield label="Precio del libro" />
				<s:submit value="Modificar" cssClass="btn btn-warning text-light" />
			</s:form>


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