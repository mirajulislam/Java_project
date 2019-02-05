
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Registration_Store"})
public class Registration_Store extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            MyDb db = new MyDb();
            Connection con = db.getCon();
            String Full_Name = request.getParameter("Full_Name");
            String User_Name = request.getParameter("User_Name");
            String Password = request.getParameter("Password");

            String Birthday_Day = (request.getParameter("Birthday_Day"));
            String Blood_Group = request.getParameter("Blood_Group");
            String Last_Donation = (request.getParameter("Last_Donation"));
            String Email = request.getParameter("Email");
            String Mobile_Number = request.getParameter("Mobile_Number");
            String Gender = request.getParameter("Gender");
            String Address = request.getParameter("Address");
            String City = request.getParameter("City");
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String present = sdf.format(cal.getTime());

            String mail = "";
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select Email from check_gmail where(Email='" + Email + "')");
                while (rs.next()) {
                    Email = request.getParameter("Email");
                    mail = rs.getString(1);
                }
                if (mail.equals(Email)) {
                    Statement st1 = con.createStatement();
                    out.println("Email allready use");
                    st1.close();
                    con.close();
                } else {
                    if (Full_Name.isEmpty() || User_Name.isEmpty() || Password.isEmpty() || Blood_Group.isEmpty() || Email.isEmpty() || Mobile_Number.isEmpty() || Gender.isEmpty() || Address.isEmpty() || City.isEmpty()) {
                        RequestDispatcher rd = request.getRequestDispatcher("Donor_Registration.jsp");
                        out.println("<font color=red>Please fill all the fields</font>");
                        rd.include(request, response);
                    } else {

                        Statement stmt = con.createStatement();
                        stmt.executeUpdate("insert into donor_registration(`Full_Name`, `User_Name`, `Password`,  `Birthday_Day`, `Blood_Group`,`Last_Donation`,`Email`, `Mobile_Number`, `Gender`, `Address`, `City`,`Today`)values"
                                + "('" + Full_Name + "','" + User_Name + "','" + Password + "','" + Birthday_Day + "','" + Blood_Group + "','" + Last_Donation + "','" + Email + "','" + Mobile_Number + "','" + Gender + "','" + Address + "','" + City + "','" + present + "')");
                        stmt.executeUpdate("insert into check_gmail(Email)values('" + Email + "')");
                        RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
                        rd.forward(request, response);

                    }
                }
            } catch (Exception e) {
                System.out.print(e);
            }

        }
    }

    private Date convertStringToDate(String strDate) {

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date d = null;

        try {

            d = format.parse(strDate);

        } catch (ParseException e) {

            e.printStackTrace();
        }

        return new Date(d.getTime());
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
        PrintWriter out = response.getWriter();

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
