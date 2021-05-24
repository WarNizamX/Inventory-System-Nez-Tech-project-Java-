
package category;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class categoryDao {
    Connection con;
    
    public categoryDao(Connection con) {
        this.con = con;
    }
    
    //addcategoryto database
    
     public boolean addCategory(categorys category){
        boolean test = false;
        String query =  "insert into category (cat_name,cat_type) values(?,?)";
        
        try{
            
            PreparedStatement pst = this.con.prepareStatement(query);
            
            pst.setString(1, category.getCat_name());
            pst.setString(2, category.getCat_type());
        
            
            pst.executeUpdate();
            test= true;

        }catch(Exception e){
            e.printStackTrace();
        }
        return test;
    }
    
     // Retrieve book details from dtabase
     public List<categorys> getAllCategorys(){
        List<categorys> category = new ArrayList<>();
        
        try{
            
            String query = "select * from category";
            PreparedStatement pt = this.con.prepareStatement(query);
            ResultSet rs = pt.executeQuery();
            
            while(rs.next()){
                
                int catid = rs.getInt("cat_id");  
                String catn = rs.getString("cat_name");
                
                String cattype = rs.getString("cat_type");

                categorys row = new categorys(catid,catn,cattype);
                category.add(row);
            }
            
        }catch(Exception e){
            e.printStackTrace();;
        }
        return category;
    }
     
     //    get single cat information in edit page
    public categorys getSingleCategory(int cat_id){
        categorys bk = null;
        
        try{
            String query = "select * from category where cat_id=? ";
            
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setInt(1, cat_id);
            ResultSet rs= pt.executeQuery();
            
            while(rs.next()){
                int cid = rs.getInt("cat_id");
                String catn = rs.getString("cat_name");
                String cty = rs.getString("cat_type");
             
                bk = new categorys(cid,catn,cty);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return bk;
    }
    
    //edit book information
    public boolean editCategoryInfo(categorys category){
        boolean test = false;
        
        try{
            String query = "update category set cat_name=?, cat_type=? where cat_id=?";
            PreparedStatement pt = this.con.prepareStatement(query);
            
            pt.setString(1, category.getCat_name());
            pt.setString(2, category.getCat_type());
           
            pt.setInt(3, category.getCat_id());
            pt.executeUpdate();
            
            test = true;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return test;
    
    }
    //delete cat
    public void deleteCategory(int cat_id){
        try{
            
           String query= "delete from category where cat_id=?";
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setInt(1, cat_id);
           pt.execute();
            
        }catch(Exception ex){
            ex.printStackTrace();;
        }
    }
    
    //Search
    public List<categorys> searchCatByType(String cat_type) {
    String sql = "select * from category where cat_type like '%" + cat_type + "%'";
    List<categorys> category = new ArrayList<categorys>();    
    // Execute sql, 
    // open ResultSet, 
    // iterate it and for every ResultRow's row convert to object User
    // Add converted object User to users
    // Free resource
    return category; 
  }
    
         
}
