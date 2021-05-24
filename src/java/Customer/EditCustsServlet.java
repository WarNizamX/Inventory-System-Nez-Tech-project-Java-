
package Customer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import newpackage.ConnectionPro;


public class EditCustsServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditCustsServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
             //fetch data from the form
            
            int cust_id = Integer.parseInt(request.getParameter("cust_id"));
            String cust_firstname = request.getParameter("cust_firstname");
            String cust_lastname = request.getParameter("cust_lastname");
            String cust_email = request.getParameter("cust_email");
            String cust_addr = request.getParameter("cust_addr");
            String c_p = request.getParameter("cust_phone");
          

            //create cat object and set those value to cat object
            customers customer = new customers();
     
            customer.setCust_firstname(cust_firstname);
            customer.setCust_lastname(cust_lastname);
            customer.setCust_email(cust_email);
            customer.setCust_addr(cust_addr);
            customer.setCust_phone(c_p);
            customer.setCust_id(cust_id);
      

            //create new booksdao abject to stored data into it
            custDao bkdao = new custDao(ConnectionPro.getConnection());
            boolean success = bkdao.editCustomerInfo(customer);
            
            if (success){
                 out.println("<img src=\"img/success.gif\"></img>");
                 out.println("<FONT FACE=\"Comic Sans Ms, Times, Arial\" COLOR=\"#000000\" SIZE=\"big\">");
                 out.println("<body bgcolor='#E6E6FA' text='green' <h1>Edited Success !!</h1>");
            }else {
                out.print("Something not rigtht");
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
