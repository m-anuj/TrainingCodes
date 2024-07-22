package Spring_Jpa.LearnJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJPARepository extends JpaRepository<Course,Long> {

    List<Course> findByAuthor(String author);

    List<Course> findByName(String name);
}
