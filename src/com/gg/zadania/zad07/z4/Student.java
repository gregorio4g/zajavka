package com.gg.zadania.zad07.z4;

import java.util.Random;

public class Student extends Person implements Examinated {
    public Student(final String name) {
        super(name);
        System.out.println("Creating student: " + name);
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public void writeExam(final Exam exam) {
        exam.setStudent(this);
        Random rand = new Random();
        String[] questions = exam.getQuestions();
        int[] answers = new int[questions.length];
        for (int i = 0; i < questions.length; i++) {
            int answerIndex = rand.nextInt(3);
            System.out.println("Student: " + this.toString()+
                    ", answering question: " + questions[i] +
                    ", answered: " + answerIndex);
            answers[i] = answerIndex;
        }
        exam.setAnswers(answers);
    }
}
