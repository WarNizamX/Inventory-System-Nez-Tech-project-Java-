<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="category.categoryDao"%>
<%@page import="newpackage.ConnectionPro"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <table border="1">
            <tr>
                <th>Category ID</th>
                <th>Category Name</th>
                <th>Category Type</th>
            </tr>
            
            <%
                try{
                //database connection
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neztech","root","");
                Statement st = con.createStatement(); 
                
                String categorys = request.getParameter("cat_id");
                String sqlStr = "select * from category where cat_id='"+categorys+"'";
                ResultSet rs = st.executeQuery(sqlStr);
                while(rs.next()){
                    %>
                    
                    <tr>
                        <td><%=rs.getInt("cat_id")%></td>
                        <td><%=rs.getString("cat_name")%></td>
                        <td><%=rs.getString("cat_type")%></td>
                    </tr>
                    <%}
                    //while loop complete

                
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
               
                %>              
                
                
                
                </table>
        
        
    </body>
</html>
