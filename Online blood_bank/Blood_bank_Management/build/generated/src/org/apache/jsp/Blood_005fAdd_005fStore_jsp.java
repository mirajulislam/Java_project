package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Blood_005fAdd_005fStore_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String user_id = request.getParameter("user_id");
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

      out.write('\n');
      out.write('\n');

    try {
        connection = DriverManager.getConnection(connectionUrl + database, userid, password);
        statement = connection.createStatement();
        String sql = "select * from donor_registration where user_id=" + user_id;
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <h1>New Bag Ready</h1>\n");
      out.write("        <form method=\"post\" action=\"Blood_add.jsp\">\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"user_id\" value=\"");
      out.print(resultSet.getString("user_id"));
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            Id:\n");
      out.write("            <td><input type='text' name=\"user_id\" value=\"");
      out.print(resultSet.getString("user_id"));
      out.write("\" readonly>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                Full_name:\n");
      out.write("                <input type=\"text\" name=\"Full_Name\" value=\"");
      out.print(resultSet.getString("Full_Name"));
      out.write("\" readonly>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                Blood_Group:\n");
      out.write("                <input type=\"text\" name=\"Blood_Group\" value=\"");
      out.print(resultSet.getString("Blood_Group"));
      out.write("\" readonly>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                Last_Donation:\n");
      out.write("                <input type=\"text\" name=\"Last_Donation\" value=\"");
      out.print(resultSet.getString("Last_Donation"));
      out.write("\" readonly>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                Mobile_Number:\n");
      out.write("                <input type=\"text\" name=\"Mobile_Number\" value=\"");
      out.print(resultSet.getString("Mobile_Number"));
      out.write("\" readonly>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                Email:\n");
      out.write("                <input type=\"text\" name=\"Email\" value=\"  ");
      out.print(resultSet.getString("Email"));
      out.write("\" readonly>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                Address:\n");
      out.write("                <input type=\"text\" name=\"Address\" value=\"");
      out.print(resultSet.getString("Address"));
      out.write("\" readonly>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                City:\n");
      out.write("                <input type=\"text\" name=\"City\" value=\"");
      out.print(resultSet.getString("City"));
      out.write("\" readonly>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                Price:\n");
      out.write("                <select name=\"Price\" id=\"price\">\n");
      out.write("                    <option value=\"399\">399</option>\n");
      out.write("                    <option value=\"499\">499</option>\n");
      out.write("                    <option value=\"599\">599</option>\n");
      out.write("                    <option value=\"699\">699</option>\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"submit\">\n");
      out.write("        </form>\n");
      out.write("        ");

                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
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
