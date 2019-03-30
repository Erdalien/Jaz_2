package web.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = {"/profile"})
public class ProfileFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {



    }
    public void destroy() {

    }
    public void init(FilterConfig fConfig) throws ServletException {

    }
}