package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reset_005fpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"reset.css\" rel=\"stylesheet\" type =\"text/css\">\n");
      out.write("        <title>Change Password</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main-content\">\n");
      out.write("            <br><br><br>\n");
      out.write("            <form method=\"post\" action=\"Reset_Password\">\n");
      out.write("                <h1 align=\"center\">Change Password</h1>\n");
      out.write("                <table align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type ='hidden' name='id' value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                     <tr>\n");
      out.write("                    <td>Current Password:</td>\n");
      out.write("                    <td><input type =\"password' name=\"current\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                    <td>New Password:</td>\n");
      out.write("                    <td><input type =\"password' name=\"new\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                    <td>Confirm Password:</td>\n");
      out.write("                    <td><input type =\"password' name=\"confirm\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type =\"submit' value=\"Change\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
