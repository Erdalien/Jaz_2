package web.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = {"/premium.jsp"})
public class PremiumFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = null;
        boolean authenticated = false;
        PrintWriter out = null;

        if(request instanceof HttpServletRequest){
            req = (HttpServletRequest) request;
            String uname = req.getParameter("name");
            authenticated = authenticateUser(uname);
        }
    }

    public void destroy() {

    }
    public void init(FilterConfig fConfig) throws ServletException {

    }
    private boolean authenticateUser (String userName) {
        return false;
    }
}