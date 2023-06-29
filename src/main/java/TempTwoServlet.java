import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;


@WebServlet("/temp_two")
public class TempTwoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String one = req.getParameter("one");
//        System.out.println(one);


        String[] ones = req.getParameterValues("one");
        for (String s:ones) {
            System.out.println(s);
        }

        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String elementName = parameterNames.nextElement();
            System.out.println(elementName + " = " + req.getParameter(elementName));
        }
        //http://localhost:8181/WebTest1_war/temp_two?one=hello&one=world&two=again&abc=bitch

        Map<String, String[]> parameterMap = req.getParameterMap();

        for (Map.Entry entry: parameterMap.entrySet()) {

            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + Arrays.toString(parameterMap.get(entry.getKey())));

        }
        System.out.println(req.getRequestURL());
        System.out.println(req.getRequestURI());
        System.out.println(req.getServletPath());
        System.out.println(req.getRemoteHost());
        System.out.println(req.getLocalPort());

        System.out.println(req.getQueryString());
    }
}
