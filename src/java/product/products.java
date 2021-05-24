package product;


public class products {
    
    int prod_id;
    String prod_name;
    String prod_desc;
    double prod_price;
    int prod_quantity;
    
    public products() {
    }

    public products(int prod_id, String prod_name, String prod_desc, double prod_price, int prod_quantity) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_desc = prod_desc;
        this.prod_price = prod_price;
        this.prod_quantity = prod_quantity;
    }

    public products(String prod_name, String prod_desc, double prod_price, int prod_quantity) {
        this.prod_name = prod_name;
        this.prod_desc = prod_desc;
        this.prod_price = prod_price;
        this.prod_quantity = prod_quantity;
    }

    products(int id, String bname, String des, double pr, int p, String cattype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProd_desc() {
        return prod_desc;
    }

    public void setProd_desc(String prod_desc) {
        this.prod_desc = prod_desc;
    }

    public double getProd_price() {
        return prod_price;
    }

    public void setProd_price(double prod_price) {
        this.prod_price = prod_price;
    }

    public int getProd_quantity() {
        return prod_quantity;
    }

    public void setProd_quantity(int prod_quantity) {
        this.prod_quantity = prod_quantity;
    }

    @Override
    public String toString() {
        return "products{" + "prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_desc=" + prod_desc + ", prod_price=" + prod_price + ", prod_quantity=" + prod_quantity + '}';
    }
    
    
    
}
