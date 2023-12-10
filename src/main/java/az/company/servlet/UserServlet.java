package az.company.servlet;

import az.company.entities.User;
import az.company.services.MyServiceJPA;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@WebServlet(name = "userServlet", value = "/user")
public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        Map<String, ? extends ServletRegistration> servletRegistrations = servletContext.getServletRegistrations();
        for (Map.Entry<String, ? extends ServletRegistration> entry : servletRegistrations.entrySet()) {
            String key = entry.getKey();
            ServletRegistration value = entry.getValue();
            System.out.println(key);
        }
        String id = req.getParameter("id");
        MyServiceJPA service = new MyServiceJPA();
        PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();
        if (id != null && !id.isEmpty()) {
            Integer intId = id.strip().transform(Integer::parseInt);
            User user = service.selectOneUser(intId);
            session.setAttribute("users", user);
            writer.println(user);
        } else {
            List<User> list = service.selectUsers().stream().toList();
            session.setAttribute("users", list);
            writer.println(list);
        }

//        resp.setStatus(404);
//        resp.sendError(444, "daxili error bas verdi))");
    }
}
