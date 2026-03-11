<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Register</title></head>
<body>
  <h2>Customer Registration</h2>

  <% String msg = request.getParameter("msg");
     if ("failed".equals(msg)) { %>
       <p style="color:red;">Registration failed. Try again.</p>
  <% } %>

  <form action="customerregister" method="post">

    <label for="cname">Name:</label><br/>
    <input type="text" id="cname" name="cname" placeholder="Enter your full name" required/><br/><br/>

    <label for="cmail">Email:</label><br/>
    <input type="email" id="cmail" name="cmail" placeholder="Enter your email address" required/><br/><br/>

    <label for="cphone">Phone:</label><br/>
    <input type="number" id="cphone" name="cphone" placeholder="Enter your phone number" required/><br/><br/>

    <label for="cpassword">Password:</label><br/>
    <input type="password" id="cpassword" name="cpassword" placeholder="Enter your password" required/><br/><br/>

    <input type="submit" value="Register"/>

  </form>

  <a href="login.jsp">Already have an account? Login</a>
</body>
</html>