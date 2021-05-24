/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custLogin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import newpackage.ConnectionPro;

/**
 *
 * @author SAM
 */
public class EditProfileServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditProfileServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //fetch data from edit form
            int custo_id = Integer.parseInt(request.getParameter("custo_id"));
            String  custo_name= request.getParameter("custo_name");
            String custo_email = request.getParameter("custo_email");
            String custo_pass = request.getParameter("custo_password");
           

            //create book object and set those value to book object
            custUser prof = new custUser();
            
            prof.setCusto_name(custo_name);
            prof.setCusto_email(custo_email);
            prof.setCusto_password(custo_pass);
            prof.setCusto_id(custo_id);
            
            //create new booksdao abject to stored data into it
            custDao bkdao = new custDao(ConnectionPro.getConnection());
            boolean success = bkdao.editProfileInfo(prof);
            
            if (success){
                out.println("<img src=\"img/success.gif\"></img>");
                 out.println("<FONT FACE=\"Comic Sans Ms, Times, Arial\" COLOR=\"#000000\" SIZE=\"big\">");
                 out.println("<body bgcolor='#E6E6FA' text='green' <h1>Profile Updated !!</h1>");
            }else {
                out.print("something not rigtht");
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
