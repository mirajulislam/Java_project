/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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


@WebServlet(urlPatterns = {"/Forgot_Process"})
public class Forgot_Process extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            java.util.Random generator = new java.util.Random();
            generator.setSeed(System.currentTimeMillis());
            int i = generator.nextInt(1000000) % 1000000;

            java.text.DecimalFormat f = new java.text.DecimalFormat("000000");
            String ss = f.format(i);
            //System.out.println(ss);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String present = sdf.format(cal.getTime());

            MyDb db = new MyDb();
            Connection con = db.getCon();
            String Email = request.getParameter("email");
            String mail = "";
            HttpSession session=request.getSession();
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select Email from donor_registration where(Email='" + Email + "')");
                
                while (rs.next()) {
                    Email = request.getParameter("email");
                    mail = rs.getString(1);
                    session.setAttribute("email",rs.getString(1));
                }
                if (mail.equals(Email)) {
                    Statement st1 = con.createStatement();
                     
                    st1.executeUpdate("insert into forgot_password_option1(code,email,date)values('" + ss + "','" + Email + "','" + present + "')");
                   
                    RequestDispatcher rd = request.getRequestDispatcher("CodeSend.jsp");
                    rd.forward(request, response);
                    st1.close();
                    con.close();
                } else {
                    out.println("Wrong email number use");
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
