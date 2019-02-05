<%-- 
    Document   : Registration
    Created on : Aug 7, 2018, 8:59:15 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Blood_Bank_System</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="icon" href="img/favicon.ico" type="image/x-icon">
        <link href="css/style1.css" rel="stylesheet" type="text/css" />
        
        <link href="css/style.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="demo.css" media="all" />
       
    </head>
    <body>

        <header>
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="navigation">
                    <div class="container">					
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse.collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <div class="navbar-brand">
                                <a href="index.html"><h1>Blood_Bank</h1></a>
                            </div>
                        </div>

                        <div class="navbar-collapse collapse">							
                            <div class="menu">
                                <ul class="nav nav-tabs" role="tablist">
                                    <li role="presentation"><a href="index.html" >Home</a></li>
                                    <li role="presentation"><a href="#about">About Us</a></li>
                                    <li role="presentation"><a href="#services">Services</a></li>																
                                    <li role="presentation"><a href="contact.html">Contact</a></li>
                                    <li role="presentation"><a href="Registration.jsp" >Signup</a></li>
                                    <li role="presentation"><a href="login.html">Login</a></li>                                  
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
                        <h2>Search Blood</h2>
                        <form id="Blood_Search" action="Search_Blood.jsp" method="post">                         

                            <select id="Blood_Group" class="ggg" name="Blood_Group">
                                <option value="1">SELECT GROUP</option>
                                <option value="A+">A+</option>
                                <option value="A-">A-</option>
                                <option value="B+">B+</option>
                                <option value="B-">B-</option>
                                <option value="AB+">AB+</option>
                                <option value="AB-">AB-</option>
                                <option value="O+">O+</option>
                                <option value="O-">O-</option> 
                            </select>                       

                            <input id="Address" type="text" class="ggg" name="Address" placeholder="enter YOUR LOCATION" required="">

                            <select id="City" class="ggg" name="City">
                                <option value="3">SELECT CITY</option>
                                <option value="Dhaka">Dhaka</option>
                                <option value="A-">Barishal</option>
                                <option value="Khulna">	Chattogram</option>
                                <option value="Borishal">Khulna</option>
                                <option value="Chttagong">Mymensingh</option>
                                <option value="Mymansng">Rajshahi</option>
                                <option value="Shylet">Rangpur</option>
                                <option value="Shylet">Sylhet</option>>  
                            </select>

                            <h4><input type="checkbox" />I agree to the Terms of Service and Privacy Policy</h4>

                            <div class="clearfix"></div>
                            <input id="bloodSearch" type="submit" value="Search" name="blood">
                        </form>                       
                    </div>
                </div>
            </div>
        </div>

        <section id="about">
            <div class="container">
                <div class="center">
                    <div class="col-md-6 col-md-offset-3">
                        <h2>About Us</h2>
                        <hr>					
                        <p class="lead">A blood bank is a center where blood gathered as a result of blood donation is stored and preserved for later use in blood transfusion.</p>
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
                        <!-- 
                            All links in the footer should remain intact. 
                            Licenseing information is available at: http://bootstraptaste.com/license/
                            You can buy this theme without footer links online at: http://bootstraptaste.com/buy/?theme=Anyar
                        -->
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
