package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Blood_Bank_System</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\" />\t\n");
      out.write("                   <link rel=\"icon\" href=\"img/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\t<header>\n");
      out.write("\t\t<nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\t\t\t<div class=\"navigation\">\n");
      out.write("\t\t\t\t<div class=\"container\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse.collapse\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-brand\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.html\"><h1>Blood_Bank</h1></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"navbar-collapse collapse\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("\t\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"#home\" class=\"active\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"Donor_Registration.jsp\">Registration</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"#services\">Services</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"#contact\">Contact</a></li>\n");
      out.write("                                                                <li role=\"presentation\"><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t</nav>\t\t\t\n");
      out.write("\t</header>\n");
      out.write("\t\n");
      out.write("\t <div id=\"home\">\n");
      out.write("\t\t<div class=\"slider\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div id=\"about-slider\">\n");
      out.write("\t\t\t\t\t<div id=\"carousel-slider\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t<!-- Indicators -->\n");
      out.write("\t\t\t\t\t\t<ol class=\"carousel-indicators visible-xs\">\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t\t\t\t</ol>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("                                                    \n");
      out.write("                                                    <div class=\"item active\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/c1.jpg\" class=\"img-responsive\" alt=\"\"> \n");
      out.write("\t\t\t\t\t\t   </div>\n");
      out.write("                                                    \n");
      out.write("                                                    <div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/c5.jpg\" class=\"img-responsive\" alt=\"\"> \n");
      out.write("\t\t\t\t\t\t   </div> \n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t   <div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/c6.jpg\" class=\"img-responsive\" alt=\"\"> \n");
      out.write("\t\t\t\t\t\t   </div> \n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t   <div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/c2.jpg\" class=\"img-responsive\" alt=\"\"> \n");
      out.write("\t\t\t\t\t\t   </div> \n");
      out.write("                                                    \n");
      out.write("                                                    <div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/c3.jpg\" class=\"img-responsive\" alt=\"\"> \n");
      out.write("\t\t\t\t\t\t   </div>\n");
      out.write("                                                    \n");
      out.write("                                                     </div> \n");
      out.write("\t\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<a class=\"left carousel-control hidden-xs\" href=\"#carousel-slider\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i> \n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<a class=\" right carousel-control hidden-xs\"href=\"#carousel-slider\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i> \n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div> <!--/#carousel-slider-->\n");
      out.write("\t\t\t\t</div><!--/#about-slider-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<section id=\"about\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"center\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("\t\t\t\t\t<h2>About Us</h2>\n");
      out.write("\t\t\t\t\t<hr>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p class=\"lead\">A blood bank is a center where blood gathered as a result of blood donation is stored and preserved for later use in blood transfusion.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\n");
      out.write("      \n");
      out.write("                        </div><!--/#accordion1-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div><!--/.row-->\n");
      out.write("        </div><!--/.container-->\n");
      out.write("    </section><!--/#about-->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-md-4 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"300ms\">\n");
      out.write("\t\t\t\t<h4>About Us</h4>\n");
      out.write("\t\t\t\t<p>Blood banking refers to the process of collecting, separating, and storing blood. The first U.S. blood bank was established in 1936. Today, blood banks collect blood and separate it into its various components so they can be used most effectively according to the needs of the patient. Red blood cells carry oxygen, platelets help the blood clot, and plasma has specific proteins that allow proper regulation of coagulation and healing.</p>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"contact-info\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-home fa\"></i>Gulshan-2....., Dhaka City, Bangladesh </li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-phone fa\"></i> +8801780285746</li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-envelope fa\"></i>freebloodbank123@gmail.com</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-md-4 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t<h4>Photo Gallery</h4>\n");
      out.write("\t\t\t\t\t<ul class=\"sidebar-gallery\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/a1.jpg\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/a2.jpg\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/a5.jpg\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/a6.jpg\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/a9.jpg\" alt=\"\" /></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><img src=\"img/a10.jpg\" alt=\"\" /></a></li>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t<div class=\"sub-footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"social-icon\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t<ul class=\"social-network\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fb tool-tip\" title=\"Facebook\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter tool-tip\" title=\"Twitter\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"gplus tool-tip\" title=\"Google Plus\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"linkedin tool-tip\" title=\"Linkedin\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"ytube tool-tip\" title=\"You Tube\"><i class=\"fa fa-youtube-play\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("\t\t\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t\t\t&copy; Anyar 2015 All Rights Reserved  by BootstrapTaste\n");
      out.write("                    <!-- \n");
      out.write("                        All links in the footer should remain intact. \n");
      out.write("                        Licenseing information is available at: http://bootstraptaste.com/license/\n");
      out.write("                        You can buy this theme without footer links online at: http://bootstraptaste.com/buy/?theme=Anyar\n");
      out.write("                    -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t</div>\t\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("\t<script src=\"js/jquery.js\"></script>\t\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/wow.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.easing.min.js\"></script>\t\n");
      out.write("\t<script src=\"js/jquery.isotope.min.js\"></script> \n");
      out.write("\t<script src=\"js/functions.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
