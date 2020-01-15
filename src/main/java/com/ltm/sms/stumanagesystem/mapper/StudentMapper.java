package com.ltm.sms.stumanagesystem.mapper;

import com.ltm.sms.stumanagesystem.domain.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    public void addStudent(Student stu);
    public void delStudent(Integer id);
    public void updateStudent(Student stu);
    public List<Student> getStuList(Student stu);
}
