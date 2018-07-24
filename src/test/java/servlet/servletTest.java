package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="sayHello",urlPatterns = "/saysomething",loadOnStartup = 6)
public class servletTest extends HttpServlet {

    @Override
    public void init(){
        System.out.println("servlet初始化...");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        String name=request.getParameter("name");
        System.out.println("Hello "+name);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        this.doGet(request,response);
    }
}
