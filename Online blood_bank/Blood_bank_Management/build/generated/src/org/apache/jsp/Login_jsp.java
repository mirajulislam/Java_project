package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"stylee1.css\" rel=\"stylesheet\" type =\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form  action=\"LOGIN\" method=\"post\">\n");
      out.write("        <div id=\"main-content\">\n");
      out.write("           \n");
      out.write("<form class=\"pure-form\">\n");
      out.write("   <h1>Sign_In</h1>\n");
      out.write("   <h4>Fill the form below to get instant access</h4>\n");
      out.write("   \n");
      out.write("  User Name :<input type=\"text\" name = \"User_Name\" placeholder=\"username\">\n");
      out.write("  <br>\n");
      out.write("  <br/>\n");
      out.write("  \n");
      out.write("Password :<input type=\"password\" name = \"Password\" placeholder=\"password\">\n");
      out.write("  <br>\n");
      out.write("  <br/>\n");
      out.write("\n");
      out.write("Role : <select name=\"select\" >\n");
      out.write("  <option value=\"none\">.........select.......</option>\n");
      out.write("  <option value=\"Admin\">Admin</option>\n");
      out.write("  <option value=\"Donor\">Donor</option>\n");
      out.write("</select>\n");
      out.write("<br>\n");
      out.write("  <br/>\n");
      out.write("  \n");
      out.write("  <input value=\"Submit\" type=\"submit\">\n");
      out.write("  <div id=\"navl\">\n");
      out.write("  <h4><a href=\"Home.jsp\">forgot password </a></h4>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  </form>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
