<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<title>Admin Login - McDonald's</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

html,body{
height:100%;
margin:0;
}

body{
background:#f8f8f8;
font-family:Arial;
display:flex;
flex-direction:column;
}

/* Center content */

.content{
flex:1;
display:flex;
justify-content:center;
align-items:center;
}

/* Navbar */

.navbar{
background:#ffce00;
}

.navbar-brand{
font-weight:bold;
font-size:22px;
color:black;
}

/* Login Card */

.admin-box{
background:white;
padding:30px;
border-radius:10px;
box-shadow:0px 4px 12px rgba(0,0,0,0.15);
width:350px;
}

/* Theme Button */

.btn-theme{
background:#da291c;
color:white;
border:none;
}

.btn-theme:hover{
background:#b71c1c;
color:white;
}

/* Footer */

footer{
background:#ffce00;
color:black;
font-weight:bold;
}

</style>

</head>

<body>

<!-- HEADER -->

<nav class="navbar navbar-expand-lg">
<div class="container">

<a class="navbar-brand">McDonald's Admin Panel</a>

<div>
<a href="index.jsp" class="btn btn-theme">Home</a>
</div>

</div>
</nav>

<!-- LOGIN SECTION -->

<div class="content">

<div class="admin-box">

<h4 class="text-center mb-3">Admin Login</h4>

<form action="order.jsp" method="post">

<div class="mb-3">
<label>Email</label>
<input type="email" name="email" class="form-control" required>
</div>

<div class="mb-3">
<label>Password</label>
<input type="password" name="password" class="form-control" required>
</div>

<button class="btn btn-theme w-100">Login</button>

</form>

</div>

</div>

<!-- FOOTER -->

<footer class="text-center p-3">
© 2026 McDonald's Admin Panel
</footer>

</body>
</html>
