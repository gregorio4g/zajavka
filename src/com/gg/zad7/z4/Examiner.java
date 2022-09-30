package com.gg.zad7.z4;

public interface Examiner {
    Exam[] createExams(int numberOfStudents);
    void evaluteExam(Exam[] exams);

}
