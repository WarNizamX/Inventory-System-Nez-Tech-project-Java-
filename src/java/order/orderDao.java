
package order;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import product.products;


public class orderDao {
    Connection con;
    
    public orderDao(Connection con) {
        this.con = con;
    }
    
    
    //    retrieve the book details from databse
    public List<products> getAllProducts(){
        List<products> product = new ArrayList<>();
        
        try{
            
            String query = "select * from product";
            PreparedStatement pt = this.con.prepareStatement(query);
            ResultSet rs = pt.executeQuery();
            
            while(rs.next()){
                
                int id = rs.getInt("prod_id");
                String bname = rs.getString("prod_name");
                String des = rs.getString("prod_desc");
                double pr = rs.getDouble("prod_price");
                int p = rs.getInt("prod_quantity");
                

                products row = new products(id,bname,des,pr,p);
                product.add(row);
                
              
            }
            
        }catch(Exception e){
            e.printStackTrace();;
        }
        return product;
        
        
        
        // Update Stock
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}