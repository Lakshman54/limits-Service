package com.lakshman.learnjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String Insert_query=
            """
            insert into course(id,name,author)
            values(?,?,?);
            """;

    private static String Delete_query=
            """
            delete from course where id=?;
            """;

    private static String Select_query=
            """
            select * from course where id=?;
            """;

    public void insert(Course course)
    {
        jdbcTemplate.update(Insert_query,course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(long id)
    {
        jdbcTemplate.update(Delete_query,id);
    }

    public Course findById(long id)
    {
        return jdbcTemplate.queryForObject(Select_query,new BeanPropertyRowMapper<>(Course.class),id);
    }

}
