package database;

import web.filters.RegisterFilter;

import java.sql.*;

public class SelectDB {

    /*public void select(){
        Connection con = null;
        Statement stmt = null;
        ResultSet result = null;
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb", "SA", "");
            stmt = con.createStatement();
            result = stmt.executeQuery("SELECT Username FROM users");
            RegisterFilter regFilter = new RegisterFilter();
            regFilter.
            while(result.next()){
                if(result.getString("Username").equals()){
                    System.out.println("Taki uzytkownik juz istnieje");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }*/
}