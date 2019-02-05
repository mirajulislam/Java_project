package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Need_005fblood_005fgroup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String driver = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String database = "bloodbank";
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <table border=\"1\" width=\"400\" align=\"center\" bgcolor=\"#FA8072\">\n");
      out.write("            <tr><td colspan=2 style=\"font-size:25pt;color:#FFFFF0;\" align=\"center\">\n");
      out.write("                    <h4>Donor_Detail</h4></td></tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Full_Name</td>\n");
      out.write("                <td>Blood_Group</td>\n");
      out.write("                <td>Last_Donation</td>\n");
      out.write("                <td>Mobile_Number</td>\n");
      out.write("                <td>Email</td>\n");
      out.write("                <td>Address</td>\n");
      out.write("                <td>City</td>\n");
      out.write("                <td>Blood_Id</td>\n");
      out.write("                <td>Buy</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                String Blood_Group = request.getParameter("Blood_Group");
                String Address = request.getParameter("Address");
                String City = request.getParameter("City");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Calendar cal = Calendar.getInstance();
                String present = sdf.format(cal.getTime());
                cal.add(Calendar.DAY_OF_MONTH, -92);
                String newDate = sdf.format(cal.getTime());

                try {
                    connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                    statement = connection.createStatement();
                    String sql = "select * from `blood_detail` where Last_Donation NOT BETWEEN '" + newDate + "' AND '" + present + "' AND (Blood_Group='" + Blood_Group + "' and  City='" + City + "'";
                    resultSet = statement.executeQuery(sql);
                    int i = 0;
                    while (resultSet.next()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(resultSet.getString("Full_Name"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("Blood_Group"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("Last_Donation"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("Mobile_Number"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("Email"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("Address"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("City"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(resultSet.getString("blood_id"));
      out.write("</td>\n");
      out.write("                <td><a href=\".jsp?blood_id=");
      out.print(resultSet.getString("blood_id"));
      out.write("\"><button type=\"button\" class=\"buy\">Buy</button></a></td>\n");
      out.write("                <td><a href=\".jsp?blood_id=");
      out.print(resultSet.getString("blood_id"));
      out.write("\"><button type=\"button\" class=\"view\">View_Donor</button></a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                        i++;
                    }
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
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
