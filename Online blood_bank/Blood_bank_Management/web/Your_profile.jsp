
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="profile.css" rel="stylesheet" type ="text/css">
        <title>Profile</title>
    </head>
    <%
        
        String User_Name = (String)session.getAttribute("User_Name").toString();
        String Full_Name = (String)session.getAttribute("Full_Name").toString();
        String Blood_Group = (String)session.getAttribute("Blood_Group").toString();
        String Last_Donation = (String)session.getAttribute("Last_Donation").toString();
        String id = (String)session.getAttribute("user_id").toString();
        
        String Mobile_Number = (String)session.getAttribute("Mobile_Number").toString();
        String Address = (String)session.getAttribute("Address").toString();
        String City = (String)session.getAttribute("City").toString();
  
        
       
        %>
    <body>
        
        <div id="main-content">
            <form>
            <h1> Welcome:${Full_Name}</h1>
            <%--<%=User_Name%> --%>
             <h3>User id: ${user_id}</h3>
             <h3>User name: ${User_Name}</h3>
             <h3>Blood_Group :   ${Blood_Group}</h3>
             <h3>Last_Donation: ${Last_Donation}</h3>
             <h3>Address :   ${Address}</h3>
             <h3>City :   ${City}</h3>
             <h3>Mobile :  ${Mobile_Number}</h3>
             
             <br></br>
             <div id="navl">
             <ul>
                 <li><a href="Need_Blood.jsp"> Blood Needed </a></li>
                 <li><a href="UpdateUser.jsp"> Update </a></li>
                  <li><a href="Reset_password.jsp"> Reset password </a></li>
                  <li><a href="Logout.jsp"> Logout </a></li>
         
            </ul>
</div>
            </form>
        </div>
    </body>
</html>
