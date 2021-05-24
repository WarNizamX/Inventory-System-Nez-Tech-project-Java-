package product;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class prodDao {
    Connection con;

    public prodDao(Connection con) {
        this.con = con;
    }
    
    
    
    //add prod information to database
    public boolean addProduct(products product){
        boolean test = false;
        
        try{
            String query =  "insert into product (prod_name,prod_desc,prod_price,prod_quantity) values(?,?,?,?)";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, product.getProd_name());
            pst.setString(2, product.getProd_desc());
            pst.setDouble(3, product.getProd_price());
            pst.setInt(4, product.getProd_quantity());
            
            
            
            pst.executeUpdate();
            test= false;

        }catch(Exception e){
            e.printStackTrace();
        }
        return test;
    }
    
//    retrieve the prdo details from databse
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
    }
    
    
 //edit product information
    public boolean editProductInfo(products product){
        
        boolean test = false;
        
        try{
            String query = "update product set prod_name=?, prod_desc=?, prod_price=?, prod_quantity=? where prod_id=?";
            PreparedStatement pt = this.con.prepareStatement(query);
            
            pt.setString(1, product.getProd_name());
            pt.setString(2, product.getProd_desc());
            pt.setDouble(3, product.getProd_price());
            pt.setInt(4, product.getProd_quantity());
            pt.setInt(5, product.getProd_id());
            pt.executeUpdate();
            
            test = true;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return test;
    
    }
    
//    get single book information in edit page
    public products getSingleProduct(int prod_id){
        products bk = null;
        
        try{
            String query = "select * from product where prod_id=? ";
            
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setInt(1, prod_id);
            ResultSet rs= pt.executeQuery();
            
            while(rs.next()){
                int bid = rs.getInt("prod_id");
                String bnm = rs.getString("prod_name");
                String bdes = rs.getString("prod_desc");
                double anm = rs.getDouble("prod_price");
                int cat = rs.getInt("prod_quantity");
                
                bk = new products(bid,bnm,bdes,anm,cat);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return bk;
    }
    
    
//    delete books from database
    
    
    public void deleteProd(int prod_id){
        try{
            
           String query= "delete from product where prod_id=?";
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setInt(1, prod_id);
           pt.execute();
            
        }catch(Exception ex){
            ex.printStackTrace();;
        }
    }
    
    
    
    
    //PLus Stcok
    public boolean updateProductInfo(products product){
        boolean test = false;
        
        try{
            String query = "UPDATE product SET prod_quantity = prod_quantity + 1 WHERE prod_id = ?";
            PreparedStatement pt = this.con.prepareStatement(query);
            

            pt.setInt(1, product.getProd_id());
            pt.executeUpdate();
            
            test = true;
            
        }catch(Exception ex){
            
            ex.printStackTrace();
        }
        return test;
    
    }
    
    //PLus Stcok
    public boolean minusProductInfo(products product){
        boolean test = false;
        
        try{
            String query = "UPDATE product SET prod_quantity = prod_quantity - 1 WHERE prod_id = ?";
            PreparedStatement pt = this.con.prepareStatement(query);
            

            pt.setInt(1, product.getProd_id());
            pt.executeUpdate();
            
            test = true;
            
        }catch(Exception ex){
            
            ex.printStackTrace();
        }
        return test;
    
    }
}

