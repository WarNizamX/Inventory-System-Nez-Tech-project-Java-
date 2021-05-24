
package Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class custDao {
    Connection con;
    
    public custDao(Connection con){
        this.con = con;
    }
    
    
    //add customer to database
    
    public boolean addCust(customers customer){
        boolean test = false;
        
        try{
            String query =  "insert into customer (cust_firstname,cust_lastname,cust_email,cust_addr,cust_phone) values(?,?,?,?,?)";
            PreparedStatement pst = this.con.prepareStatement(query);
            
            pst.setString(1, customer.getCust_firstname());
            pst.setString(2, customer.getCust_lastname());
            pst.setString(3, customer.getCust_email());
            pst.setString(4, customer.getCust_addr());
            pst.setString(5, customer.getCust_phone());
            
            pst.executeUpdate();
            test= true;

        }catch(Exception e){
            e.printStackTrace();
        }
        
 
                
               
        return test;
    }
    
    //    retrieve the book details from databse
    public List<customers> getAllCustomers(){
        List<customers> customer = new ArrayList<>();
        
        try{
            
            String query = "select * from customer";
            PreparedStatement pr = this.con.prepareStatement(query);
            ResultSet rs = pr.executeQuery();
            
            while(rs.next()){
                int cust_id = rs.getInt("cust_id");
                String cust_firstname = rs.getString("cust_firstname");
                String cust_lastname = rs.getString("cust_lastname");
                String cust_email = rs.getString("cust_email");
                String cust_addr = rs.getString("cust_addr");
                String cust_phone = rs.getString("cust_phone");
                
                customers row = new customers(cust_id,cust_firstname,cust_lastname,cust_email,cust_addr,cust_phone);
                customer.add(row);
            }
            
        }catch(Exception e){
            e.printStackTrace();;
        }
       
        return customer;
    }
    
     //edit cust info
     public boolean editCustomerInfo(customers customer){
        boolean test = false;
        
        try{
            String query = "update customer set cust_firstname=?, cust_lastname=?, cust_email=?, cust_addr=?, cust_phone=? where cust_id=?";
            PreparedStatement pt = this.con.prepareStatement(query);
            
            pt.setString(1, customer.getCust_firstname());
            pt.setString(2, customer.getCust_lastname());
            pt.setString(3, customer.getCust_email());
            pt.setString(4, customer.getCust_addr());
            pt.setString(5, customer.getCust_phone());
            pt.setInt(6, customer.getCust_id());
            pt.executeUpdate();
            
            test = true;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return test;
    
    }
    
    //    get single book information in edit page
    public customers getSingleCustomer(int cust_id){
        customers bk = null;
        
        try{
            String query = "select * from customer where cust_id=? ";
            
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setInt(1, cust_id);
            ResultSet rs= pt.executeQuery();
            
            while(rs.next()){
                int bid = rs.getInt("cust_id");
                String bnm = rs.getString("cust_firstname");
                String bdes = rs.getString("cust_lastname");
                String anm = rs.getString("cust_email");
                String adr = rs.getString("cust_addr");
                String cp = rs.getString("cust_phone");
                
                bk = new customers(bid,bnm,bdes,anm,adr,cp);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return bk;
    }
    
    //delete cat
    public void deleteCustomer(int cust_id){
        try{
            
           String query= "delete from customer where cust_id=?";
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setInt(1, cust_id);
           pt.execute();
            
        }catch(Exception ex){
            ex.printStackTrace();;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
