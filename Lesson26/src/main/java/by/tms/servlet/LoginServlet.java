package by.tms.servlet;

import by.tms.model.User;
import by.tms.service.UserAware;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private UserAware userService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        userService = (UserAware) config.getServletContext().getAttribute("userService");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (userService.isVerifyUser(login, password)) {
            HttpSession session = req.getSession();
            session.setAttribute("accessUser", new User(login, password));
            forwardTo(req, resp, "/form.jsp");
        } else {
            forwardTo(req, resp, "/login.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("accessUser") != null) {
            forwardTo(req, resp, "/form");
        } else {
            forwardTo(req, resp, "/login.jsp");
        }
    }

    private void forwardTo(HttpServletRequest req, HttpServletResponse resp, String address) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(address);
        requestDispatcher.forward(req, resp);
    }
}