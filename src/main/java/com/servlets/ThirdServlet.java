
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class ThirdServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("This is get method....");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>this is get method of my servlet</h1>");
        
    }
}
