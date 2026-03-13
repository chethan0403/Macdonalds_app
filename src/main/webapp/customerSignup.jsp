<!DOCTYPE html>
<html>
<head>
<title>Customer Signup</title>

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

<h2>Customer Signup</h2>

<form action="customerRegister" method="post">


<input type="text" id="cname" name="cname" placeholder="Name" required>

<input type="email" id="cemail" name="cmail" placeholder="Email" required>

<input type="text" id="cphone" name="cphone" placeholder="Phone" required>

<input type="password" id="cpassword" name="cpassword" placeholder="Password" required>

<button type="submit">Signup</button>

</form>

<div class="link">
Already have account? <a href="customerLogin.jsp">Login</a>
</div>

</div>

</body>
</html>