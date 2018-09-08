<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "/productcontroller" method="post">
<input type ="hidden" name = "command" value = "1"/><br>
Product ID : <input type = "text" name = "prodid"/><br>
Product Name : <input type = "text" name = "prodname"/><br>
Product desc: <input type = "text" name = "proddesc"/><br>
Product Price: <input type = "text" name = "prodprice"/><br>
Product Qty : <input type = "text" name = "prodqty"/><br>
<input type ="submit">



</form>
</body>
</html>