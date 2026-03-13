<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>McDonald's Food Ordering</title>

<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
margin:0;
font-family:Arial, Helvetica, sans-serif;
}

/* HEADER */

.navbar{
background:#fff3b0;
padding:12px 25px;
}

.navbar-brand{
font-weight:bold;
font-size:22px;
color:black;
}

/* Buttons */

.nav-btn{
background:#da291c;
color:white;
border:none;
}

.nav-btn:hover{
background:#b71c1c;
color:white;
}

/* Banner */

.hero{
height:90vh;
background-image:url("https://media.istockphoto.com/id/2195489700/photo/mcdonalds-store-facade.jpg?s=612x612&w=0&k=20&c=24Su-2BPuD5mTUlRF_0zzHk_hwSNF8YVm7AusKA_rZk=");
background-size:cover;
background-position:center;
display:flex;
align-items:center;
justify-content:center;
}

/* Overlay */

.overlay{
background:rgba(0,0,0,0.55);
padding:50px;
border-radius:12px;
text-align:center;
color:white;
}

/* Footer */

footer{
background:#fff3b0;
color:black;
font-weight:bold;
}

</style>

</head>

<body>

<!-- HEADER -->

<nav class="navbar navbar-expand-lg">
<div class="container">

<a class="navbar-brand">
McDonald's
</a>

<div>

<a href="admin.jsp" class="btn nav-btn me-2">
Admin
</a>

<a href="customer.jsp" class="btn nav-btn">
Customer
</a>

</div>

</div>
</nav>

<!-- HERO SECTION -->

<div class="hero">

<div class="overlay">

<h1 class="display-4">Welcome to McDonald's</h1>

<p class="lead">Order your favourite burgers and meals online</p>

<a href="customer.jsp" class="btn btn-danger btn-lg mt-3">
Order Now
</a>

</div>

</div>

<!-- FOOTER -->

<footer class="text-center p-3">

© 2026 McDonald's Food Ordering System

</footer>

</body>
</html>