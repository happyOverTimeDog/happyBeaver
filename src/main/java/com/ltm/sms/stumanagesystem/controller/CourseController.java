package com.ltm.sms.stumanagesystem.controller;

import com.ltm.sms.stumanagesystem.domain.entity.Course;
import com.ltm.sms.stumanagesystem.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/course")
@CrossOrigin
public class CourseController {

    @Resource
    private CourseService courseService;

    @PostMapping("/getCourses")
    public ResponseEntity<List<Course>> getCourseList(@RequestBody Course course)
    {
        List<Course> courses = this.courseService.getCourseList(course);
        return ResponseEntity.ok(courses);
    }

    @PostMapping("/add")
    public void addCourse(@RequestBody Course course)
    {
        this.courseService.addCourse(course);
    }

    @GetMapping("/del")
    public void delCourse(Integer id)
    {
        this.courseService.delCourse(id);
    }

    @PostMapping("/update")
    public void updateCourse(@RequestBody Course course)
    {
        this.courseService.updateCourse(course);
    }

}
