package by.tms.servlet;

import by.tms.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/login", name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        HttpSession session = req.getSession();
        session.setAttribute("email", email);
        session.setAttribute("pass", pass);

        if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
            resp.getWriter().write("Success logged!!");
        } else {
            resp.getWriter().println("Параметры не корректные!");
        }

    }
}