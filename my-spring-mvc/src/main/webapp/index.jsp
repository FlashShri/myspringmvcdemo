<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Home Page</h2>

<form action=hello.cdac >
<button type="submit">GO</button>
</form>

<form action=mydemo >
<button type="submit">GO to mydemo</button>
</form>

<form action=searchproduct.jsp >
<button type="submit">GO to searchProduct</button>
</form>

<form action=addProduct.jsp >
<button type="submit">GO to addProduct</button>
</form>

<form action=fetch-all-products >
<button type="submit">View All product</button>
</form>


<form action=hello-rest.cdac >
<button type="submit">GO for rest controller</button>
</form>


<form action=pnr-status >
enter pnr no: <input type="text" name="pnrNo">

<button type="submit">check status</button>
</form>
</body>
</html>