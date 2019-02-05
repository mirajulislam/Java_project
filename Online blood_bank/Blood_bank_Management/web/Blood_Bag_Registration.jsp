<html>
    <head>
        <title>Registration Form</title>
        
          <link href="registration.css" rel="stylesheet" type ="text/css">
    <div id="main-content">
        
         <h3>Donor Registration Form</h3> 
         <body>
        <form action="Blood_Bag_Registration" method="post" >
         <table align="center" cellpadding = "10">
             
<tr>
<td>Full Name</td>
<td><input type="text" name="Full_Name" maxlength="30"/>
</td>
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
<td><label> Donation Date</label></td>
<td><input type="text" name="Donation_Date" placeholder="yyyy-MM-dd"> (yyyy-mm-dd)</td>
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
