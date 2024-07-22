package Spring_Jpa.LearnJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseJPARepository {

    @PersistenceContext
    private EntityManager entityManager;


    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class,id);
    }

    public void deleteById(long id){
        Course c = entityManager.find(Course.class,id);
        entityManager.remove(c);
    }

}
