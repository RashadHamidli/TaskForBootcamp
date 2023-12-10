package az.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/u")
public class CountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        HttpSession session = request.getSession();
        Object istekSayisi = session.getAttribute("count");
        if (istekSayisi == null) {
            session.setAttribute("count", 0);
            writer.println(0);
        } else {
            Integer istek = Integer.parseInt(istekSayisi.toString());
            session.setAttribute("count", ++istek);
            writer.println(istek);
        }
    }
}
