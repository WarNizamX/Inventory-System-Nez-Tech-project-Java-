
package custLogin;

public class custUser {

int custo_id;
String custo_name;
String custo_email;
String custo_password;

public custUser(){
}

    public custUser(int custo_id, String custo_name, String custo_email, String custo_password) {
        this.custo_id = custo_id;
        this.custo_name = custo_name;
        this.custo_email = custo_email;
        this.custo_password = custo_password;
    }

    public custUser(String custo_name, String custo_email, String custo_password) {
        this.custo_name = custo_name;
        this.custo_email = custo_email;
        this.custo_password = custo_password;
    }

    public int getCusto_id() {
        return custo_id;
    }

    public void setCusto_id(int custo_id) {
        this.custo_id = custo_id;
    }

    public String getCusto_name() {
        return custo_name;
    }

    public void setCusto_name(String custo_name) {
        this.custo_name = custo_name;
    }

    public String getCusto_email() {
        return custo_email;
    }

    public void setCusto_email(String custo_email) {
        this.custo_email = custo_email;
    }

    public String getCusto_password() {
        return custo_password;
    }

    public void setCusto_password(String custo_password) {
        this.custo_password = custo_password;
    }

    @Override
    public String toString() {
        return "custUser{" + "custo_id=" + custo_id + ", custo_name=" + custo_name + ", custo_email=" + custo_email + ", custo_password=" + custo_password + '}';
    }
      


    
}

