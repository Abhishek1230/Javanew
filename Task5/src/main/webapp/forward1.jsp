<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.abhishek.first.Officer,java.io.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<body bgcolor = "yellow">

<%
List <Officer> s =(List<Officer>) request.getAttribute("student"); 

%>
<table border =1>

	<th><b>id</b></th>
	<th><b>name</b></th>
	<th><b>pin</b></th>
	
	
<% for(Officer o3 : s) { %>
<tr>
	<td><%= o3.getId() %> </td>
	<td> <%= o3.getName() %></td>
    <td><%= o3.getPin() %> </td>
   
</tr>
<% } %>


</table>
<br>

<a href = "index1.jsp">Add Another Officer</a>
</body>
</html>
