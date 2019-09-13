<%!int x = 1;%>
<%
	if (x == 1) {
		out.print("First visit to Page");
	} else {
		out.print("Visited for " + x + " times");

	}
	x++;
%>