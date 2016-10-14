<%@ page language="java" import="Controlador.Controlador"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
    String sN = request.getParameter("n");
    int n = Integer.parseInt(sN);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%
		    sN = request.getParameter("EnviarPregunta");
			Controlador cc = new Controlador();
			
			
			
		%>
		<%=cc.prueba() %>
	</center>
</body>
</html>