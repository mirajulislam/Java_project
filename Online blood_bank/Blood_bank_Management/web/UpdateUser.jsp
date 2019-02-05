
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="update.css" rel="stylesheet" type ="text/css">
        <title>Update_page</title>
    </head>
    <body>
        <div id="main-content">
        <br><br><br>
        <form action="UpdateServlet" method="post">
            <h2 align="center">-----Update Your Information------</h2>
            <table align="center">
                
                <tr>
                    <td>User id:</td>
                    <td>${user_id}</td>
                    <td><input type ='hidden' name='id' value='${user_id}'></td>
                </tr>
                <tr>
                    <td>Username:</td>
                    <td><input type ='text' name='User_Name' value='${User_Name}'></td>
                </tr>
                
                <tr>
                    <td>Full_name:</td>
                    <td><input type ='text' name='Full_Name' value="${Full_Name}"></td>
                </tr>
                
                <tr>
                    <td>Address</td>
                    <td><input type ='text' name='Address' value="${Address}"></td>
                </tr>
                
                                <tr>
                    <td>Last Donation</td>
                    <td><input type ='text' name='Last_Donation' value="${Last_Donation}"></td>
                </tr>
                
                <tr>
                    <td>City</td>
                    <td><input type ='text' name='City' value="${City}"></td>
                </tr>
                
                <tr>
                    <td>Mobile_Number</td>
                    <td><input type ='text' name='Mobile_Number' value="${Mobile_Number}"></td>
                </tr>               
                    <td></td>
                    <td><input type ='submit'value="Update"></td>
                
               
            </table>
        </div>
        </form>
    </body>
</html>
