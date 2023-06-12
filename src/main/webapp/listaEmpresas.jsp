<%@page import="java.util.List, com.alura.gerenciador.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
	
	Lista de Empresas <br />
		
	<ul>
		<%
		List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas"); //Se castea de tal forma que quede de ese tipo de varible
		
		for (Empresa empresa : lista){
		%>
			<li><%=empresa.getNombre()%> </li>
		<%
			}
		%>
	</ul>
</body>
</html>