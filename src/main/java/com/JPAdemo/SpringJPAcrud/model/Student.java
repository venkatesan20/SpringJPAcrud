package com.JPAdemo.SpringJPAcrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public Student(int rno, String name, String gender, String dept) {
        this.rno = rno;
        this.name = name;
        this.gender = gender;
        this.dept = dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Id
    private int rno;
    private String name;
    private String gender;
    private String dept;

    public Student() {
    }
}
