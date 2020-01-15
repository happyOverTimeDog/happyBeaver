package com.ltm.sms.stumanagesystem.service;

import com.ltm.sms.stumanagesystem.domain.entity.Course;

import java.util.List;

public interface CourseService {
    void addCourse(Course course);
    void delCourse(Integer id);
    void updateCourse(Course course);
    List<Course> getCourseList(Course course);

}
