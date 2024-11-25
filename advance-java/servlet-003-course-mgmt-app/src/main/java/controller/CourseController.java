package controller;

import model.Course;
import service.CourseService;

public class CourseController {
    CourseService courseService = new CourseService();

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }
}
