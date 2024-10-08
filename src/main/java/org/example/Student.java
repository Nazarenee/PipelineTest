package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private double gpa;
    List<Student> friends;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.friends= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public List<Student> getFriends() {
        return friends;
    }

    public void addStudent(Student friend){
        friends.add(friend);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", friends=" + friends +
                '}';
    }
}
