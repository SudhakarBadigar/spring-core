<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  .centered-content {
    background-color: green;
    text-align: center;
    border-bottom: 5px solid red;
    border-radius: 5px;
    padding: 20px; /* Add some padding for better visual appearance */
  }
  
  .centered-list {
    list-style: square;
    padding: 5px;
  }
  
  .centered-list li {
    text-align: center;
    display: flex;
    justify-content: center;
    align-items: center;
    margin-bottom: 10px;
  }
  
  .circle-icon {
    width: 20px; /* Adjust the size as needed */
    height: 20px; /* Adjust the size as needed */
    border-radius: 50%;
    background-color: blue; /* You can adjust the color as needed */
    margin-right: 10px;
  }
</style>
</head>
<body>

<div class="centered-content">
  <%
     String name = (String) request.getAttribute("name");
     Integer id = (Integer) request.getAttribute("id");
     List<String> friends = (List<String>) request.getAttribute("f");
     Integer sal=(Integer)request.getAttribute("salary");
  %>

  <h1>Name is <%= name %></h1>
  <h1>id is <%= id %></h1>
  <h1>salary is :<%=sal %></h1>
  <h1>Friends are: </h1>
  <ul class="centered-list">
    <%
       for (String e : friends) {
    %>
    <li>
      <div class="circle-icon"></div>
      <%= e %>
    </li>
    <%
       }
    %>
  </ul>
</div>

</body>
</html>
