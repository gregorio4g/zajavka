package com.gg.testy.test12.university.teacher;

import com.gg.testy.test12.university.student.Student;

import static com.gg.testy.test12.university.student.Student.*;

public class Teacher {
    public static void main(String[] args) {
        writeExam();
        new Student().writeExam();
        System.out.println(AGE);
    }
}
