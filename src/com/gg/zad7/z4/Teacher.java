package com.gg.zad7.z4;

public class Teacher extends Person implements Examiner {
    public Teacher(String name) {
        super(name);
        System.out.println("Creating teacher: " + name);
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    @Override
    public Exam[] createExams(int numberOfStudents) {
        Exam[] exams = new Exam[numberOfStudents];
        for (int i = 0; i < exams.length; i++) {
            exams[i] = createExam();
        }
        return null;
    }

    @Override
    public void evaluteExam(Exam[] exams) {

    }
}
