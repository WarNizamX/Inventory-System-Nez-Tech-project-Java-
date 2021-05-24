
package com.crud.project;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import newpackage.ConnectionPro;


@WebServlet(name = "AddBooksServlet", urlPatterns = {"/AddBooksServlet"})
public class AddBooksServlet extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddBooksServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
           //fetch data from the form
            String bname = request.getParameter("bookName");
            String bdesc = request.getParameter("bookDesc");
            String athname = request.getParameter("authName");          
            String cat = request.getParameter("cat");
            books book = new books(bname, bdesc, athname, cat);
            try{
                BooksDao bkpro = new BooksDao(ConnectionPro.getConnection());
                if(bkpro.addBook(book)){
                    response.sendRedirect("welcome.jsp");
                
                }
                
                else
                {
                out.print("Success!");
                String errorMessage = "Success";
                HttpSession regSession = request.getSession();
                regSession.setAttribute("AddError", errorMessage);
                response.sendRedirect("welcome.jsp");
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
        processRequest(request, response);
    }

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
