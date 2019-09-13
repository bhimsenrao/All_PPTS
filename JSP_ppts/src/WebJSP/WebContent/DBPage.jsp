<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<body>
    <%
       String param=request.getParameter("txtId");
      try{
    	  int id=Integer.parseInt(param);
    	  
    	  DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
    	  Connection connect= 
    		DriverManager.getConnection(
    		"jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
    	  Statement stat=connect.createStatement();
    	  ResultSet result=
    			  stat.executeQuery(
    					  "select * from Employee where ID="+id);
    	  ResultSetMetaData data=result.getMetaData();
    	  
    	  int cols=data.getColumnCount();
    	  out.print("<table border=1><tr>");
    	  for(int i=1;i<=cols;i++)
    		  out.print("<th>"+data.getColumnName(i)+"</th>");
    	  out.print("</tr>");
    	  while(result.next()){
    		  out.print("<tr>");
    		  for(int i=1;i<=cols;i++)
        		  out.print("<td>"+result.getString(i)+"</td>");
        	  out.print("</tr>");    		  
    	  }
    	  out.print("</table>");
      }
    catch(Exception ex){
   %> 	
   <jsp:include page="QueryForm.html"/>
    <% 	
    	out.println(ex);
       }
    %>
</body>
</html>