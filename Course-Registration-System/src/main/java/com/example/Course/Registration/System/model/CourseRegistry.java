package com.example.Course.Registration.System.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String courseName;
    private String name;
    private String emailId;

    public CourseRegistry(String courseName, String name, String emailId) {
        this.courseName = courseName;
        this.name = name;
        this.emailId = emailId;
    }
}
