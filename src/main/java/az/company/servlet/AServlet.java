package az.company.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/a")
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("A Servlet printed");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/b");
        requestDispatcher.forward(req, resp);
        ServletContext servletContext = req.getServletContext();
        servletContext.setAttribute("num", "13");
    }
}
