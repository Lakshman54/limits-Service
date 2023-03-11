package com.lakshman.links;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retreiveAllCourses()
    {
        return Arrays.asList(
                new Course(1l, "Learn AWS", "in28min"),
                new  Course(2l,"Learn Docker1","in28min"),
                new  Course(2l,"Learn Azure1","in28min")
        );

    }

}
