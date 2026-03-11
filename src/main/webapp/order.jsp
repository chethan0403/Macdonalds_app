<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="com.dcl.dto.Customer" %>
<%
    HttpSession sess = request.getSession(false);
    if (sess == null || sess.getAttribute("loggedCustomer") == null) {
        response.sendRedirect("login.jsp?msg=sessionexpired");
        return;
    }
    Customer customer = (Customer) sess.getAttribute("loggedCustomer");
%>
<!DOCTYPE html>
<html>
<head><title>Place Order</title></head>
<body>
  <h2>Place New Order</h2>

  <% String msg = request.getParameter("msg");
     if ("failed".equals(msg)) { %>
       <p style="color:red;">Failed to place order. Try again.</p>
  <% } %>

  <form action="saveOrder" method="post">

    <input type="hidden" id="cid" name="cid" value="<%= customer.getCid() %>"/>

    <label for="odate">Order Date:</label><br/>
    <input type="date" id="odate" name="odate" required/><br/><br/>

    <label for="tamount">Total Amount:</label><br/>
    <input type="number" id="tamount" name="tamount"
           placeholder="Enter total amount"
           step="0.01" min="0" required/><br/><br/>

    <label for="status">Status:</label><br/>
    <select id="status" name="status" required>
      <option value="">-- Select Status --</option>
      <option value="Pending">Pending</option>
      <option value="Confirmed">Confirmed</option>
      <option value="Delivered">Delivered</option>
      <option value="Cancelled">Cancelled</option>
    </select><br/><br/>

    <input type="submit" value="Place Order"/>
    <a href="myOrders">Cancel</a>

  </form>
</body>
</html>