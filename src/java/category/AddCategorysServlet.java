
package category;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import newpackage.ConnectionPro;



public class AddCategorysServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddCategorysServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //fetch data from the form
            
            String cne = request.getParameter("cat_name");
            String ctype = request.getParameter("cat_type");          
            
            categorys category = new categorys(cne,ctype);
            try{
                categoryDao cdao = new categoryDao(ConnectionPro.getConnection());
                if(cdao.addCategory(category)){
                 out.println("<img src=\"img/success.gif\"></img>");
                 out.println("<FONT FACE=\"Comic Sans Ms, Times, Arial\" COLOR=\"#000000\" SIZE=\"big\">");
                 out.println("<body bgcolor='#E6E6FA' text='green' <h1>Add Success !!</h1>");
                 
                    response.sendRedirect("category/index.jsp");
                 
                }else{
                 out.println("<img src=\"img/eror.gif\"></img>");
                 out.println("<FONT FACE=\"Comic Sans Ms, Times, Arial\" COLOR=\"#FF0000\" SIZE=\"big\">");
                 out.println("<body bgcolor='#FFFFFF' text='red' <h1>Fail to add!!</h1>");
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
