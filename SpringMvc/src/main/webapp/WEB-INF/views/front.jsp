<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:skyblue; text-align :center; border-bottom :5px solid red; border-radius : 5px;">

<%
   String name=(String)request.getAttribute("name");
	Integer id = (Integer)request.getAttribute("id");
	List<String> friends =(List<String>) request.getAttribute("f");
      
%>

<h1>Name is <%=name %></h1>
<h1>id is <%=id %></h1>
	<h1>Friends are: </h1>
	<%
     	for(String e :friends)
	      {
     %>
	<h3><%= e%></h3>
	<%
	    }
	%>


</body>
</html>