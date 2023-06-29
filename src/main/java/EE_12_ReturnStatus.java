import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ee_12status", value = "/ee_12status")
public class EE_12_ReturnStatus extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(HttpServletResponse.SC_OK);
//        resp.sendRedirect("hello");
        //редирект на сервлет хелло

//        resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Пример сообщения об ошибке");

//        resp.setHeader("Refresh", "1");
//        System.out.println("hello");
        // автоматический рефреш страницы через 1 с, с логированием


        resp.setHeader("Refresh", "5;URL=https://google.com");
    }
}
