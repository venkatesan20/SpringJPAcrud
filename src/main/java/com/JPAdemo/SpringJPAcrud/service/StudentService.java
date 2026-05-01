package com.JPAdemo.SpringJPAcrud.service;

import com.JPAdemo.SpringJPAcrud.Repository.StudentRepo;
import com.JPAdemo.SpringJPAcrud.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService  {

    @Autowired
    StudentRepo studentrepo;

    //get all student details Logic
    public List<Student> getAll() {
        return studentrepo.findAll();
    }
     //add student Logic
    public void addstudent(Student student) {
        studentrepo.save(student);
    }
   //get one student details Logic
    public Student getallById(int rno) {
        return studentrepo.findById(rno).orElse(new Student());
    }

    //Update Student Logic
    public void updatestudent(Student students) {
         studentrepo.save(students);
    }
    //Delete Student byId Logic
    public void deleteStudentById(int rno) {
         studentrepo.deleteById(rno);
    }
    //Clear All Student Records Logic
    public void clearStudent() {
        studentrepo.deleteAll();
    }


    public List<Student> getstudentBydepartment(String dept) {
        return studentrepo.findBydept(dept);
    }
}
