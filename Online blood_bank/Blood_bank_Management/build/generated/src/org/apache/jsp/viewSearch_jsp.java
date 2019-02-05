package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class viewSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("        <table width=\"700px\" align=\"center\" \n");
      out.write("               style=\"border:1px solid #000000;\">\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=8 align=\"center\" \n");
      out.write("                    style=\"background-color:ffeeff\">\n");
      out.write("                    <b>Donor Record</b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"background-color:efefef;\">\n");
      out.write("                <td><b>Blood_id</b></td>\n");
      out.write("                <td><b>Full_Name</b></td>\n");
      out.write("                <td><b>Blood_group</b></td>\n");
      out.write("                <td><b>Last_Donation No</b></td>\n");
      out.write("                <td><b>Mobile</b></td>\n");
      out.write("                <td><b>Email</b></td>\n");
      out.write("                <td><b>Address</b></td>\n");
      out.write("                <td><b>City</b></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                int count = 0;
                String color = "#F9EBB3";

                if (request.getAttribute("blood_list") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("blood_list");
                    Iterator itr = al.iterator();

                    while (itr.hasNext()) {

                        if ((count % 2) == 0) {
                            color = "#eeffee";
                        } else {
                            color = "#F9EBB3";
                        }
                        count++;
                        ArrayList blood_list = (ArrayList) itr.next();
            
      out.write("\n");
      out.write("            <tr style=\"background-color:");
      out.print(color);
      out.write(";\">\n");
      out.write("                <td>");
      out.print(blood_list.get(0));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(blood_list.get(1));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(blood_list.get(3));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(blood_list.get(4));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(blood_list.get(5));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(blood_list.get(6));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(blood_list.get(7));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(blood_list.get(8));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                }
            
      out.write(" \n");
      out.write("            ");

                if (count == 0) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=8 align=\"center\" \n");
      out.write("                    style=\"background-color:eeffee\"><b>No Record</b></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

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
