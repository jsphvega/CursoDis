<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tutor Cognitivo- Watson</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>
<ul>
     <li><a class="menu" href=index.html>Principal</a></li>
     <li><a href="#tutor">Tutor Cognitivo</a></li>
    </ul><br><br><br>


    <center><button class="button button1">Grabar pregunta</button><button class="button button2">Traducir respuesta</button> <button class="button button3">Entrenar tutor</button><form action="entrenamiento watson.html"><input type="submit" value="GenerarDocumento" class="button button4"></form><center><br><br>
    

    <form action="">
    <textarea rows="35" cols="50" id="text" style="text-align":center> </textarea> <textarea rows="35" cols="50" id="text" readonly style="text-align":center ></textarea>
     </form><br>
    <input type="submit" value="Enviar pregunta" class="button button1">
     <p align="center">�Son correctas las respuestas para usted?</p><br>
    <form action="">
        <input type="radio" name="correcta" value="Si"> Si<br>
        <input type="radio" name="correcta" value="No"> No<br>
    </form><br>
    <input type="submit" value="Enviar" class="button button1"><br>

    <script type="text/javascript" src="index.js"></script>
</body>
</html>