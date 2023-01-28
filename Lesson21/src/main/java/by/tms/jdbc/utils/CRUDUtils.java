package by.tms.jdbc.utils;

import by.tms.jdbc.model.City;
import by.tms.jdbc.model.Student;
import by.tms.jdbc.model.StudentDTO;

import java.sql.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CRUDUtils {
    private static final String GET_ALL_STUDENTS_QUERY_AND_ALL_CITY = "select * from  students_db.students s left join  students_db.students_city sc on s.city_id = sc.id";
    private static final String GET_ALL_STUDENTS_QUERY = "select * from students_db.students";
    private static final String GET_ALL_CITY_QUERY = "select * from students_db.students_city";
    private static final String INSERT_STUDENT_QUERY = "INSERT INTO students(name, surname, course, date_time) VALUES(?, ?, ?, ?);";
    private static final String UPDATE_STUDENT_QUERY = "UPDATE students SET course = ? WHERE id = ?;";
    private static final String DELETE_STUDENT_QUERY = "DELETE FROM students WHERE id = ?";
    private static final String DELETE_CITY_QUERY = "DELETE FROM students_city WHERE id = ?";


    public static List<StudentDTO> getAllStudentsAndCity() {
        List<Student> students = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_ALL_STUDENTS_QUERY_AND_ALL_CITY);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int course = rs.getInt("course");
                int cityId = rs.getInt("city_id");
                String city = rs.getString("city");
                students.add(new Student(id, name, surname, course, new City(cityId, city)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return mapStudentsToStudentsDTO(students);
    }

    public static List<StudentDTO> mapStudentsToStudentsDTO(List<Student> students) {
        return students.stream()
                .map(CRUDUtils::mapStudentToStudentDTO)
                .collect(Collectors.toList());
    }

    public static StudentDTO mapStudentToStudentDTO(Student student) {
        return new StudentDTO(student.getName(), student.getSurname(), student.getCourse(), student.getCityName().getCity());
    }

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_ALL_STUDENTS_QUERY);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int course = rs.getInt("course");
                students.add(new Student(id, name, surname, course));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return students;
    }

    public static List<Student> saveStudent(Student student) {
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getCourse());
            Timestamp date = Timestamp.from(Instant.now());
            preparedStatement.setTimestamp(4, date);
            preparedStatement.executeUpdate();
            updatedStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedStudents;
    }

    public static List<Student> updateStudent(int studentId, int course) {
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT_QUERY);
            preparedStatement.setInt(1, course);
            preparedStatement.setInt(2, studentId);
            preparedStatement.executeUpdate();

            updatedStudents = getAllStudents();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedStudents;
    }

    public static List<Student> deleteStudent(int studentId) {
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            preparedStatement.setInt(1, studentId);
            preparedStatement.execute();

            updatedStudents = getAllStudents();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedStudents;
    }

    public static List<City> deleteCity(int cityId) {
        List<City> updatedCity = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CITY_QUERY);
            preparedStatement.setInt(1, cityId);
            preparedStatement.execute();

            updatedCity = getAllCity();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedCity;
    }

    public static List<City> getAllCity() {
        List<City> cityList = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_ALL_CITY_QUERY);
            while (rs.next()) {
                int id = rs.getInt("id");
                String city = rs.getString("city");
                cityList.add(new City(id, city));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cityList;
    }
}
