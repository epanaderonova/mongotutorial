package com.example.demo.repository;

import com.example.demo.entity.Student;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    @Query("{name:'?0'}")
    List<Student> findStudentByName(String name);

    Student findStudentByNameAndEmail(String name, String email);

    List<Student> findStudentsByNameOrEmail(String name, String email);

}
