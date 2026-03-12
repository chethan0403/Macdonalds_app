<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Food Menu</title>
</head>

<body>

<h2>Food Menu</h2>

<form action="cart.jsp" method="post">

<input type="checkbox" name="food" value="Burger"> Burger ₹120 <br>
<input type="checkbox" name="food" value="Pizza"> Pizza ₹250 <br>
<input type="checkbox" name="food" value="Pasta"> Pasta ₹180 <br>

<br>

<button>Add To Cart</button>

</form>

</body>
</html>