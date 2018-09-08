<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="java.io.*,com.test.beans.Product,java.util.*"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
List<Product> c = (List<Product>)request.getAttribute("products");
%>

<table border=1>
<th><b>id</b></th><th><b>name</b></th><th><b>desc</b></th><th><b>price</b></th><th><b>qty</b></th>
<% 
for(Product cu : c)  {
	%>

<tr>
<td><%=cu.getProductID() %> </td>
<td> <%=cu.getProductName() %> </td>
<td><%=cu.getProductDesc() %> </td>
<td> <%=cu.getPrice() %> </td>
<td><%=cu.getQty() %> </td>
</tr>
<%
	}
%>
</table>
<br>
<a href="/save.jsp">Back</a>

</body>
</html>