/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

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
public class MinusProdsServlet extends HttpServlet {

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
            out.println("<title>Servlet MinusProdsServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            //fetch data from edit form
            int prod_id = Integer.parseInt(request.getParameter("prod_id"));
            String  prod_name= request.getParameter("prod_name");       
            int prod_quantity = Integer.parseInt(request.getParameter("prod_quantity"));
           

            //create book object and set those value to book object
            products prod = new products();
            
            prod.setProd_name(prod_name);
     
            prod.setProd_quantity(prod_quantity);
            prod.setProd_id(prod_id);
            
            //create new booksdao abject to stored data into it
            prodDao bkdao = new prodDao(ConnectionPro.getConnection());
            boolean success = bkdao.minusProductInfo(prod);
            
            if (success){
                out.println("<img src=\"img/success.gif\"></img>");
                 out.println("<FONT FACE=\"Comic Sans Ms, Times, Arial\" COLOR=\"#000000\" SIZE=\"big\">");
                 out.println("<body bgcolor='#E6E6FA' text='green' <h1>Stock Updated !!</h1>");
            }else {
                out.println("<img src=\"img/eror.gif\"></img>");
                 out.println("<FONT FACE=\"Comic Sans Ms, Times, Arial\" COLOR=\"#000000\" SIZE=\"big\">");
                 out.println("<body bgcolor='#E6E6FA' text='green' <h1>Fail to Delete Stock !!</h1>");
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
