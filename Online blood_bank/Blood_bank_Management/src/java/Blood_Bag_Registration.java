/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
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
@WebServlet(urlPatterns = {"/Blood_Bag_Registration"})
public class Blood_Bag_Registration extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          MyDb db = new MyDb();
            Connection con = db.getCon();
            
            String Full_Name = request.getParameter("Full_Name");                     
            String Blood_Group = request.getParameter("Blood_Group");
            String Donation_Date = (request.getParameter("Donation_Date"));
             String Mobile_Number = request.getParameter("Mobile_Number");
            String Email = request.getParameter("Email");           
            String Gender = request.getParameter("Gender");
           try{
                        Statement stmt = con.createStatement();
                        stmt.executeUpdate("insert into blood_bag_registration(`Full_Name`, `Blood_Group`,`Donation_Date`,`Mobile_Number`, `Email`, `Gender`)values"
                         + "('" + Full_Name + "','" + Blood_Group + "','" + Donation_Date + "','" + Mobile_Number + "','" + Email + "','" + Gender + "')");
                        RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
                        rd.forward(request, response);
           }catch(Exception e)
           {
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
