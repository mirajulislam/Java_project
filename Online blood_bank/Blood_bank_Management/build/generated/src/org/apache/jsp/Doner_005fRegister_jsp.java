package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Doner_005fRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <link href=\"stylee2.css\" rel=\"stylesheet\" type =\"text/css\">\n");
      out.write("    <div id=\"main-content\">\n");
      out.write("         <h3>DONOR REGISTRATION FORM</h3> \n");
      out.write("         <body>\n");
      out.write("        <form  action=\"Add\" method=\"post\">\n");
      out.write("         <table align=\"center\" cellpadding = \"10\">\n");
      out.write("             \n");
      out.write("<tr>\n");
      out.write("<td>FULL NAME</td>\n");
      out.write("<td><input type=\"text\" name=\"Full_Name\" maxlength=\"30\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<!----- Last Name ---------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>USER_NAME</td>\n");
      out.write("<td><input type=\"text\" name=\"User_Name\" maxlength=\"30\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>PASSWORD</td>\n");
      out.write("<td><input type=\"password\" name=\"Password\" maxlength=\"10\"/>\n");
      out.write("    (10 digit character and number)\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>TYPE_BLOOD_GROUP</td>\n");
      out.write("<td>\n");
      out.write("<select name=\"Blood_Group\" id=\"blood_group\">\n");
      out.write("<option value=\"-1\">Select_Blood_Group</option>\n");
      out.write("<option value=\"A+\">A+</option>\n");
      out.write("<option value=\"A-\">A-</option>\n");
      out.write("<option value=\"B+\">B+</option>\n");
      out.write(" <option value=\"B-\">B-</option>\n");
      out.write(" <option value=\"AB+\">AB+</option>\n");
      out.write("<option value=\"AB-\">AB-</option>\n");
      out.write("<option value=\"O+\">O+</option>\n");
      out.write("<option value=\"O-\">O-</option>\n");
      out.write("<option value=\"OB+\">OB-</option>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<!----- Date Of Birth -------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>DATE OF BIRTH</td>\n");
      out.write(" \n");
      out.write("<td><input type=\"date\" id=\"Birthday_day>\"</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<!----- Email Id ---------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>EMAIL ID</td>\n");
      out.write("<td><input type=\"text\" name=\"Email_Id\" maxlength=\"100\" /></td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<!----- Mobile Number ---------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>MOBILE NUMBER</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"text\" name=\"Mobile_Number\" maxlength=\"15\" />\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<!----- Gender ----------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>GENDER</td>\n");
      out.write("<td>\n");
      out.write("Male <input type=\"radio\" name=\"Gender\" value=\"Male\" />\n");
      out.write("Female <input type=\"radio\" name=\"Gender\" value=\"Female\" />\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<!----- Address ---------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>ADDRESS <br /><br /><br /></td>\n");
      out.write("<td><textarea name=\"Address\" rows=\"4\" cols=\"30\"></textarea></td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<!----- City ---------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>CITY</td>\n");
      out.write("<td><input type=\"text\" name=\"City\" maxlength=\"30\" />\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<!----- Pin Code ---------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>PIN CODE</td>\n");
      out.write("<td><input type=\"text\" name=\"Pin_Code\" maxlength=\"8\" />\n");
      out.write("    (8 digit number)\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<!----- Country ---------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>COUNTRY</td>\n");
      out.write("<td><input type=\"text\" name=\"country\" maxlength=\"30\"/>\n");
      out.write("</tr>\n");
      out.write(" <!----- Submit and Reset ------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\" align=\"center\">\n");
      out.write("<input type=\"submit\" value=\"Submit\">\n");
      out.write("<input type=\"reset\" value=\"Reset\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("         </table>\n");
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
