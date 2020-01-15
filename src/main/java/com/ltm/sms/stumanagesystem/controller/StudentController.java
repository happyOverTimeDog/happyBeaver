package com.ltm.sms.stumanagesystem.controller;

import com.ltm.sms.stumanagesystem.domain.entity.ResInfo;
import com.ltm.sms.stumanagesystem.domain.entity.Student;
import com.ltm.sms.stumanagesystem.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 学生信息查询类
 * @author: ltm
 * @create: 2019-12-23 12:12
 */
@RestController
@RequestMapping("/stu")
@CrossOrigin
public class StudentController {

    @Resource
    private StudentService studentService;

    @PostMapping ("/add")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @GetMapping("/del")
    public void deleteStudent(Integer id) {
        studentService.delStudent(id);
    }

    @PostMapping("/update")
    public void updateStudent(@RequestBody Student stu)
    {
        this.studentService.updateStudent(stu);
    }
    @PostMapping("/getStus")
    public ResponseEntity<List<Student>>  getStudents(@RequestBody Student stu) {
        List<Student> students = this.studentService.getStudentList(stu);
        return ResponseEntity.ok(students);
    }
}
