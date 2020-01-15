package com.ltm.sms.stumanagesystem.service.impl;

import com.ltm.sms.stumanagesystem.domain.entity.Student;
import com.ltm.sms.stumanagesystem.mapper.StudentMapper;
import com.ltm.sms.stumanagesystem.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudentList(Student student) {
        return studentMapper.getStuList(student);
    }

    @Override
    public void delStudent(Integer id) {
         studentMapper.delStudent(id);
    }

    @Override
    public void addStudent(Student student) {
         studentMapper.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }
}
