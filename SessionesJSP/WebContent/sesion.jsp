<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page session="true"%>
<%@ include file="jspinclude.jsp"%>
<html>
<body>
	<form>
		<input type="submit" name="invalidaSesion" value="Invalidar
sesi�n" />
		<input type="submit" value="Recargar p�gina" />
	</form>
	<br /> Usted accedi� a esta p�gina en los siguientes momentos:
	<br>
	<%
		for (int i = 0; i < accesos.size(); i++) {
	%>
	<%=accesos.get(i)%>
	<br>
	<%
		}
	%>
</body>
</html>