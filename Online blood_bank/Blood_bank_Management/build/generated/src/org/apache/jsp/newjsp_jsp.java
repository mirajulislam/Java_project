package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>BLOOD_BANK_SYSTEM</title>\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type =\"text/css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"navl\">\n");
      out.write("    <h1><a href=\"Home.html\">Blood Bank System</a></h1>\n");
      out.write("    <ul>\n");
      out.write("       <li id=\"active\"><a href=\"Home.html\">Home </a></li>\n");
      out.write("        <li><a href=\"Blood_Banks.html\"> Blood Banks  </a></li>\n");
      out.write("         <li><a href=\"Doner_Register.html\">  Donor Register  </a></li>\n");
      out.write("          <li><a href=\"Blood_Donors.html\">  Blood Donors  </a></li>\n");
      out.write("           <li><a href=\"Contack_Us.html\">  Contact Us</a></li>\n");
      out.write("            <li><a href=\"Login.html\">  Login page </a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("    <div id=\"main-content\">\n");
      out.write("        <h1>Welcome to our blood bank center in online</h1>\n");
      out.write("        <p>Welcome..... Can I help you ? This blood bank center blood low expensive.....</p>\n");
      out.write("        <br>\n");
      out.write("        <div id=\"service\">\n");
      out.write("            <h3><a href=\"service.html\">Check our service</a></h3>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"third\">\n");
      out.write("        \n");
      out.write("        <div id=\"third1\"><img src=\"images/new.jpg\"><br>\n");
      out.write("            <h3>Give The Gift Of Life</h3><br>\n");
      out.write("            <p>It's In Your Blood To Save Lives</p>           \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"third1\"><img src=\"images/ppp.png\"><br>\n");
      out.write("             <h3>Give The Gift Of Life</h3><br>\n");
      out.write("            <p>Help Save A Life . Donate Blood</p> \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"third1\"><img src=\"images/world_blood_donor_day.jpg\"><br>\n");
      out.write("             <h3>Give The Gift Of Life</h3><br>\n");
      out.write("            <p>Give Blood Share Life</p> \n");
      out.write("        </div>       \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"footer\">       \n");
      out.write("        <h2>&COPY; Allright Reserved</h2>\n");
      out.write("        <div id=\"nav2\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a> </li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a> </li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-youtube\"></i></a> </li>\n");
      out.write("            </ul>           \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
