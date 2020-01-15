package com.ltm.sms.stumanagesystem.service.impl;

import com.ltm.sms.stumanagesystem.domain.entity.Course;
import com.ltm.sms.stumanagesystem.mapper.CourseMapper;
import com.ltm.sms.stumanagesystem.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;
    @Override
    public void addCourse(Course course) {
        this.courseMapper.addCourse(course);
    }

    @Override
    public void delCourse(Integer id) {
       this.courseMapper.delCourse(id);
    }

    @Override
    public void updateCourse(Course course) {
        this.courseMapper.updateCourse(course);
    }

    @Override
    public List<Course> getCourseList(Course course) {
        return this.courseMapper.getCourseList(course);
    }
}
