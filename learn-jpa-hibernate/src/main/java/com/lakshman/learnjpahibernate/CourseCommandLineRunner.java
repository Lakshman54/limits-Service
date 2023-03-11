package com.lakshman.learnjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

/*    @Autowired
    private CourseJDBCRepository courseJDBCRepository;*/

/*    @Autowired
    private CourseJPARepository courseJPARepository;*/

    @Autowired
    private CourseSpringDataJPARepository courseSpringDataJPARepository;

    @Override
    public void run(String... args) throws Exception {
        courseSpringDataJPARepository.save(new Course(1, "Learn AWS JPA!", "in28mins"));
        courseSpringDataJPARepository.save(new Course(2, "Learn Docker JPA", "in28mins"));
        courseSpringDataJPARepository.save(new Course(3, "Learn Spring JPA", "in28mins2"));
        courseSpringDataJPARepository.deleteById(1l);
        System.out.println(courseSpringDataJPARepository.findById(2l));
        System.out.println(courseSpringDataJPARepository.findById(3l));

        System.out.println(courseSpringDataJPARepository.findByAuthor("in28mins"));


    }
}
