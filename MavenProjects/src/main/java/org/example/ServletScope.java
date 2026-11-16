package org.example;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletScope extends HttpServlet{
        @Override
        protected void doGet(
                HttpServletRequest request,
                HttpServletResponse response
        ) {
            System.out.println("Servlet is running");
        }
}
