<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="reset.css" rel="stylesheet" type ="text/css">
        <title>Change Password</title>
    </head>
    <% 
         String id = (String)session.getAttribute("user_id").toString();
        %>
    <body>
        <div id="main-content">
            <br><br><br>
            <form method="post" action="Reset_Password">
                <h1 align="center">Change Password</h1>
                <table align="center">
                    <tr>
                        <td><input type ='hidden' name='id' value='${user_id}'></td>
                    </tr>
                    
                     <tr>
                    <td>Current Password:</td>
                    <td><input type ='password' name="current"></td>
                    </tr>
                     <tr>
                    <td>New Password:</td>
                    <td><input type ='password' name="new"></td>
                    </tr>
                      <tr>
                    <td>Confirm Password:</td>
                    <td><input type ='password' name="confirm"></td>
                    </tr>
                    
                    <td></td>
                    <td><input type ='submit'value="Change"></td>
                    
                </table>
            </form>
        </div>
    </body>
</html>