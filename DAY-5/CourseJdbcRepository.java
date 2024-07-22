package Spring_Jpa.LearnJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private String INSERT_QUERY =
    """
        insert into COURSE
                (id , name, author)
                values(?,?,?);
    """;
    private String DELETE_QUERY =
            """
                delete from COURSE
                where id = ?;
            """;
    private String SELECT_QUERY =
            """
                select * from course where id =? ;
            """;
    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY,
                course.getId(),course.getName(),course.getAuthor());
    }
    public void deleteById(long id){
        springJdbcTemplate.update(DELETE_QUERY,id);
    }
    public Course findById(long id){
        //ResultSet => Bean => RowMapper
        return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }
}
