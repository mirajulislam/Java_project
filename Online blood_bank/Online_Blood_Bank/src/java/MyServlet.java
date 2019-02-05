
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          //  PrintWriter out = response.getWriter();  
//
//            response.setContentType("text/html");
//            out.println("<script type=\"text/javascript\">");
//            out.println("alert('Your Password Wrong');");
//            out.println("</script>");
          
//            request.setAttribute("errorMessage", "Invalid password"); ;
//            RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
//            dispatcher.forward(request, response);
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
        PrintWriter out = response.getWriter();
        String uid = request.getParameter("uid");
        String pass = request.getParameter("pass");
        if (uid.equals(pass)) {
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");         
            out.println("<script>");
            out.println("$(document).ready(function() {");
            out.println("swal ( 'WELCOME' , 'successfull ! ' ,' success '  ) ; ");
            out.println("}); ");
            out.println("</script>");
            RequestDispatcher rd=request.getRequestDispatcher("contact.html");
            rd.include(request, response);
           // response.sendRedirect("contact.html");
        } else {
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println("$(document).ready(function() {");
            out.println("swal ('incorrect USERNAME OR PASSWORD ! ' , ' ' ,' error ' ) ; ");
            out.println("}); ");
            out.println("</script>");
            RequestDispatcher rd=request.getRequestDispatcher("login.html");
            rd.include(request, response);
          //  response.sendRedirect("l");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
