<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<body>
	<c:if test="${not empty empresa }">
		Nueva Empresa ${ empresa } Registrada
	</c:if>
	<c:if test="${empty empresa }">
		Ninguna empresa registrada
	</c:if>
	</body>
</html>
