
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/LOGIN"})
public class LOGIN extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            response.setContentType("text/html");

            String User_Name = request.getParameter("username");
            String Email = request.getParameter("username");
            String Password = request.getParameter("Password");
            String select1 = request.getParameter("select");

            HttpSession session = request.getSession();

            MyDb db = new MyDb();
            Connection con = db.getCon();
            if ("Donor".equals(select1)) {
                try {

                    if (Email != null) {

                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from donor_reg where(User_Name='" + User_Name + "' or Email ='" + Email + "')AND( Password  ='" + Password + "')");
                        //ResultSet rs=pst.executeQuery();
                        if (rs.next()) {


                            session.setAttribute("Full_Name", rs.getString(2));
                            session.setAttribute("user_id", rs.getString(1));
                            session.setAttribute("User_Name", rs.getString(3));
                            session.setAttribute("Password", rs.getString(4));
                            session.setAttribute("Blood_Group", rs.getString(6));
                            session.setAttribute("Last_Donation", rs.getString(7));
                            session.setAttribute("Mobile_Number", rs.getString(9));
                            session.setAttribute("Address", rs.getString(11));
                            session.setAttribute("City", rs.getString(12));
                            session.setAttribute("Email", rs.getString(8));
//                            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
//                            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                            out.println("<script src=\"js/alertme.js\"></script>");
                            out.println("<script src=\"js/alert2.js\"></script>");
                            out.println();
                            out.println("<script>");
                            out.println("$(document).ready(function() {");
                            out.println("swal ( 'WELCOME' , 'Successfully Login! ' ,' success '  ) ; ");
                            out.println("}); ");
                            out.println("</script>");
                            RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
                            rd.include(request, response);
                        } else {
//                            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
//                            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                            out.println("<script src=\"js/alertme.js\"></script>");
                            out.println("<script src=\"js/alert2.js\"></script>");
                            out.println("<script>");
                            out.println("$(document).ready(function() {");
                            out.println("swal ('INCORRECT  ' , 'Username Or Password ! ' ,' error ' ) ; ");
                            out.println("}); ");
                            out.println("</script>");
                            RequestDispatcher rd = request.getRequestDispatcher("login.html");
                            rd.include(request, response);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if ("Admin".equals(select1)) {

                try {
                    if (User_Name != null) {
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from admin_reg where(User_Name='" + User_Name + "' or Email ='" + Email + "')AND( Password  ='" + Password + "')");
                        if (rs.next()) {
//                           out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
//                            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                            out.println("<script src=\"js/alertme.js\"></script>");
                            out.println("<script src=\"js/alert2.js\"></script>");
                            out.println("<script>");
                            out.println("$(document).ready(function() {");
                            out.println("swal ( 'WELCOME' , 'Admin ! ' ,' success '  ) ; ");
                            out.println("}); ");
                            out.println("</script>");
                            RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
                            rd.include(request, response);
                        } else {
//                               out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
//                            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                            out.println("<script src=\"js/alertme.js\"></script>");
                            out.println("<script src=\"js/alert2.js\"></script>");
                            out.println("<script>");
                            out.println("$(document).ready(function() {");
                            out.println("swal ('ADMIN ' , '  Your Password Wrong!' ,' error ' ) ; ");
                            out.println("}); ");
                            out.println("</script>");
                            RequestDispatcher rd = request.getRequestDispatcher("login.html");
                            rd.include(request, response);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
