<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<%
String foods[]=request.getParameterValues("food");
%>

<html>
<body>

<h2>Your Cart</h2>

<%
if(foods!=null){
for(String f:foods){
%>

<p><%=f%></p>

<%
}
}
%>

<br>
<a href="order.jsp">Place Order</a>

</body>
</html>