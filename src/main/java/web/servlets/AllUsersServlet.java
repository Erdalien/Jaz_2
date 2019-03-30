package web.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/all_users")
public class AllUsersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con = null;
        Statement stmt = null;
        ResultSet result = null;

        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");

            con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb", "SA", "");

            stmt = con.createStatement();
            result = stmt.executeQuery("SELECT id ,Username, Premium FROM users");


            out.println("<table border='3' align='center'><tr><th>ID</th><th>Username</th><th>Premium</th></tr>");
            while(result.next()){
                out.println("<tr><td align='center'>" + result.getInt("id")+"</td>" +
                        "<td align='center'>"+result.getString("Username")+"</td>"+
                        "<td align='center'>"+result.getString("Premium")+"</td></tr>");

            }
            out.println("</table>");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }



    }
}