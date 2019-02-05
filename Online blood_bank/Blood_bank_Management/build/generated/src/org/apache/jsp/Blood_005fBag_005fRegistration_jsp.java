package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Blood_005fBag_005fRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Registration Form</title>\n");
      out.write("        \n");
      out.write("          <link href=\"registration.css\" rel=\"stylesheet\" type =\"text/css\">\n");
      out.write("    <div id=\"main-content\">\n");
      out.write("        \n");
      out.write("         <h3>Donor Registration Form</h3> \n");
      out.write("         <body>\n");
      out.write("        <form action=\"Registration_Store\" method=\"post\" >\n");
      out.write("         <table align=\"center\" cellpadding = \"10\">\n");
      out.write("             \n");
      out.write("<tr>\n");
      out.write("<td>Full Name</td>\n");
      out.write("<td><input type=\"text\" name=\"Full_Name\" maxlength=\"30\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Blood Group</td>\n");
      out.write("<td>\n");
      out.write("<select name=\"Blood_Group\" id=\"blood_group\">\n");
      out.write("<option value=\"-1\">Select_Blood_Group</option>\n");
      out.write("<option value=\"A+\">A+</option>\n");
      out.write("<option value=\"A-\">A-</option>\n");
      out.write("<option value=\"B+\">B+</option>\n");
      out.write("<option value=\"B-\">B-</option>\n");
      out.write("<option value=\"AB+\">AB+</option>\n");
      out.write("<option value=\"AB-\">AB-</option>\n");
      out.write("<option value=\"O+\">O+</option>\n");
      out.write("<option value=\"O-\">O-</option>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("\n");
      out.write(" <tr>\n");
      out.write("<td><label> Donation Date</label></td>\n");
      out.write("<td><input type=\"text\" name=\"Donation_Date\" placeholder=\"yyyy-MM-dd\"> (yyyy-mm-dd)</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!----- Mobile Number ---------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>Mobile Number</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"text\" name=\"Mobile_Number\" maxlength=\"15\" />\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<tr>\n");
      out.write("<td>Email</td>\n");
      out.write("<td><input type=\"email\" name=\"Email\" maxlength=\"30\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<!----- Gender ----------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>Gender</td>\n");
      out.write("<td>\n");
      out.write("<select name=\"Gender\" id=\"Gender\">\n");
      out.write("<option value=\"male\">male</option>\n");
      out.write("<option value=\"female\">female</option>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!----- Submit and Reset ------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\" align=\"center\">\n");
      out.write("<input type=\"submit\" value=\"Submit\">\n");
      out.write("<input type=\"reset\" value=\"Reset\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("    </table>\n");
      out.write("        </form>\n");
      out.write("         </body>\n");
      out.write("    </div>\n");
      out.write("    </head>\n");
      out.write("</html>\n");
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
