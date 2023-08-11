package com.in28minutes.spring.myfirstwebapp.courses;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class CoursesController {

    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    @ResponseBody
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                 new Course(1, "AWS", "Daniel"),
                 new Course(2 ,"Python", "Daniel")
        );
}
}
