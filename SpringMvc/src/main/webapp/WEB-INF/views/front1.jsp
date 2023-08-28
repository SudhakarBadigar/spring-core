<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body style="background-color: skyblue;">



<%
   String comp=(String)request.getAttribute("company");
	String comcode=(String) request.getAttribute("company-code");
	List<String> employee = (List<String>) request.getAttribute("Employees");
   
	
	//String name=(String)request.getAttribute("name");
	//Integer id = (Integer)request.getAttribute("id");
	//List<String> friends =(List<String>) request.getAttribute("f");
      
%>

<h1>Company name is  <%=comp %></h1>
<h1>Company code is <%=comcode %></h1>
	<h1>Employees in the company: </h1>
	<%
	
     	for(String emp :employee)
	      {
     %>
	<h3> <%=emp %></h3>
	<%
	    }
	%>

</body>
</html>
