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

@WebServlet(urlPatterns = {"/Forgot_Password_New"})
public class Forgot_Password_New extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();

            String code = request.getParameter("code");
            String email = request.getParameter("email");
            String Newpass = request.getParameter("new");
            String conpass = request.getParameter("confirm");
            //String pass="";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String present = sdf.format(cal.getTime());
            MyDb db = new MyDb();
            Connection con = db.getCon();
            try {

                Statement stmt = con.createStatement();
                stmt.executeUpdate("insert into forgot_password_option2(code,email,Password,date)values('" + code + "','" + email + "','" + Newpass + "','" + present + "')");
                stmt.executeUpdate("update donor_reg set Password='" + Newpass + "' where Email='" + email + "'");
                stmt.executeUpdate("update admin_reg set password='" + Newpass + "' where Email='" + email + "'");
//                out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
//                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                out.println("<script src=\"js/alertme.js\"></script>");
                out.println("<script src=\"js/alert2.js\"></script>");
                out.println("<script>");
                out.println("$(document).ready(function() {");
                out.println("swal ( 'WELCOME' , 'Successfully Change! ' ,' success '  ) ; ");
                out.println("}); ");
                out.println("</script>");
                RequestDispatcher rd = request.getRequestDispatcher("login.html");
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
