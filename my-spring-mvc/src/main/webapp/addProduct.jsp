<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="add-product-v2">
Enter name: <input type="text" name="name" /> <br />
Enter price: <input type="number" name="price" /> <br />
Enter qt: <input type="number" name="quantity" /> <br />
<button type="submit">Add product</button>
</form>

<p> ${msg }</p>



</body>
</html>