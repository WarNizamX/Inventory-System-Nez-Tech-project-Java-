
package custLogin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServletCust extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServletCust</title>");            
            out.println("</head>");
            out.println("<body>");
           
            String lEmail = request.getParameter("custo_email");
            String lPass = request.getParameter("custo_password");
            
            custUserDatabase db = new custUserDatabase(CustConnection.getConnection());
            custUser CustUser = db.logcustUser(lEmail, lPass);
            if(CustUser!=null){
                HttpSession session = request.getSession();
                session.setAttribute("logcustUser",CustUser);
                response.sendRedirect("welcomeCust.jsp");
            }else{
                 out.println("<img src=\"img/eror.gif\"></img>");
                 out.println("<FONT FACE=\"Comic Sans Ms, Times, Arial\" COLOR=\"#FF0000\" SIZE=\"big\">");
                 out.println("<body bgcolor='#FFFFFF' text='red' <h1>Invalid User!!</h1>");
                
            }
            
            
            
            out.println("</body>");
            out.println("</html>");
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
