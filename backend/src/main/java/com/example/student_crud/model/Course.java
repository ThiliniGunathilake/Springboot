package com.example.student_crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "course")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String coursename;
    private String code;
    private int gpa;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCoursename() { return coursename; }
    public void setName(String name) { this.coursename = coursename; }

    public String getEmail() { return code; }
    public void setEmail(String code) { this.code = code; }

    public int getAge() { return gpa; }
    public void setAge(int gpa) { this.gpa = gpa; }
}
