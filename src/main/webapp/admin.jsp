<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Register</title>
    
</head>
<body>
<div class="card">
    <h2>Admin Register</h2>

    <% if (request.getAttribute("message") != null) { %>
        <p class="message">${message}</p>
    <% } %>

    <form action="adminRegister" method="post">
        <label>Username</label>
        <input type="text" name="aname" placeholder="Enter username" id="aname" required />

        <label>Password</label>
        <input type="password" name="password" placeholder="Enter password" id="apassword" required />

        <button type="submit">Register</button>
    </form>

    <div class="link">
        Already have an account? <a href="adminLogin">Login</a>
    </div>
</div>
</body>
</html>