package web.filters;

import validate.ValidateLogin;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(servletNames = "login",filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("name");
        String pass = request.getParameter("pass");

        if(ValidateLogin.checkUser(uname, pass)) {
            RequestDispatcher rs = request.getRequestDispatcher("profile.jsp");
            rs.include(request, response);
        } else {
            out.println("<font color=red>Username or Password incorrect. Try again.</font>");
            RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
            rs.include(request, response);

        }

        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}