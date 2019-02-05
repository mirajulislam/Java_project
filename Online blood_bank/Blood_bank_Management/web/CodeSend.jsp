<!DOCTYPE html>
<html>
    <head>
        <title>Forgot Password </title>
    </head>
    <%
        String email = (String) session.getAttribute("email").toString();
    %>
    <body>
        <h1>Forgot Password</h1>
        <form action="Code_Verification" method="post"><br><br>
            <tr>
                <td><input type ='hidden' name='email' value='${email}'></td>
            </tr>
            Enter mail code:<input type="text" name="code" /><br><br>

            <input type="submit" />
        </form>
    </body>
</html>