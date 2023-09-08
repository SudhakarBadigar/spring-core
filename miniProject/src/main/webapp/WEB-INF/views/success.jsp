<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: yellow; text-align:center;">

<div style="color: red; text-align:center;">
  <h1>${Heading}</h1> 
  <p>${para}</p>
</div>

<h1>Congrats Login is successfull..</h1>
<h1>Congrats all your data has been stored in Database</h1>

<!-- @modelAttribute 2nd way -->



<h1>username is :${u}</h1>
<h1>useremail is :${e}</h1>
<h1>userpass is :${p}</h1>





<!-- For @modelAttribute  1st way

<h1>user Name is   : ${user.userName} </h1>
<h1>user Email is : ${user.userEmail}</h1>
<h1>user Pass is : ${user.userPassword}</h1>

-->


<!--  using @requestparam
 <h1>username is :  ${un}</h1>
<h1>email is : ${ue}</h1>
<h1>password is : ${up}</h1>
-->

</body>
</html>