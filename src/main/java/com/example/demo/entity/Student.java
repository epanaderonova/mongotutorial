package com.example.demo.entity;

import java.util.List;
import javax.security.auth.Subject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("student")
public class Student {

    @Id
    private String id;
    @Field(name = "name")
    private String name;

    @Field(name = "mail")
    private String email;

    private Department department;

    private List<Subject> subjects;

    public Student(String id, String name, String mail, Department department, List<Subject> subjects) {
        super();
        this.id = id;
        this.name = name;
        this.email = mail;
        this.department = department;
        this.subjects = subjects;
    }



}
