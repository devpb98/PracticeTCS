
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

/**
 *
 * @author Dev-PC
 */
public class FirstServlet implements Servlet{ 

    ServletConfig conf;
    
    @Override
    public void init(ServletConfig conf) throws ServletException {
        this.conf = conf;
        System.out.println("Object is created..");
    }


    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Servicing......");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Welcome to First servlet</h1>");
        out.println("<h1>Todays date and time is:"+new Date().toString()+"</h1>");
    }


    @Override
    public void destroy() {
        System.out.println("Going to destroy servlet object....."); 
    }
    
    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }
    
    @Override
    public String getServletInfo() {
        return "This servlet is created by Dev Prasad"; 
    }
    
}
