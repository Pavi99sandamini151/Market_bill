<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Supermarket</title>
</head>
<body>
	Item &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Quantity
	<form action="ServeCallBill">
		<input type="checkbox" name="chboxsoap">Soap &nbsp;&nbsp;&nbsp;<input type="text" name="txtsoapqty"><br>
		<input type="checkbox" name="chboxchoc">Canburry Chocolate &nbsp;&nbsp;&nbsp;<input type="text" name="txtchocqty"><br>
		<input type="checkbox" name="chboxchips">Chips &nbsp;&nbsp;&nbsp;<input type="text" name="txtchipsqty"><br>
		<input type="checkbox" name="chboxshampoo">Shampoo &nbsp;&nbsp;&nbsp;<input type="text" name="txtshampooqty"><br>
		<input type="checkbox" name="chboxmlkpwder">Highland Milk Powder &nbsp;&nbsp;&nbsp;<input type="text" name="txtmlkpwqty"><br>
		
		<input type="submit" value="Calculate Bill">
	</form>
</body>
</html>