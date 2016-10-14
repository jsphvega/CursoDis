<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Tutor Cognitivo- Watson</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="Estilos.css" />
</head>
<body style="text-align: center; overflow: hidden">

	<form>
		<div style="background-color: #333; text-align: left">
			<button type="submit" value="Inicio"
				onclick="location.href = 'index.jsp'">Inicio</button>
			<button type="submit" value="Entrenamiento">Entrenamiento</button>
			<button type="submit" value="AgregarInformación"
				onclick="location.href = 'preguntas-respuestas.jsp'">Agregar
				información</button>
			<button type="submit" value="GrabarPregunta">Grabar pregunta</button>
			<button type="submit" value="TraducirRespuesta">Traducir
				respuesta</button>
			<button type="submit" value="GenerarDocumento">Generar
				Documento</button>
		</div>

		<br>

		<table>
			<tr>
				<td>
					<h3>Pregunta</h3>
				</td>
			</tr>
			<tr>
				<td style="width: 85%"><textarea rows="2" id="pregunta"
						style="width: 98%"> </textarea></td>
				<td>

					<button type="submit" value="EnviarPregunta">Enviar
						Pregunta</button>

				</td>
			</tr>
		</table>

		<br>

		<table style="height: 50%">
			<tr>
				<td>
					<h3>Respuesta</h3>
				</td>
			</tr>
			<tr style="height: 50%">
				<td style="width: 85%"><textarea id="respuesta" readonly
						style="width: 98%; height: 90%"></textarea></td>
				<td>
					<div align="center" id="texto">
						¿Son correctas las respuestas para usted? <input type="radio"
							name="correcta" value="Si"> Si <input type="radio"
							name="correcta" value="No"> No <br /> <br />

						<button type="submit" value="EnviarEvaluacion">Enviar
							Evaluacion</button>

					</div>
				</td>
			</tr>
		</table>
	</form>
	
	<jsp:include page="conector.jsp"></jsp:include>
</body>
</html>