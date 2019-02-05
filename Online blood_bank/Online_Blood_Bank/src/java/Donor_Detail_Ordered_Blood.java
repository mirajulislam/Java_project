
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Donor_Detail_Ordered_Blood"})
public class Donor_Detail_Ordered_Blood extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            MyDb db = new MyDb();
            Connection con = db.getCon();

            String Full_Name = request.getParameter("Full_Name");
            String Blood_Group = request.getParameter("Blood_Group");
            String Donated_Date = (request.getParameter("Donated_Date"));
            String Email = request.getParameter("Email");
            String Mobile_Number = request.getParameter("Mobile_Number");
            String City = request.getParameter("City");
            String Address = request.getParameter("Address");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String present = sdf.format(cal.getTime());
            try {

                Statement stmt = con.createStatement();
                  stmt.executeUpdate("insert into `Orderded_Blood_Donor_Detail`( `Full_Name`,  `Blood_Group`,`Donated_Date`,`Email`, `Mobile_Number`, `Address`,`City`,`Today`)values"
                        + "('" + Full_Name + "','" + Blood_Group + "','" + Donated_Date + "','" + Email + "','" + Mobile_Number + "','" + Address + "','" + City + "','" + present + "')");
                    stmt.executeUpdate("insert into `count_donor_donation`(Donated_Date,Email,Mobile_Number)values('" + Donated_Date + "' ,'" + Email + "' , '" + Mobile_Number + "')");
                  String sql1=("update `blood_detail` set Last_Donation='"+Donated_Date+"' where Email='"+Email+"'");
                  String sql2=("update `donor_reg` set Last_Donation='"+Donated_Date+"' where Email='"+Email+"'");
                  int i = stmt.executeUpdate(sql1);
                  int j=stmt.executeUpdate(sql2);
                out.println("<script src=\"js/alertme.js\"></script>");
                out.println("<script src=\"js/alert2.js\"></script>");
                out.println("<script>");
                out.println("$(document).ready(function() {");
                out.println("swal ( 'Successfully' , 'Store Detail ! ' ,' success '  ) ; ");
                out.println("}); ");
                out.println("</script>");
                RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
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
