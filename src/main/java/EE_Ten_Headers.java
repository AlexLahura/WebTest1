import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "ee_ten", value = "/ee_ten")
public class EE_Ten_Headers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Enumeration<String> headerNames = req.getHeaderNames();
//        while (headerNames.hasMoreElements()){
//            String s = headerNames.nextElement();
//            System.out.println(s + " = " + req.getHeader(s) );
//        }
        System.out.println("getAuthType = " + req.getAuthType());
        System.out.println("getContentLength = " + req.getContentLength());
        System.out.println("getContentType = " + req.getContentType());
        System.out.println("getMethod = " + req.getMethod());
        System.out.println("getRequestURI = " + req.getRequestURI());
        System.out.println("getQueryString = " + req.getQueryString());
        System.out.println("getProtocol = " + req.getProtocol());

        //resp.setHeader("Content-Length", "100");


    }
}
