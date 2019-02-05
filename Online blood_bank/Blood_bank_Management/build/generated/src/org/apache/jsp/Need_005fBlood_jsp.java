package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Need_005fBlood_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<HTML>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <BODY>\n");
      out.write("\n");
      out.write("        <FORM ACTION=\"Search_Blood.jsp\" METHOD=\"POST\">\n");
      out.write("            <table border=\"1\" width=\"400\" align=\"center\" bgcolor=\"#EE82EE\">\n");
      out.write("                <tr><td colspan=2 style=\"font-size:25pt;color:#FF00FF;\" align=\"center\">\n");
      out.write("                        <h3>Search Blood</h3></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Blood Group</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"Blood_Group\" id=\"blood_group\">\n");
      out.write("                            <option value=\"-1\">Select_Blood_Group</option>\n");
      out.write("                            <option value=\"A+\">A+</option>\n");
      out.write("                            <option value=\"A-\">A-</option>\n");
      out.write("                            <option value=\"B+\">B+</option>\n");
      out.write("                            <option value=\"B-\">B-</option>\n");
      out.write("                            <option value=\"AB+\">AB+</option>\n");
      out.write("                            <option value=\"AB-\">AB-</option>\n");
      out.write("                            <option value=\"O+\">O+</option>\n");
      out.write("                            <option value=\"O-\">O-</option>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Location</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"Address\" maxlength=\"15\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>City</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"City\" id=\"city\">\n");
      out.write("                            <option value=\"Selected\">.....selected.....</option>\n");
      out.write("                            <option value=\"Dhaka\">Dhaka</option>\n");
      out.write("                            <option value=\"A-\">Barishal</option>\n");
      out.write("                            <option value=\"Khulna\">\tChattogram</option>\n");
      out.write("                            <option value=\"Borishal\">Khulna</option>\n");
      out.write("                            <option value=\"Chttagong\">Mymensingh</option>\n");
      out.write("                            <option value=\"Mymansng\">Rajshahi</option>\n");
      out.write("                            <option value=\"Shylet\">Rangpur</option>\n");
      out.write("                            <option value=\"Shylet\">Sylhet</option>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=2 align=\"center\">\n");
      out.write("                        <input  type=\"submit\" name=\"submit\" value=\"Search\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("        </FORM>\n");
      out.write("\n");
      out.write("    </BODY>\n");
      out.write("</HTML>");
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
