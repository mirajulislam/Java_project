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
import java.util.ArrayList;
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
@WebServlet(urlPatterns = {"/Serach"})
public class Serach extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Statement st;
            try {
                String Blood_Group = request.getParameter("Blood_Group");
                String Address = request.getParameter("Address");
                String City = request.getParameter("City");
                ArrayList al = null;
                ArrayList blood_list = new ArrayList();
                MyDb db = new MyDb();
                Connection con = db.getCon();
                String query = "select * from `blood_detail` where Blood_Group='" + Blood_Group + "' or  Address='" + Address + "' or City='" + City + "'";
                //System.out.println("query " + query);
                st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
                    al = new ArrayList();

                    al.add(rs.getString(1));
                    al.add(rs.getString(2));
                    al.add(rs.getString(3));
                    al.add(rs.getString(4));
                    al.add(rs.getString(5));
                    al.add(rs.getString(6));
                    al.add(rs.getString(7));
                    al.add(rs.getString(8));
                    //System.out.println("al :: " + al);
                    blood_list.add(al);
                }

                request.setAttribute("blood_list", blood_list);

                System.out.println("blood_list " + blood_list);
                String nextJSP = "/viewSearch.jsp";
                RequestDispatcher dispatcher
                        = getServletContext().getRequestDispatcher(nextJSP);
                dispatcher.forward(request, response);
                con.close();
                System.out.println("Disconnected from database");
            } catch (Exception e) {
                out.println("<b> failed</b>");
                out.println("<b>Error:</b>" + e);
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
