
package custLogin;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class custDao {
    
    Connection con;
    
    public custDao(Connection con) {
        this.con = con;
    }
    
    
    
    //    retrieve the prdo details from databse
    public List<custUser> getAllcustUser(){
        List<custUser> custUsers = new ArrayList<>();
        
        try{
            
            String query = "select * from custuser";
            PreparedStatement pt = this.con.prepareStatement(query);
            ResultSet rs = pt.executeQuery();
            
            while(rs.next()){
                
                int id = rs.getInt("custo_id");
                String bname = rs.getString("custo_name");
                String des = rs.getString("custo_email");
                String d = rs.getString("custo_password");
               

                custUser row = new custUser(id,bname,des,d);
                custUsers.add(row);
                
              
            }
            
        }catch(Exception e){
            e.printStackTrace();;
        }
        return custUsers;
    }
    
    //edit product information
    public boolean editProfileInfo(custUser custUsers){
        
        boolean test = false;
        
        try{
            String query = "update custuser set custo_name=?, custo_email=?, custo_password=? where custo_id=?";
            PreparedStatement pt = this.con.prepareStatement(query);
            
            pt.setString(1, custUsers.getCusto_name());
            pt.setString(2, custUsers.getCusto_email());
            pt.setString(3, custUsers.getCusto_password());
           
            pt.setInt(4, custUsers.getCusto_id());
            pt.executeUpdate();
            
            test = true;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return test;
    
    }
    
//    get single book information in edit page
    public custUser getSingleProfile(int custo_id){
        custUser bk = null;
        
        try{
            String query = "select * from custuser where custo_id=? ";
            
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setInt(1, custo_id);
            ResultSet rs= pt.executeQuery();
            
            while(rs.next()){
                int bid = rs.getInt("custo_id");
                String bnm = rs.getString("custo_name");
                String bdes = rs.getString("custo_email");
                String bd = rs.getString("custo_password");
               
                bk = new custUser(bid,bnm,bdes,bd);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return bk;
    }
    
}
