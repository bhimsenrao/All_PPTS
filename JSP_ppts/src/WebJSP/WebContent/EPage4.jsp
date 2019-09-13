<%@page isErrorPage="true"%>
<h1>
	<center>Application Failure</center>
</h1>
<hr />
<%
	if (exception instanceof ArithmeticException) {

		out.println("Denominator Cannot be zero");
	}
	if (exception instanceof NumberFormatException) {
		out.println("Input required is  Integer");
	}

	out.print("<a href=Data.html>retry</a>");
%>