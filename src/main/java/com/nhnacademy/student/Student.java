package com.nhnacademy.student;

import java.time.LocalDateTime;

public class Student {
    private String id;

    private String name;

    private Gender gender;

    private int age;

    private LocalDateTime createdAt;

    public Student(String id, String name, Gender gender, int age, LocalDateTime time) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.createdAt=time;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


}
