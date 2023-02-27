package by.tms.servlet;

import by.tms.model.Student;
import by.tms.service.StudentService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/db")
public class StudentServlet extends HttpServlet {

    public StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        studentService = (StudentService) config.getServletContext().getAttribute("studentService");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

//        String parameter1 = request.getParameter("userParametr1");
//        String parameter2 = request.getParameter("userParametr2");
//        String operation = request.getParameter("operation");

        String name = request.getParameter("name");
        String surName = request.getParameter("surName");
        int course = Integer.parseInt(request.getParameter("course"));

        Student student = new Student();
        student.setName(name);
        student.setSurname(surName);
        student.setCourse(course);
        studentService.addStudent(student);

//        String result = request.getParameter("result");

        try {
//            writer.println("<p>Parameter1: " + parameter1 + "</p>");
//            writer.println("<p>Parameter2: " + parameter2 + "</p>");
//            writer.println("<p>Operation: " + operation + "</p>");
        } finally {
            writer.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Student> students = studentService.findStudents();
        req.setAttribute("students_db.students", students);
        try {
            getServletContext().getRequestDispatcher("/students.jsp").forward(req, resp);
            resp.sendRedirect("/db");
        } catch (ServletException e) {
            System.out.println("Unexpected error " + e.getMessage());
            ;
        }
    }
}
