import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "ee_14session", value = "/ee_14session")
public class EE_14Session extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Enumeration<String> attributeNames = session.getAttributeNames();
        while (attributeNames.hasMoreElements()){
            String attributeName = attributeNames.nextElement();
            System.out.println(attributeName + " =" + session.getAttribute(attributeName));
        }
        session.setAttribute("one", "two");// добавляем свои атрибуты к сессии

        System.out.println(session.getMaxInactiveInterval()); //вемя сесии, по умолчанию 1800(30мин)
//        session. isNew(); // проверяет если уже какая то сессия, сохраняет в кукисах какой то индентефикатор
//        session.invalidate(); // очищает нашу сесию. если в ней біли какие то даные, она почиститься
        session.removeAttribute("one"); // удаляет наши атрибуты





    }
}
