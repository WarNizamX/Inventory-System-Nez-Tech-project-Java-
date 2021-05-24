package custLogin;

import java.sql.*;

public class custUserDatabase {

    Connection con;

    public custUserDatabase(Connection con) {
        this.con = con;
    }

    //register
    public boolean saveCustoUser(custUser CustUser) {

        boolean set = false;
        try {
            //Insert register data to database
            String query = "insert into custuser(custo_name,custo_email,custo_password) values(?,?,?)";

            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, CustUser.getCusto_name());
            pt.setString(2, CustUser.getCusto_email());
            pt.setString(3, CustUser.getCusto_password());

            pt.executeUpdate();
            set = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;

    }

    //user login
    public custUser logcustUser(String custo_email, String custo_password) {
        custUser CustUser = null;
        try {
            //?=the value

            String query = "SELECT * FROM custuser WHERE custo_email=? AND custo_password=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, custo_email);
            pst.setString(2, custo_password);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                CustUser = new custUser();
                CustUser.setCusto_id(rs.getInt("custo_id"));
                CustUser.setCusto_name(rs.getString("custo_name"));
                CustUser.setCusto_email(rs.getString("custo_email"));
                CustUser.setCusto_password(rs.getString("custo_password"));

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return CustUser;

    }

}
