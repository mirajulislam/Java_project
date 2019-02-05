<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple Registration Page</title>
</head>
<body>

	<h1>Student Registration</h1>

	<form action="ForDate" method="post">

		<table cellpadding="8" cellspacing="8">
	
			<tr>
				<td><label>DOB</label></td>
				<td><input type="text" name="dob" placeholder="yyyy-mm-dd"> (yyyy-MM-dd)</td>
			</tr>
			
			<tr>
				<td></td>
				<td align="right">
					<input type="submit" value="Register">
					<input type="Reset" value="Cancel">
				</td>
			</tr>
			
		</table>
	</form>
	
</body>
</html>