<html>
    <head>
        <title>Admin_Form</title>
        
    <div id="main-content">
        
         <h3>Donor Registration Form</h3> 
         <body>
        <form action="Admin_Registration" method="post" >
         <table align="center" cellpadding = "10">
             
<tr>
<td>Full Name</td>
<td><input type="text" name="Full_Name" maxlength="30"/>
</td>
</tr>
 
<!----- Last Name ---------------------------------------------------------->
<tr>
<td>User Name</td>
<td><input type="text" name="User_Name" maxlength="30"/>
</td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="Password" maxlength="10"/>
</td>
</tr>

 <tr>
<td><label>Date Of Birth</label></td>
<td><input type="text" name="Birthday_Day" placeholder="yyyy-MM-dd"> (yyyy-mm-dd)</td>
</tr>
<!----- Mobile Number ---------------------------------------------------------->
<tr>
<td>Mobile Number</td>
<td>
<input type="text" name="Mobile_Number" maxlength="15" />
</td>
</tr>
 
<tr>
<td>Email</td>
<td><input type="email" name="Email" maxlength="30"/>
</td>
</tr>
<!----- Gender ----------------------------------------------------------->
<tr>
<td>Gender</td>
<td>
<select name="Gender" id="Gender">
<option value="male">male</option>
<option value="female">female</option>
</td>
</tr>
 <!----- Submit and Reset ------------------------------------------------->
<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</td>
</tr>
    </table>
        </form>
         </body>
    </div>
    </head>
</html>
