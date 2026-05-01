package com.JPAdemo.SpringJPAcrud.controller;

import com.JPAdemo.SpringJPAcrud.model.Student;
import com.JPAdemo.SpringJPAcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return service.getAll();
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        service.addstudent(student);
        return "ADD Success";

    }
    @GetMapping("/students/{rno}")
    public Student GetrollById(@PathVariable("rno") int rno){
        return service.getallById(rno);
    }
    @PutMapping("/students")
    public String Updatestudent(@RequestBody Student students){ //Student is class Name and student is object.
         service.updatestudent(students);
         return "update success";

    }
    @DeleteMapping("/students/{rno}")
    public String DeleteStudent(@PathVariable int rno){
        service.deleteStudentById(rno);
        return "Deleted Student ";
    }
    @DeleteMapping("/students/clear")
    public String ClearStudent(){
        service.clearStudent();
        return "Cleared all Records";
    }

    @GetMapping("/students/dept/")
    public List<Student> getstudentBydepartment(@PathVariable("dept") String dept){
        return service.getstudentBydepartment(dept);
    }
}
