
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Store"})
public class Store extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String Full_Name = request.getParameter("Full_Name");
            String Blood_Group = request.getParameter("Blood_Group");
            String Last_Donation = request.getParameter("Last_Donation");
            String Mobile_Number = request.getParameter("Mobile_Number");
            String Email = request.getParameter("Email");
            String Address = request.getParameter("Address");
            String City = request.getParameter("City");
            String id = request.getParameter("id");
            String Price = request.getParameter("Price");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String present = sdf.format(cal.getTime());
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_website", "root", "");
                Statement st = conn.createStatement();
                int i = st.executeUpdate("insert into blood_detail(Full_Name,Blood_Group,Last_Donation,Mobile_Number,Email,Address,City,id,Price,time)values('" + Full_Name + "','" + Blood_Group + "','" + Last_Donation + "','" + Mobile_Number + "','" + Email + "','" + Address + "','" + City + "','" + id + "','" + Price + "','" + present + "')");
                out.println("<script src=\"js/alertme.js\"></script>");
                out.println("<script src=\"js/alert2.js\"></script>");
                out.println();
                out.println("<script>");
                out.println("$(document).ready(function() {");
                out.println("swal ( 'WELCOME' , 'Successfully Insert! ' ,' success '  ) ; ");
                out.println("}); ");
                out.println("</script>");
                RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
                rd.include(request, response);
            } catch (Exception e) {
                System.out.print(e);
                e.printStackTrace();
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
