/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SSI@ANU
 */
public class MyFilter implements Filter {
    
   
    
    public MyFilter() {
    }    
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest req=(HttpServletRequest)request;
        HttpServletResponse res=(HttpServletResponse) response;
        String checked=(String)req.getSession().getAttribute("checked");
       
        if(checked!=null)       
                chain.doFilter(request, response);
        else
               res.sendRedirect("index.jsp");
        
        }
        
   
    public void destroy() {        
    }


    public void init(FilterConfig filterConfig) {        
        
    }

   
}
