import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ee_15sync", value = "/ee_15sync", asyncSupported = true)
public class EE_15SyncServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      AsyncContext asyncContext = req.getAsyncContext();
      asyncContext.start(new Runnable() {
          public void run() {
                // await event
          }
      });
      asyncContext.complete();
    }
}
