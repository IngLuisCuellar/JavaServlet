
<%
	//Permite codigo java
	//scriplet

	String empresa = (String)request.getAttribute("empresa");
	System.out.println(empresa);
%>



<html>
	<body>
	Nueva Empresa <%= empresa %> Registrada
	</body>
</html>
