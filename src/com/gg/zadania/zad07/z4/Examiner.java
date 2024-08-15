package com.gg.zadania.zad07.z4;

public interface Examiner {
    Exam[] createExams(int numberOfStudents);
    void evaluteExam(Exam[] exams);

}
