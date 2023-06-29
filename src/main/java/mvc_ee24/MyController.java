package mvc_ee24;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mycontroller",value = "/mycontroller")
public class MyController extends HttpServlet {
    MyModel myModel = new MyModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Student student = myModel.getStudent();
            req.setAttribute("Student", student);
//            req.getSession().setAttribute("Student", student);
//            req.getServletContext().setAttribute("Student", student);

//            <jsp:useBean id="Student" class="mvc_ee24.Student" scope="request" />
//            <jsp:useBean id="Student" class="mvc_ee24.Student" scope="session" />
//            <jsp:useBean id="Student" class="mvc_ee24.Student" scope="application" />

//        редирект єто когда вы на страничку юзеру отправляете редирект с 302 и он переходит на другую страницу
//        Форвард это когда вы юзеру ничего не отправляете, в самом сервлете переходите на другую страницу и отображаете информацию с нее.
//        отправляете ее пользователю.
         RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/myview-ee24.jsp");
         requestDispatcher.forward(req, resp);


    }
}
