package Spring_Jpa_RestAPI.RestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private  CourseRepository repository;

    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return repository.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);
        if(course.isEmpty()){
            throw new RuntimeException("Course not found with id: "+id);
        }
        return course.get();
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course){
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void update(@PathVariable long id, @RequestBody Course course){
        repository.save((course));
    }

    @DeleteMapping("/courses/{id}")
    public void delete(@PathVariable long id){
        repository.deleteById(id);
    }
}
