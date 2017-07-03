package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;
    private String name;
    private int age;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade()==averageGrade)
                return students.get(i);
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        int index = 0;
        double maxAverageGrade = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade()>maxAverageGrade){
                index = i;
                maxAverageGrade = students.get(i).getAverageGrade();
            }
        }
        return students.get(index);
    }
    public Student getStudentWithMinAverageGrade() {
        int index = 0;
        double minAverageGrade = Double.MAX_VALUE;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade()<minAverageGrade){
                index = i;
                minAverageGrade = students.get(i).getAverageGrade();
            }
        }
        return students.get(index);
    }

    public void expel(Student student) {
        students.remove(student);
    }
}