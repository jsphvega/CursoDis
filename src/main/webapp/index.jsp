<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tutor cognitivo-Watson</title>
<link rel="stylesheet" href="Estilos.css" />
</head>
<body>
	<div style="background-color: #333; text-align: left">
		<button type="submit" value="Inicio">Inicio</button>
		<button type="submit" value="Entrenamiento"
			onclick="location.href = 'tutor.jsp'">Entrenamiento</button>
	</div>

	<br />
	<br />
	<br />
	<br />
	<br />
	<br />

	<div style="text-align: center; width: 100%" id="fondo">
		<h1>Bienvenid@ Tutor Cognitivo-Watson</h1>
		<br>
		<h1>Administración de Tecnología de Información</h1>
	</div>

	<form action="conector.jsp">
		<input type="text" name="n"><br> <input type="submit"
			value="Enviar">
	</form>
</body>
</html>