package Spring_Jpa.LearnJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJPARepository  repository;

    @Autowired
    private CourseSpringDataJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"LearnJava","Prince"));
        repository.save(new Course(2,"LearnAngular","Anuj"));
        repository.save(new Course(3,"LearnAws","Aman"));
        repository.deleteById(2l);
        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("Prince"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("LearnJava"));
        System.out.println(repository.findByName(""));
    }
}
