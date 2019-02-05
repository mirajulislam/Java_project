<%@page import="java.sql.ResultSet"%>
<%@page import="org.hibernate.validator.constraints.Email"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin</title>
        <link rel="icon" href="img/favicon.ico" type="image/x-icon">
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <link href="css/style.css" rel="stylesheet" />	

    </head>
    <body >
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
                                    <li role="presentation"><a href="#Admin" class="active">Admin</a></li>                                  
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
            <div class="slider4">
                <%                    try {
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_website", "root", "");
                        Statement st = con.createStatement();
                        String strQuery = "SELECT count( * ) as total_record FROM donor_reg";
                        ResultSet rs = st.executeQuery(strQuery);
                        String Countrow = "";
                        while (rs.next()) {
                            Countrow = rs.getString(1);
                            out.println("<html><body>");                           
                         //   out.print("<h5>Your Are Total Blood Donation</h5>"+Countrow);
                            out.println("<marquee><h3>");
                            out.println("Our total Donor :  " +Countrow);
                            out.println("</h3></marquee>");
                            out.println("</body></html>");                      
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %>
                <aside class="widgets">
                    <h3 class="widgets-title">Admin Option....</h3>
                    <ul>
                        <li><a href="Today_Registration.jsp">Today Total Donor Registration</a></li>
                        <li><a href="Add_Total_Donor_Show.jsp">Today Total Blood Add show</a></li>
                        <li><a href="Any_Time_Donor_Ready.jsp">Total Ready Donor</a></li>
                        <li><a href="Ordercheck.jsp">Order Check</a></li>
                        <li><a href="Ordered_Donor_Detail.jsp">Detail Of Ordered Blood Donor</a></li>
                        <li><a href="Blood_Search_Admin.jsp">Search Blood</a></li>
                        <li><a href="Delivary_Search.jsp">Delivary Check and delivary </a></li>
                    </ul>
                </aside>
            </div>
        </div>



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