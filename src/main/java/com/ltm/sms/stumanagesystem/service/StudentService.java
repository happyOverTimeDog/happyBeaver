package com.ltm.sms.stumanagesystem.service;

import com.ltm.sms.stumanagesystem.domain.entity.Student;

import java.util.List;

public interface StudentService {
     List<Student> getStudentList(Student student);
     void delStudent(Integer id);
     void addStudent(Student student);
     void updateStudent(Student student);
}
