<!DOCTYPE html>
<html>
<head>
<title>Customer Login</title>

<style>

body{
font-family:Arial;
background:#f4f4f4;
}

.container{
width:350px;
margin:120px auto;
background:white;
padding:25px;
border-radius:8px;
}

input{
width:100%;
padding:8px;
margin-top:10px;
}

button{
width:100%;
padding:10px;
margin-top:15px;
background:#da291c;
color:white;
border:none;
}

.link{
text-align:center;
margin-top:10px;
}

</style>

</head>

<body>

<div class="container">

<h2>Customer Login</h2>

<form action="customerLogin" method="post">

<input type="email" id="cmail" name="cmail" placeholder="Email" required>

<input type="password" id="cpassword" name="cpassword" placeholder="Password" required>

<button type="submit">Login</button>

</form>

<div class="link">
New user? <a href="customerSignup.jsp">Signup</a>
</div>

</div>

</body>
</html>