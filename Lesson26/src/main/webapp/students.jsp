<%@ page import="by.tms.model.Student" %>
<%@ page import="by.tms.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Students List</title>
</head>
<body>
<h1>Displaying Students List</h1>
<table border="1">
    <caption>Students table</caption>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Course</th>
    </tr>
    <%
        List<Student> students = (List<Student>) request.getAttribute("students_db.students");
        for (Student student : students) {
    %>
    <tr>
        <td><%=student.getId()%>
        </td>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getSurname()%>
        </td>
        <td><%=student.getCourse()%>
        </td>
    </tr>
    <%}%>
</table>

<form action="calculator" method="POST">
    Name: <input name="name"/>
    <br><br>
    Parameter2: <input name="userParametr2"/>
    <br><br>
    Operation: <select name="operation"/>
    <option>+</option>
    <option>-</option>
    <option>*</option>
    <option>/</option>
    <br><br>
    Result: <select name="result">
</select>
    <br><br>
    <input type="submit" value="Submit"/>
</form>

</body>
</html>
