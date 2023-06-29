package controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "ee26-other", value = "/ee26-other")
public class EE26OtherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.getWriter().write(req.getServletContext().getAttribute("one").toString());
        ServletContext servletContext1 = getServletContext();
        Enumeration<String> attributesNames =  servletContext1.getAttributeNames();
        while (attributesNames.hasMoreElements()) {
            String s = attributesNames.nextElement();
            System.out.println(s + " = " + servletContext1.getAttribute(s));
        }

    }
}
