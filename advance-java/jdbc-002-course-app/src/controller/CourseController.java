package controller;

import model.Course;
import service.CourseService;

import java.util.List;

public class CourseController {

    CourseService courseService = new CourseService();

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    public void editCourse(Course course) {
        courseService.editCourse(course);
    }

    public void deleteCourse(int courseId) {
        courseService.deleteCourse(courseId);
    }

    public Course getCourseById(int courseId) {
        return courseService.getCourseById(courseId);
    }

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
