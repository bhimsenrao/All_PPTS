<html>
<body>
   <form>
     Name <input type="text" name="txt">
     <input type="submit" value="send">
   </form>
</body>

</html>
<%
  try{
String name=request.getParameter("txt");
    if(name.length()>0){
    	out.println("welcome to "+name);
    }
  }
catch(Exception ex){}

%>