<%
	java.util.ArrayList accesos = (java.util.ArrayList) session.getAttribute("accesos");
	if (accesos == null)
		accesos = new java.util.ArrayList();
	accesos.add(new java.util.Date().toString());
	session.setAttribute("accesos", accesos);
	if (request.getParameter("invalidaSesion") != null)
		session.invalidate();
%>