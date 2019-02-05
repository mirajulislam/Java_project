<%-- 
    Document   : Registration
    Created on : Aug 7, 2018, 8:59:15 AM
    Author     : HP
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
    String id = request.getParameter("id");
    String driver = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String database = "blood_bank_website";
    String userid = "root";
    String password = "";
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>

<%
    try {
        connection = DriverManager.getConnection(connectionUrl + database, userid, password);
        statement = connection.createStatement();
        String sql = "select * from donor_reg where id=" + id;
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin Registration</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="icon" href="img/favicon.ico" type="image/x-icon">
        <link href="css/style1.css" rel="stylesheet" type="text/css" />

        <link href="css/style.css" rel="stylesheet" />	

    </head>
    <body>

        <header>
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="navigatio1">
                    <div class="container">					
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse.collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <div class="navbar-brand">
                                <a href="Admin.jsp"><h1>Welcome Admin</h1></a>
                            </div>
                        </div>

                        <div class="navbar-collapse collapse">							
                            <div class="menu">
                                <ul class="nav nav-tabs" role="tablist">
                                    <li role="presentation"><a href="Admin.jsp" >Admin</a></li>                                  
                                    <li role="presentation"><a href="#services">Services</a></li>																
                                    <li role="presentation"><a href="#">Send Mail</a></li>
                                    <li role="presentation"><a href="Admin_Registration.html" >Admin Registration</a></li>
                                    <li role="presentation"><a href="index.html" >Logout</a></li>
                                </ul>
                            </div>
                        </div>						
                    </div>
                </div>	
            </nav>			
        </header>

        <div id="home">
            <div class="slider1">

                <div style="width:auto;margin:auto; float:none; margin-bottom:10px; text-align:center; clear:both;">

                </div>
                <div class="">
                    <div class="phpkida-main">
                        <h2>New Donor Blood Add</h2>
                        <form id="Store" action="Store" method="post">
                            <input type="hidden" name="id" value="<%=resultSet.getString("id")%>">
                            <font size="3" color="white">Id: <input id="id" type='text' name="id" class="ggg"  name='id' value="<%=resultSet.getString("id")%>" readonly></font> <br>                            
                            <font size="3" color="white">Donor Name: </font> <input id="Full_name" type="text" name="Full_Name"  class="ggg" value="<%=resultSet.getString("Full_Name")%>" readonly><br>
                            <font size="3" color="white">Donor Blood Group: </font> <input id="Blood_Group" type="text" name="Blood_Group"  class="ggg" value="<%=resultSet.getString("Blood_Group")%>" readonly><br>
                            <font size="3" color="white">Donor Last Donated: </font> <input id="Last_Donation" type="text" name="Last_Donation"  class="ggg" value="<%=resultSet.getString("Last_Donation")%>" readonly><br>
                            <font size="3" color="white">Donor Mobile: </font> <input id="Mobile_Number" type="text" name="Mobile_Number"  class="ggg" value="<%=resultSet.getString("Mobile_Number")%>" readonly><br>
                            <font size="3" color="white">Donor Email :</font> <input id="Email" type="text" name="Email"  class="ggg" value="<%=resultSet.getString("Email")%>" readonly><br>
                            <font size="3" color="white">Donor Address: </font> <input id="Address" type="text" name="Address"  class="ggg" value="<%=resultSet.getString("Address")%>" readonly><br>        
                            <font size="3" color="white">Donor City: </font> <input id="City" type="text" name="City"  class="ggg" value="<%=resultSet.getString("City")%>" readonly><br>        
                            <font size="3" color="white">Enter Price:</font> <input id="Price" type="text" name="Price" class="ggg" ><br>                         
                            <div class="clearfix"></div>   
                            <input id="submit" type="submit" value="Add" name="submit">
                        </form>


                        </form>
                        <p>Already Registered. <a href="login.html">Login</a></p>
                    </div>
                </div>
            </div>
        </div>

    </div><!--/#accordion1-->
</div>
</div>

</div><!--/.row-->
</div><!--/.container-->
</section><!--/#about-->



<footer>
    <div class="container">
        <div class="col-md-4 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms">
            <h4>About Us</h4>
            <p>Blood banking refers to the process of collecting, separating, and storing blood. The first U.S. blood bank was established in 1936. Today, blood banks collect blood and separate it into its various components so they can be used most effectively according to the needs of the patient. Red blood cells carry oxygen, platelets help the blood clot, and plasma has specific proteins that allow proper regulation of coagulation and healing.</p>						
            <div class="contact-info">
                <ul>
                    <li><i class="fa fa-home fa"></i>Gulshan-2....., Dhaka City, Bangladesh </li>
                    <li><i class="fa fa-phone fa"></i> +8801780285746</li>
                    <li><i class="fa fa-envelope fa"></i>freebloodbank123@gmail.com</li>
                </ul>
            </div>
        </div>

        <div class="col-md-4 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">				
            <div class="text-center">
                <h4>Photo Gallery</h4>
                <ul class="sidebar-gallery">
                    <li><a href="#"><img src="img/a1.jpg" alt="" /></a></li>
                    <li><a href="#"><img src="img/a2.jpg" alt="" /></a></li>
                    <li><a href="#"><img src="img/a5.jpg" alt="" /></a></li>
                    <li><a href="#"><img src="img/a6.jpg" alt="" /></a></li>
                    <li><a href="#"><img src="img/a9.jpg" alt="" /></a></li>
                    <li><a href="#"><img src="img/a10.jpg" alt="" /></a></li>						
                </ul>

            </div>
        </div>

        <div class="sub-footer">
            <div class="container">
                <div class="social-icon">
                    <div class="col-md-4">
                        <ul class="social-network">
                            <li><a href="#" class="fb tool-tip" title="Facebook"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#" class="twitter tool-tip" title="Twitter"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#" class="gplus tool-tip" title="Google Plus"><i class="fa fa-google-plus"></i></a></li>
                            <li><a href="#" class="linkedin tool-tip" title="Linkedin"><i class="fa fa-linkedin"></i></a></li>
                            <li><a href="#" class="ytube tool-tip" title="You Tube"><i class="fa fa-youtube-play"></i></a></li>
                        </ul>	
                    </div>
                </div>

                <div class="col-md-4 col-md-offset-4">
                    <div class="copyright">
                        &copy; Anyar 2015 All Rights Reserved | <a href="http://bootstraptaste.com/">Bootstrap Themes</a> by BootstrapTaste

                    </div>
                </div>						
            </div>				
        </div>
        <%
                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.js"></script>	
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery.easing.min.js"></script>	
        <script src="js/jquery.isotope.min.js"></script> 
        <script src="js/functions.js"></script>

        </body>

        </html>
