
package Customer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import newpackage.ConnectionPro;



public class AddCustomersServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddCustomersServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //fetch data from the form
            String custfn = request.getParameter("cust_firstname");
            String custln = request.getParameter("cust_lastname");
            String custmail = request.getParameter("cust_email"); 
            String custaddr = request.getParameter("cust_addr");
            String custp = request.getParameter("cust_phone");
            
            customers customer = new customers(custfn,custln,custmail,custaddr,custp);
            
            try{
                custDao cdao = new custDao(ConnectionPro.getConnection());
                if(cdao.addCust(customer)){
                   
                    response.sendRedirect("customers/index.jsp");
                    
                }else{
                    out.print("wrong cre3dential");
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);    }

  
  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
