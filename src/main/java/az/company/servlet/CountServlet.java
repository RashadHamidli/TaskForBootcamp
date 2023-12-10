package az.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet("/count")
public class CountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String userAgent = request.getHeader("user-agent");
        System.out.println(userAgent);

        // getHeaderNames
        Enumeration<String> headers = request.getHeaderNames();
        while (headers.hasMoreElements()) {
            String header = headers.nextElement();
            System.out.println(header + ": " + request.getHeader(header));
            //System.out.println(header);
        }

        // getHeaders
        headers = request.getHeaders("user-agent");
        while (headers.hasMoreElements()) {
            String header = headers.nextElement();
            System.out.println(header);
        }

    }
}
