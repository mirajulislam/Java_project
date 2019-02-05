package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Need_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <HEAD>\n");
      out.write("        <TITLE>Fetching Data From a Database</TITLE>\n");
      out.write("    </HEAD>\n");
      out.write("\n");
      out.write("    <BODY>\n");
      out.write("        <H1>Database Lookup</H1>\n");
      out.write("        <FORM ACTION=\"self.jsp\" METHOD=\"POST\">\n");
      out.write("            <table border=\"1\" width=\"400\" align=\"center\" bgcolor=\"#EE82EE\">\n");
      out.write("                <tr><td colspan=2 style=\"font-size:25pt;color:#FF00FF;\" align=\"center\">\n");
      out.write("                        <h3>Search Blood</h3></td></tr>\n");
      out.write("\n");
      out.write("                <tr><td ><b>Blood Name</b></td>\n");
      out.write("                    <td>: <input  type=\"text\" name=\"Blood_Group\" id=\"Blood_Group\">\n");
      out.write("                    </td></tr>\n");
      out.write("\n");
      out.write("                <tr><td ><b>Address</b></td>\n");
      out.write("                    <td>: <input  type=\"text\" name=\"Address\" id=\"Address\">\n");
      out.write("                    </td></tr>\n");
      out.write("\n");
      out.write("                <tr><td ><b>City</b></td>\n");
      out.write("                    <td>: <input  type=\"text\" name=\"City\" id=\"City\">\n");
      out.write("                    </td></tr>\n");
      out.write("\n");
      out.write("                <tr><td colspan=2 align=\"center\">\n");
      out.write("                        <input  type=\"submit\" name=\"submit\" value=\"Search\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("        </FORM>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <H1>Fetching Data From a Database</H1>\n");
      out.write("\n");
      out.write("        ");

            String Blood_Group = request.getParameter("Blood_Group");
            String Address = request.getParameter("Address");
            String City = request.getParameter("City");
            Connection con;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "");
            Statement statement = con.createStatement();
            ResultSet resultset = statement.executeQuery("select * from `blood_detail` where Blood_Group='" + Blood_Group + "' or  Address='" + Address + "' or City='" + City + "'");

            if (!resultset.next()) {
                out.println("Sorry, could not find that publisher. "
                        + "Please <A HREF='tryAgain.html'>try again</A>.");
            } else {
        
      out.write("\n");
      out.write("\n");
      out.write("        <TABLE BORDER=\"1\">\n");
      out.write("            <TR>\n");
      out.write("                <TH>Blood_ID</TH>\n");
      out.write("                <TH>Full_Name</TH>\n");
      out.write("                <TH>Blood_Group</TH>\n");
      out.write("                <TH>Last_Donation</TH>\n");
      out.write("                <TH>Mobile</TH>\n");
      out.write("                <TH>Email</TH>\n");
      out.write("                <TH>Address</TH>\n");
      out.write("                <TH>City</TH>\n");
      out.write("\n");
      out.write("            </TR>\n");
      out.write("            <TR>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(1));
      out.write(" </TD>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(2));
      out.write(" </TD>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(3));
      out.write(" </TD>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(4));
      out.write(" </TD>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(5));
      out.write(" </TD>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(6));
      out.write(" </TD>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(7));
      out.write(" </TD>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(8));
      out.write(" </TD>\n");
      out.write("            </TR>\n");
      out.write("        </TABLE>\n");
      out.write("        <BR>\n");
      out.write("        ");

            }
        
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
