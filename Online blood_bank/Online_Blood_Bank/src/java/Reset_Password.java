
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/Reset_Password"})
public class Reset_Password extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();

            String id = request.getParameter("id");
            String currentPassword = request.getParameter("current");
            String Newpass = request.getParameter("new");
            String conpass = request.getParameter("confirm");
            String pass = "";

            MyDb db = new MyDb();
            Connection con = db.getCon();
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from donor_reg where(id='" + id + "')AND( Password ='" + currentPassword + "')");
                while (rs.next()) {
                    id = request.getParameter("id");
                    pass = rs.getString(4);
                }
                System.out.println(id + " " + pass);
                if (pass.equals(currentPassword)) {
                    Statement st1 = con.createStatement();
                    int i = st1.executeUpdate("update donor_reg set Password='" + Newpass + "' where id='" + id + "'");
                    out.println("<script src=\"js/alertme.js\"></script>");
                    out.println("<script src=\"js/alert2.js\"></script>");
                    out.println();
                    out.println("<script>");
                    out.println("$(document).ready(function() {");
                    out.println("swal ( 'Password' , 'Successfully Change! ' ,' success '  ) ; ");
                    out.println("}); ");
                    out.println("</script>");
                    RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
                    rd.include(request, response);
                } else {
                    out.println("<script src=\"js/alertme.js\"></script>");
                    out.println("<script src=\"js/alert2.js\"></script>");
                    out.println("<script>");
                    out.println("$(document).ready(function() {");
                    out.println("swal ('INCORRECT  ' , 'Username Or Password ! ' ,' error ' ) ; ");
                    out.println("}); ");
                    out.println("</script>");
                    RequestDispatcher rd = request.getRequestDispatcher("changePassword.jsp");
                    rd.include(request, response);
                }

            } catch (Exception e) {
                out.println(e);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
