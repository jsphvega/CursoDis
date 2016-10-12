<%@ page language="java" import="Controlador.Controlador"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Mi primer sitio JSP</title>
</head>
<body>
	<%
	    Controlador cc = new Controlador();
	%>
	<h1>Datos de la persona:</h1>
	<p>
		Nombre:
		<%=cc.imprimir()%></p>
</body>
</html>