
package category;


public class categorys {
    
    
    int cat_id;
    String cat_name;
    String cat_type;

    public categorys() {
    }

    public categorys(int cat_id, String cat_name, String cat_type) {
        this.cat_id = cat_id;
        this.cat_name = cat_name;
        this.cat_type = cat_type;
    }

    public categorys(String cat_name, String cat_type) {
        this.cat_name = cat_name;
        this.cat_type = cat_type;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getCat_type() {
        return cat_type;
    }

    public void setCat_type(String cat_type) {
        this.cat_type = cat_type;
    }

    @Override
    public String toString() {
        return "categorys{" + "cat_id=" + cat_id + ", cat_name=" + cat_name + ", cat_type=" + cat_type + '}';
    }

    
    
    
    
    
    
}
