package az.company;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "userServlet", value = "/user")
public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Service service = new Service();
        PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();
        if (id != null && !id.isEmpty()) {
            Integer intId = id.strip().transform(Integer::parseInt);
            User user = service.selectOneUser(intId);
            session.setAttribute("users", user);
            writer.println("<h1>" + user + "<h1>");
        } else {
            List<User> list = service.selectUsers().stream().toList();
            session.setAttribute("users", list);
            writer.println("<h1>" + list + "<h1>");
        }
    }
}
