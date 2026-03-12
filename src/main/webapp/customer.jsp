<!DOCTYPE html>
<html>
<head>
<title>Customer Portal</title>

<style>
body{font-family:Arial;background:#f4f4f4;}

.container{
width:700px;
margin:80px auto;
display:flex;
justify-content:space-between;
}

.box{
width:45%;
background:white;
padding:20px;
border-radius:6px;
}

input{width:100%;padding:8px;margin-top:8px;}

button{
width:100%;
padding:10px;
margin-top:10px;
background:green;
color:white;
border:none;
}
</style>

</head>

<body>

<h1 style="text-align:center">Customer Portal</h1>

<div class="container">

<div class="box">
<h3>Login</h3>
<form action="customerLogin" method="post">
<input type="email" name="cmail" placeholder="Email">
<input type="password" name="cpassword" placeholder="Password">
<button>Login</button>
</form>
</div>

<div class="box">
<h3>Signup</h3>
<form action="customerRegister" method="post">
<input type="text" name="cname" placeholder="Name">
<input type="email" name="cmail" placeholder="Email">
<input type="text" name="cphone" placeholder="Phone">
<input type="password" name="cpassword" placeholder="Password">
<button>Signup</button>
</form>
</div>

</div>

<br>
<div style="text-align:center">
<a href="food.jsp">View Food Menu</a>
</div>

</body>
</html>