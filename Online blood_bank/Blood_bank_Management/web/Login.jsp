
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="login.css" rel="stylesheet" type ="text/css">
    </head>
    <body>
        <form  action="LOGIN" method="post">
        <div id="main-content">
           
<form class="pure-form">
   <h1>Sign_In</h1>
   <h4>Fill the form below to get instant access</h4>
   
  User Name :<input type="text" name = "User_Name" placeholder="username or email">
  <br>
  <br/>
  
Password :<input type="password" name = "Password" placeholder="password">
  <br>
  <br/>

Role : <select name="select" >
  <option value="none">.........select.......</option>
  <option value="Admin">Admin</option>
  <option value="Donor">Donor</option>
</select>
<br>
  <br/>
  
  <input value="Submit" type="submit">
  <div id="navl">
  <h4><a href="Forgot_Password.jsp">forgot password </a></h4>
  </div>
  
  </form>
        </div>
        </form>
    </body>
</html>
