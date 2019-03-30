package validate;

import java.sql.*;

public class ValidateLogin {
    public static boolean checkUser(String uname, String pass){
        boolean st = false;

        try{

            Class.forName("org.hsqldb.jdbc.JDBCDriver");

            Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb", "SA", "");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE Username=? AND Password=?");

            ps.setString(1, uname);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            st = rs.next();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return st;
    }
}