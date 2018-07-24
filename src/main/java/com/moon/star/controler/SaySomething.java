package com.moon.star.controler;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="sayHello",urlPatterns = "/saysomething",loadOnStartup = 6)
public class SaySomething extends HttpServlet {

    @Override
    public void init(){
        System.out.println("servlet初始化...");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        String name=request.getParameter("name");
        try {
            PrintWriter pw=response.getWriter();
            pw.append("Hello "+name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hello "+name);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        this.doGet(request,response);
    }
}
