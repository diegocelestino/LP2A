package com.exservlet.hello;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;


@WebServlet(value = {"/hello-servlet"})
public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
//        out.println("<!DOCTYPE html>");
        out.println("<html><body>");
        out.println("<h1> YUAheuhAUEHU </h1>");
        out.println("</body></html>");
        out.close();
    }

}