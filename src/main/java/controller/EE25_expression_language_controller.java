package controller;

import mvc_ee24.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ee25_expression_language_controller", value = "/ee25_expression_language_controller")
public class EE25_expression_language_controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student("Max", 22);
        req.setAttribute("stud", student);

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        req.setAttribute("list", list);

        Map<String, String> map = new HashMap<String, String>();
        map.put("one", "1");
        map.put("two", "2");
        req.setAttribute("map", map);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/ee25_exp_lang.jsp");
        requestDispatcher.forward(req, resp);
    }
}
