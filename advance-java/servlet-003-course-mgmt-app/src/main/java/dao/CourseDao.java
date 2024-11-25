package dao;

import model.Course;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseDao {
    public void addCourse(Course course) {
        Connection connection = ConnectionUtil.getConnection();
        String sql = "insert into course(name, description,duration,fees) values(?,?,?,?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setString(3, course.getDuration());
            preparedStatement.setInt(4, course.getFees());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" exception in query");
        }
        System.out.println("Course added successfully");

    }
}