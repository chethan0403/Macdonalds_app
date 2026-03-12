<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Panel - McDonald's</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
background:#f8f8f8;
font-family:Arial;
min-height:100vh;
display:flex;
flex-direction:column;
}

/* Page Content */

.content{
flex:1;
}

/* HEADER */

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

/* Section cards */

.admin-box{
background:white;
padding:30px;
border-radius:10px;
box-shadow:0px 4px 12px rgba(0,0,0,0.15);
margin-top:40px;
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


<div class="content">

<div class="container">

<div class="row">

<!-- ADMIN SIGNUP -->

<div class="col-md-4">

<div class="admin-box">

<h4 class="text-center mb-3">Admin Signup</h4>

<form action="adminSignup" method="post">

<div class="mb-3">
<label>Name</label>
<input type="text" name="aname" class="form-control">
</div>

<div class="mb-3">
<label>Email</label>
<input type="email" name="email" class="form-control">
</div>

<div class="mb-3">
<label>Password</label>
<input type="password" name="password" class="form-control">
</div>

<button class="btn btn-theme w-100">Signup</button>

</form>

</div>

</div>


<!-- ADMIN LOGIN -->

<div class="col-md-4">

<div class="admin-box">

<h4 class="text-center mb-3">Admin Login</h4>

<form action="adminLogin" method="post">

<div class="mb-3">
<label>Email</label>
<input type="email" name="email" class="form-control">
</div>

<div class="mb-3">
<label>Password</label>
<input type="password" name="password" class="form-control">
</div>

<button class="btn btn-theme w-100">Login</button>

</form>

</div>

</div>


<!-- ADD PRODUCT -->

<div class="col-md-4">

<div class="admin-box">

<h4 class="text-center mb-3">Add Food Item</h4>

<form action="addFood" method="post">

<div class="mb-3">
<label>Food Name</label>
<input type="text" name="fname" class="form-control">
</div>

<div class="mb-3">
<label>Description</label>
<input type="text" name="description" class="form-control">
</div>

<div class="mb-3">
<label>Price</label>
<input type="number" name="price" class="form-control">
</div>

<div class="mb-3">
<label>Category</label>
<input type="text" name="category" class="form-control">
</div>

<button class="btn btn-theme w-100">Add Product</button>

</form>

</div>

</div>

</div>

</div>

</div>


<!-- FOOTER -->

<footer class="text-center p-3">

© 2026 McDonald's Admin Panel

</footer>

</body>
</html>