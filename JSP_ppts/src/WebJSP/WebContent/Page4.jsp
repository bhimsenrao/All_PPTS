<%@ page errorPage="EPage4.jsp"%>
<%
	int a = Integer.parseInt(request.getParameter("t1"));
	int b = Integer.parseInt(request.getParameter("t2"));
	
	int c=a/b;
	out.print("Quotient="+c);
%>