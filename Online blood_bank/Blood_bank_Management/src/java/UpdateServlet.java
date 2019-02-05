
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/UpdateServlet"}) 
public class UpdateServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          
        try (PrintWriter out = response.getWriter()) {
          HttpSession session=request.getSession();
           String id = request.getParameter("id");
           String User_Name = request.getParameter("User_Name");
           String Full_Name = request.getParameter("Full_Name");
           String Mobile_Number = request.getParameter("Mobile_Number");
           String Last_Donation = request.getParameter("Last_Donation");
           String Address = request.getParameter("Address");
           String City = request.getParameter("City");           
           
           
          MyDb db = new MyDb();
          Connection con = db.getCon();         
            try {     
        Statement stmt =con.createStatement();
        String sql=("update donor_registration set  User_Name='"+User_Name+"', Full_Name='"+Full_Name+"',Last_Donation='"+Last_Donation+"',Address='"+Address+"',City='"+City+"', Mobile_Number='"+Mobile_Number+"' where user_id='"+id+"'");
        String sql1=("update `blood_detail` set Full_Name='"+Full_Name+"',Last_Donation='"+Last_Donation+"',Address='"+Address+"',City='"+City+"', Mobile_Number='"+Mobile_Number+"' where user_id='"+id+"'");
              int i=stmt.executeUpdate(sql);
              int j=stmt.executeUpdate(sql1);
              if(true){
             out.println("<b>You are successfully update</b>");
             con.close();
                }else
{
out.print("There is a problem in updating Record.");
}   
            } catch (SQLException e) {
               out.println("<b> failed</b>");
               out.println("<b>Error:</b>" +e);
            }
            
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }



}
