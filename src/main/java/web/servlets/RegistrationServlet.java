package web.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet(name = "register", urlPatterns = {"/register"})
public class RegistrationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text.html;charset=UTF-8");

        String uname = request.getParameter("name");
        String mail = request.getParameter("mail");
        String pass = request.getParameter("pass");

        try{
            Class.forName("org.hsqldb.jdbc.JDBCDriver");

            Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb", "SA", "");




            PreparedStatement preparedStmt = con.prepareStatement("INSERT INTO users (Username, E_mail, Password, Premium, Administrator) VALUES (?, ?, ?, ?, ?)");
            preparedStmt.setString(1, uname);
            preparedStmt.setString(2, mail);
            preparedStmt.setString(3, pass);
            preparedStmt.setBoolean(4,true);
            preparedStmt.setBoolean(5,true);

            preparedStmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}