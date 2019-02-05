<%-- 
    Document   : Search_Blood
    Created on : Aug 13, 2018, 1:56:46 PM
    Author     : HP
--%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String driver = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String database = "blood_bank_website";
    String userid = "root";
    String password = "";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Calendar cal = Calendar.getInstance();
    String present = sdf.format(cal.getTime());
    cal.add(Calendar.DAY_OF_MONTH, -92);
    String newDate = sdf.format(cal.getTime());
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin</title>
       <link rel="icon" href="img/favicon.ico" type="image/x-icon">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="styles.css" media="all" />       
        <link href="css/style.css" rel="stylesheet" />
        <link rel="stylesheet" href="css/responsive-tables.min.css" type="text/css">
        <link href="css/style2.css" rel="stylesheet" />	
        
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
                                    <li role="presentation"><a href="Admin.jsp">Admin</a></li>                                  
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
            <div class="slider">
                <div class="">
                    <header class="title_Table">
                      New  Donor Detail
                    </header>
                    <table>

                        <thead>
                            <tr>
                                <th class="c7">Blood Id</th>
                                <th class="c7">Full Name</th>
                                <th class="c7">Blood Group</th>
                                <th class="c6">Last Donation</th>
                                <th class="c6">Mobile Number</th>
                                <th class="c3">Email</th>
                                <th class="c6">Address</th>
                                <th class="c6">City</th>
                                <th class="c7">User_id</th>
                                <th class="c7">Price</th>
                                <th class="c7">One Donor many</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>


                                <%
                                    try {
                                        connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                                        statement = connection.createStatement();
                                        String sql ="select * from blood_detail where time='" + present + "'";
                                        resultSet = statement.executeQuery(sql);
                                        while (resultSet.next()) {
                                %>              
                            <tr>
                                <td class="c7"><%=resultSet.getString("blood_id")%></td>
                                <td class="c7"><%=resultSet.getString("Full_Name")%></td>
                                <td class="c7"><%=resultSet.getString("Blood_Group")%></td>
                                <td class="c6"><%=resultSet.getString("Last_Donation")%></td>
                                <td class="c6"><%=resultSet.getString("Mobile_Number")%></td>  
                                <td class="c3"><%=resultSet.getString("Email")%></td>
                                <td class="c6"><%=resultSet.getString("Address")%></td>
                                <td class="c6"><%=resultSet.getString("City")%></td>  
                                <td class="c7"><%=resultSet.getString("id")%></td>  
                                <td class="c7"><%=resultSet.getString("Price")%></td>
                                <td class="c7"><a href="Exam_Add_Delete?blood_id=<%=resultSet.getString("blood_id")%>"><button type="button" class="view">Delete</button></td>
                            </tr>
                            <%
                                    }
                                    connection.close();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            %>


                        </tbody>
                    </table>

                </div> 
            </div> <!--/#carousel-slider-->
        </div><!--/#about-slider-->

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

 <script src="js/jquery.js"></script>	
        <script src="js/bootstrap.min.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery.easing.min.js"></script>	
        <script src="js/jquery.isotope.min.js"></script> 
        <script src="js/functions.js"></script>
        <script src="js/jquery.responsive-tables.min.js"></script>
        <script src="js/app.js"></script>
        </body>
        </html>