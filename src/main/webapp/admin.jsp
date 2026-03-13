<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<title>Admin Signup - McDonald's</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

html,body{
height:100%;
margin:0;
}

body{
font-family:Arial;
min-height:100vh;
display:flex;
flex-direction:column;

/* Background Image */

background-image:url("images/mcd-bg.png");
background-size:cover;
background-position:center;
background-repeat:no-repeat;
}

/* Center Content */

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

/* Buttons */

.btn-theme{
background:#da291c;
color:white;
border:none;
}

.btn-theme:hover{
background:#b71c1c;
color:white;
}

/* Signup Card */

.admin-box{
background:rgba(255,255,255,0.9);
padding:30px;
border-radius:10px;
box-shadow:0px 4px 12px rgba(0,0,0,0.25);
width:350px;
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

<!-- SIGNUP SECTION -->

<div class="content">

<div class="admin-box">

<h4 class="text-center mb-3">Admin Signup</h4>

<form action="adminSignup" method="post">

<div class="mb-3">
<label>Name</label>
<input type="text" name="aname" class="form-control" required>
</div>

<div class="mb-3">
<label>Email</label>
<input type="email" name="email" class="form-control" required>
</div>

<div class="mb-3">
<label>Password</label>
<input type="password" name="password" class="form-control" required>
</div>

<button class="btn btn-theme w-100 mb-3">Signup</button>

</form>

<p class="text-center">If you already have an account?</p>

<a href="login.jsp" class="btn btn-dark w-100">Login</a>

</div>

</div>

<!-- FOOTER -->

<footer class="text-center p-3">
© 2026 McDonald's Admin Panel
</footer>

</body>
</html>
