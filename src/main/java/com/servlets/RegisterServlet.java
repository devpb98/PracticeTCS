
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<h2>You are successfully registered..</h2>");
        
        String name = request.getParameter("user_name");
        String password = request.getParameter("password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");
        String con = request.getParameter("condition");
        
        if(con != null){
            if(con.equals("checked")){
            out.println("<h2>Name:"+name+"</h2>");
            out.println("<h2>Password:"+password+"</h2>");
            out.println("<h2>Email:"+email+"</h2>");
            out.println("<h2>Gender:"+gender+"</h2>");
            out.println("<h2>Course:"+course+"</h2>");
            
            RequestDispatcher rd = request.getRequestDispatcher("success");
            rd.forward(request, response);
        }else{
            out.println("<h2>You have not accepted Terms & Condition.</h2>");
        }
        }else{
            out.println("<h2>You have not accepted Terms & Condition.</h2>");
            
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            
            rd.include(request, response);
        }
        
    }
}
