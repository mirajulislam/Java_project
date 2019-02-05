
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Order"})
public class Order extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

             MyDb db = new MyDb();
            Connection con = db.getCon();
            
            String blood_id = request.getParameter("blood_id");
            String Blood_Group = request.getParameter("Blood_Group");
            String Price = request.getParameter("Price");
            String Delivary = (request.getParameter("Delivary"));
            String Full_Name = (request.getParameter("Full_Name"));
            String Mobile_Number = request.getParameter("Mobile");
            String Email = request.getParameter("Email");
            String Address = (request.getParameter("Address"));
            String City = (request.getParameter("City"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String present = sdf.format(cal.getTime());
            
            Statement stmt;
            try {
                stmt = con.createStatement();
                 stmt.executeUpdate("insert into order_blood (blood_id, Blood_Group, Price,Delivary ,Full_Name, Mobile_Number,Email, Address, City,present)values"
                                + "('" + blood_id + "','" + Blood_Group + "','" + Price + "','" + Delivary + "','" + Full_Name + "','" + Mobile_Number + "','" + Email + "','" + Address + "','" + City + "','" + present + "')");
              out.println("<script src=\"js/alertme.js\"></script>");
                            out.println("<script src=\"js/alert2.js\"></script>");
                            out.println();
                            out.println("<script>");
                            out.println("$(document).ready(function() {");
                            out.println("swal ( 'ORDER' , 'Successfully .. Check Mail After 12 Hour ! ' ,' success"
                                    + " '  ) ; ");
                            out.println("}); ");
                            out.println("</script>");
                            RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
                            rd.include(request, response);
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
