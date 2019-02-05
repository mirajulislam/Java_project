<html>
    <head>
        <title>Registration Form</title>
        
          <link href="registration.css" rel="stylesheet" type ="text/css">
    <div id="main-content">
        
         <h3>Donor Registration Form</h3> 
         <body>
        <form action="Registration_Store" method="post" >
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

<tr>
<td>Blood Group</td>
<td>
<select name="Blood_Group" id="blood_group">
<option value="-1">Select_Blood_Group</option>
<option value="A+">A+</option>
<option value="A-">A-</option>
<option value="B+">B+</option>
<option value="B-">B-</option>
<option value="AB+">AB+</option>
<option value="AB-">AB-</option>
<option value="O+">O+</option>
<option value="O-">O-</option>
</td>
</tr>
 

 <tr>
<td><label>Last Donation</label></td>
<td><input type="text" name="Last_Donation" placeholder="yyyy-MM-dd"> (yyyy-mm-dd)</td>
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
 
<!----- Address ---------------------------------------------------------->
<tr>
<td>Your Location <br /><br /><br /></td>
<td><textarea name="Address" rows="4" cols="30"></textarea></td>
</tr>
 
<!----- City ---------------------------------------------------------->
<tr>
<td>City</td>
<td>
<select name="City" id="city">
<option value="Selected">.....selected.....</option>
<option value="Dhaka">Dhaka</option>
<option value="A-">Barishal</option>
<option value="Khulna">	Chattogram</option>
<option value="Borishal">Khulna</option>
<option value="Chttagong">Mymensingh</option>
<option value="Mymansng">Rajshahi</option>
<option value="Shylet">Rangpur</option>
<option value="Shylet">Sylhet</option>
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
