<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<div class="container-1">
		<div class="container m-auto p-auto">
			<h1>Registro</h1>
			<!-- BOOTSTRAP-TAGS -->
			<s:form cssClass="form" action="registrarPaciente">
				<s:textfield label="Nombre" name="paciente.cuidadorResponsableBean.nombre" />
				<s:textfield label="Domicilio" name="paciente.cuidadorResponsableBean.domicilio" />
				<s:textfield label="Telefono" name="paciente.cuidadorResponsableBean.telefono" />
				<s:textfield label="Celular" name="paciente.cuidadorResponsableBean.celular" />
				<s:textfield label="Paciente" name="paciente.paciente" />
				<s:textfield label="Especie" name="paciente.especie" />
				<s:textfield label="Raza" name="paciente.raza" />
				<s:textfield label="Color" name="paciente.color" />
				<s:textfield label="Sexo" name="paciente.sexo" />
				<s:textfield label="Edad" name="paciente.edad" />
				<s:textfield label="Motivo de consulta"
					name="paciente.motivoConsulta" />
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