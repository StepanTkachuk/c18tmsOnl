package by.tms.filter;

import jakarta.servlet.*;

import java.io.IOException;

//@WebFilter(urlPatterns = "/*",
//           initParams = {@WebInitParam(name = "encoding", value = "UTF-8", description = "Encoding params")})
public class WebEncodingFilter implements Filter {

    private String encoding;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (!encoding.equals(request.getCharacterEncoding())) {
            request.setCharacterEncoding(encoding);
            response.setCharacterEncoding(encoding);
            response.setContentType("text/html");
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("filter destroy");
        encoding = null;
    }
}
