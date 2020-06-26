<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<div class="container-1 text-light">
		<div class="container m-auto p-auto">
			<table class="table table-dark">
				<thead>
					<tr>
						<th scope="col">Codigo de medicamento</th>
						<th scope="col">Nombre</th>
						<th scope="col">Precio</th>
						<th scope="col">Marca</th>
						<th scope="col">Stock</th>
						<th scope="col">Proveedor</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="listaMedicamentos">
						<tr>
							<td><s:property value="codigo" /></td>
							<td><s:property value="nombre" /></td>
							<td><s:property value="precio" /></td>
							<td><s:property value="marca" /></td>
							<td><s:property value="stock" /></td>
							<td><s:property value="proveedor" /></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>

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