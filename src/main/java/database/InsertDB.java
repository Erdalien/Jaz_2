package database;

import domain.Users;
import web.servlets.RegistrationServlet;

import java.sql.*;

public class InsertDB {

    /*public static boolean tableExist(Connection conn, String tableName) throws SQLException {
        boolean tExists = false;
        try(ResultSet rs = conn.getMetaData().getTables(null, null, tableName, null)){
            while (rs.next()) {
                String tName = rs.getString("Username");
                if (tName != null && tName.equals(tableName.toLowerCase())) {
                    tExists = true;
                    break;
                }
            }
        }
        return tExists;
    }*/

    public void insert() {

        Users users = new Users();

        String uname = users.getUsername();
        String email = users.getEmail();
        String pass = users.getPassword();

        RegistrationServlet ok = new RegistrationServlet();

        Connection con = null;
        Statement stmt = null;

        int result = 0;

        /*try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb", "SA", "");
            //CreateTableDB create = new CreateTableDB();
            //create.createTable();
            String query = "INSERT INTO users (Username, E_mail, Password, Premium, Administrator)" + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, name);
            preparedStmt.setString(2, email);
            preparedStmt.setString(3, pass);
            preparedStmt.setBoolean(4,true);
            preparedStmt.setBoolean(5,true);
            preparedStmt.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
            System.out.println(result);
    }
}*/}}