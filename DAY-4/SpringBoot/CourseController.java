package SpringBoot.demo;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    //https://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return Arrays.asList(new Course(1,"Java","G.Martin"),
                new Course(2,"Angular","anuj"));
    }
    @GetMapping("/helloworld")
    public String printHello(){
        return "Hello World";
    }
    //https://localhost:8080/courses
    @GetMapping("/courses/1")
    public Course getcourse(){
        return new Course(1,"Java 3","G.Martin");
    }

    @GetMapping("/getcourses/{id}")
    public Course getCourseById(@PathVariable int id) {
        // Here, you would typically fetch the course details from a database or service
        // For demonstration purposes, I'll return a hardcoded course
        if (id == 1) {
            return new Course(1, "Java", "G.Martin");
        } else if (id == 2) {
            return new Course(2, "Angular", "Anuj");
        } else {
            return null; // Handle case where course with given ID is not found
        }
    }

}
