

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //  PrintWriter out = response.getWriter();
            String Blood_Group = request.getParameter("Blood_Group");
            String Address = request.getParameter("Address");
            String City = request.getParameter("City");
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    Calendar cal = Calendar.getInstance();
            String present=sdf.format(cal.getTime());
            cal.add(Calendar.DAY_OF_MONTH,-92);  	
	    String newDate = sdf.format(cal.getTime()); 
        
            out.print("<h1>Blood_Donor_Detail</h2>");
            out.print("<table border='1' style=\"background-color:FFB6C1\"><tr><th>Blood_id</th><th>Full_Name</th><th>Blood_Group</th><th>Last_Donation</th><th>Mobile</th><th>Email</th><th>Address</th><th>City</th> <th>Price</th> <th>Donor Profile</th> </tr> ");
            try {
                
                Connection con;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from `blood_detail` where Last_Donation NOT BETWEEN '" + newDate + "' AND '" + present + "' AND (Blood_Group='" + Blood_Group + "' and  City='" + City + "')");
                while (rs.next()) {
                    out.print("<tr><td>");
                    out.println(rs.getInt(1));
                    out.print("</td>");
                    out.print("<td>");
                    out.print(rs.getString(2));
                    out.print("</td>");
                    out.print("<td>");
                    out.print(rs.getString(3));
                    out.print("</td>");
                    out.print("<td>");
                    out.print(rs.getString(4));
                    out.print("</td>");
                    out.print("<td>");
                    out.print(rs.getString(5));
                    out.print("</td>");
                    out.print("<td>");
                    out.print(rs.getString(6));
                    out.print("</td>");
                    out.print("<td>");
                    out.print(rs.getString(7));
                    out.print("</td>");
                    out.print("<td>");
                    out.print(rs.getString(8));
                    out.print("</td>");
                    out.print("<td>");
                    out.print(rs.getString(10));
                    out.print("</td>");
                    out.print("<td>");
                    out.print("<input type='submit' value ='View' name=s1/ form action=\"s1\" method=\"post\" >");
                    out.print("</tr>");
                   
                }
            } catch (Exception p) {
                System.out.println(p);
            }
            System.out.println("</table>");
       
        }
        }
          
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
              PrintWriter out = response.getWriter();

         
         
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
