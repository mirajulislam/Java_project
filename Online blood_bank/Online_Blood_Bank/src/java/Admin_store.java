import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/Admin_store"})
public class Admin_store extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             MyDb db = new MyDb();
            Connection con = db.getCon();
            
            String User_Name = request.getParameter("User_Name");
            String Password = request.getParameter("Password");    
            String Blood_Group = request.getParameter("Blood_Group");
            String Last_Donation = (request.getParameter("Last_Donation"));
            String Email = request.getParameter("Email");
            String Mobile_Number = request.getParameter("Mobile_Number");
          
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String present = sdf.format(cal.getTime());

            String mail = "";
                        try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select Email from check_mail where(Email='" + Email + "')");
                while (rs.next()) {
                    Email = request.getParameter("Email");
                    mail = rs.getString(1);
                }
                if (mail.equals(Email)) {
                    Statement st1 = con.createStatement();
//                            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
//                            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                     out.println("<script src=\"js/alertme.js\"></script>");
                            out.println("<script src=\"js/alert2.js\"></script>");
                            out.println("<script>");
                            out.println("$(document).ready(function() {");
                            out.println("swal ('INCORRECT  ' , 'Email Already Use ! ' ,' error ' ) ; ");
                            out.println("}); ");
                            out.println("</script>");
                            RequestDispatcher rd = request.getRequestDispatcher("Admin_Registration.html");
                            rd.include(request, response);
                } else {

                        Statement stmt = con.createStatement();
                        stmt.executeUpdate("insert into admin_reg( `User_Name`, `Password`, `Blood_Group`,`Last_Donation`,`Email`, `Mobile_Number`, `Today`)values"
                                + "('" + User_Name + "','" + Password + "','" + Blood_Group + "','" + Last_Donation + "','" + Email + "','" + Mobile_Number + "','" + present + "')");
                      stmt.executeUpdate("insert into check_mail(Email,Today)values('" + Email + "' , '" + present + "')");
                      
                                  out.println("<script src=\"js/alertme.js\"></script>");
                            out.println("<script src=\"js/alert2.js\"></script>");
                            out.println("<script>");
                            out.println("$(document).ready(function() {");
                            out.println("swal ( 'WELCOME' , 'Admin ! ' ,' success '  ) ; ");
                            out.println("}); ");
                            out.println("</script>");
                            RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
                            rd.include(request, response);
                 }
                
            } catch (Exception e) {
                System.out.print(e);
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
