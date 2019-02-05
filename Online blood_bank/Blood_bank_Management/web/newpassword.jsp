<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="reset.css" rel="stylesheet" type ="text/css">
        <title>Change Password</title>
    </head>
    <% 
         String code = (String)session.getAttribute("code").toString();
         String email = (String)session.getAttribute("email").toString();
        %>
    <body>
        <div id="main-content">
            <br><br><br>
            <form method="post" action="Forgot_Password_New">
                <h1 align="center">Change Password</h1>
                <table align="center">
                    <tr>
                        <td><input type ='hidden' name='code' value='${code}'></td>
                    </tr>
                    <tr>
                        <td><input type ='hidden' name='email' value='${email}'></td>
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