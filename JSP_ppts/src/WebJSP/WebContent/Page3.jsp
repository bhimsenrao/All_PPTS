<%@page import="java.util.ArrayList"%>

<%
  ArrayList<String> list= new ArrayList<String>();


    list.add("Day1");
    list.add("Day2");
    list.add("Day3");
    for(String day:list){
    	out.println(day+"<br>");
    }
%>
<input type="text" value="<%=list.size()%>" readonly>
<%=list.size()%>