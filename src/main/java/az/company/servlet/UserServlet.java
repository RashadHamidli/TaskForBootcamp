package az.company.servlet;

import az.company.services.MyService;
import az.company.entities.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "userServlet", value = "/user")
public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        MyService myService = new MyService();
        PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();
        Cookie[] cookies = req.getCookies();
        if (id != null && !id.isEmpty()) {
            Integer intId = id.strip().transform(Integer::parseInt);
            User user = myService.selectOneUser(intId);
            session.setAttribute("users", user);
            writer.println(user);
        } else {
            List<User> list = myService.selectUsers().stream().toList();
            session.setAttribute("users", list);
            writer.println(list);
        }
    }
}
