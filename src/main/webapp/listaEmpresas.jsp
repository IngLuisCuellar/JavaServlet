<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List, com.alura.gerenciador.servlet.Empresa"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><% //Importa las librerias que descargamos, una librería que pone tags en html %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		Lista de Empresas <br />
		
		<ul>
			
			<c:forEach items="${empresas}" var="empresa">
				<li>${empresa.nombre}</li> <%//Expression Languaje erntiende que debe hacer un get sin escribirlo textualmente %>
			</c:forEach>
			
		</ul>
	</body>
</html>