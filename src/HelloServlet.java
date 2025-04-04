import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Enter your name:</h1>");
        out.println("<form method=\"post\" action=\"HelloServlet\">");
        out.println("<label for=\"name\">Name:</label>");
        out.println("<input type=\"text\" name=\"name\" id=\"name\">");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");

        if (name != null && !name.trim().isEmpty()) {
            out.println("<h1>Hi " + name + "!</h1>");
        } else {
            out.println("<h1>Please enter a name.</h1>");
            out.println("<form method=\"post\" action=\"HelloServlet\">");
            out.println("<label for=\"name\">Name:</label>");
            out.println("<input type=\"text\" name=\"name\" id=\"name\">");
            out.println("<input type=\"submit\" value=\"Submit\">");
            out.println("</form>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}