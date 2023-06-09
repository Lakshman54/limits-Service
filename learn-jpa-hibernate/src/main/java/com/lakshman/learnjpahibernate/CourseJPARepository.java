package com.lakshman.learnjpahibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hibernate.usertype.CompositeUserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course)
    {
        entityManager.merge(course);
    }

    public Course findById(long id)
    {
    return     entityManager.find(Course.class,id);
    }

    public void delete(long id)
    {
      Course course=  entityManager.find(Course.class,id);

        entityManager.remove(course);
    }


}
