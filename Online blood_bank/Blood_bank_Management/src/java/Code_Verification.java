
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
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/Code_Verification"})
public class Code_Verification extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String present = sdf.format(cal.getTime());

            MyDb db = new MyDb();
            Connection con = db.getCon();
            String code = request.getParameter("code");
            String email=request.getParameter("email");
            String num = "";
            String mail="";
            HttpSession session=request.getSession();
            
             try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from forgot_password_option1 where(code='" + code + "')");
                while (rs.next()) {      
                    
                    code = request.getParameter("code");
                    
                    session.setAttribute("code",rs.getString(2));
                    session.setAttribute("email",rs.getString(3));
                    num = rs.getString(2); 
                    mail=rs.getString(3);
                }
                    if (num.equals(code) & mail.equals(email)) {
                    Statement st1 = con.createStatement();
                    
                    RequestDispatcher rd = request.getRequestDispatcher("newpassword.jsp");
              
                    rd.forward(request, response);
                    st1.close();
                    con.close();
                } else {
                    out.println("Wrong code use");
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
