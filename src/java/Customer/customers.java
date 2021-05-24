
package Customer;


public class customers {
 
    int cust_id;
    String cust_firstname;
    String cust_lastname;
    String cust_email;
    String cust_addr;
    String cust_phone;
 
    public customers() {
        
    }

    public customers(int cust_id, String cust_firstname, String cust_lastname, String cust_email, String cust_addr, String cust_phone) {
        this.cust_id = cust_id;
        this.cust_firstname = cust_firstname;
        this.cust_lastname = cust_lastname;
        this.cust_email = cust_email;
        this.cust_addr = cust_addr;
        this.cust_phone = cust_phone;
    }

    public customers(String cust_firstname, String cust_lastname, String cust_email, String cust_addr, String cust_phone) {
        this.cust_firstname = cust_firstname;
        this.cust_lastname = cust_lastname;
        this.cust_email = cust_email;
        this.cust_addr = cust_addr;
        this.cust_phone = cust_phone;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_firstname() {
        return cust_firstname;
    }

    public void setCust_firstname(String cust_firstname) {
        this.cust_firstname = cust_firstname;
    }

    public String getCust_lastname() {
        return cust_lastname;
    }

    public void setCust_lastname(String cust_lastname) {
        this.cust_lastname = cust_lastname;
    }

    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public String getCust_addr() {
        return cust_addr;
    }

    public void setCust_addr(String cust_addr) {
        this.cust_addr = cust_addr;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

 

    @Override
    public String toString() {
        return "customers{" + "cust_id=" + cust_id + ", cust_firstname=" + cust_firstname + ", cust_lastname=" + cust_lastname + ", cust_email=" + cust_email + ", cust_addr=" + cust_addr + ", cust_phone=" + cust_phone + '}';
    }
 
    
}

