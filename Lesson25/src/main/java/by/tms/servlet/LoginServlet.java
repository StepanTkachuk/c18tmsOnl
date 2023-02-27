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

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    private UserAware userService;
    private User user;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        userService = (UserAware) config.getServletContext().getAttribute("userService");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        if (session.getAttribute("accessUser") != null) {
            forwardTo(request, response, "/menu.jsp");
        } else {
            forwardTo(request, response, "/login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (userService.isVerifyUser(login, password)) {
            HttpSession session = req.getSession();
            session.setAttribute("accessUser", new User("123", "123"));
            forwardTo(req, resp, "/menu.jsp");
        } else {
            forwardTo(req, resp, "/login.jsp");
        }
    }

    private void forwardTo(HttpServletRequest req, HttpServletResponse resp, String address) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(address);
        requestDispatcher.forward(req, resp);
    }
}