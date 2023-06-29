import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ee_13cookies", value = "/cookies")
public class EE_13Cookies extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie [] cookies = req.getCookies();
        for (Cookie cookie: cookies) {
            System.out.print(cookie.getName() + " :");
            System.out.println(cookie.getValue() + " :: " + cookie.getMaxAge());

        }
        Cookie cookie = new Cookie("testCookie", "abc");
        cookie.setMaxAge(5);
        resp.addCookie(cookie);
//        cookie.setPath("temp"); //куки будут доступні только по єтому пути, адля всех остальных нет
//        cookie.setDomain("my.localhost.com");//какие домені будет видеть єтот кукис
//        cookie.setSecure(true);//  куки будут видны только если мы соединились по https (port 443)
//        cookie.setVersion();

    }
}
