package com.ltm.sms.stumanagesystem.mapper;

import com.ltm.sms.stumanagesystem.domain.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
     void addCourse(Course course);
     void delCourse(Integer id);
     void updateCourse(Course course);
     List<Course> getCourseList(Course course);
}
