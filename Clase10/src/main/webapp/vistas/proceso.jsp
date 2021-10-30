<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mi Primer Java Server Pages</title>
</head>
<body>
	<%-- comentario de linea en jsp --%>

	<!-- scriptlets -->
	<%
	String edad = request.getParameter("edad");
	String prefieres = request.getParameter("preferencia");

	out.print("tu nombre es " + request.getParameter("nombre") + " " + request.getParameter("apellido"));
	out.print("<br/>");
	out.print("tienes " + edad + " años");
	out.print("<br/>");
	out.print("tu lenguaje preferido es " + request.getParameter("lenguaje"));
	out.print("<br/>");
	out.print("Y prefieres el / la " + prefieres + " de un proyecto de software");
	out.print("<br/>");
	out.print("Bienvenido a EducacionIT " + request.getParameter("nombre").toString().toUpperCase());

	out.print("<br/>");

	out.print("request.getLocalAddr() " + request.getLocalAddr());
	out.print("<br/>");
	out.print("request.getRemoteHost() " + request.getRemoteHost());
	out.print("<br/>");
	out.print("request.getContentType() " + request.getContentType());
	out.print("<br/>");
	out.print("request.getContextPath() " + request.getContextPath());
	out.print("<br/>");
	%>

</body>
</html>