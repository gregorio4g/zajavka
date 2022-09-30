package com.gg.zad7.z4;

public class Exam {
    private final String[] questions = {
            "Gdzie jest słonko kiedy śpi?",
            "Czy wilk zawsze bywa zły?",
            "Dokąd tupta nocą jeż?",
            "O co chodzi?",
            "A kogo to obchodzi?"
    };
    private int score;
    private Examinated student;

    public String[] getQuestions() {
        return questions;
    }

    public Examinated getStudent() {
        return student;
    }

    public void setStudent(final Examinated student) {
        this.student = student;
    }

    public int getScore() {
        return score;
    }

    private final int[] goodAnswers = {0, 1, 2, 0, 1};

    int getGoodAnswer(int questionNum) {
        if(questionNum >= 0 & questionNum < goodAnswers.length) {
            return goodAnswers[questionNum];
        } else {
            return -1;
        }
    }

    private int[] answers = {-1, -1, -1, -1, -1};

    public int[] getAnswers() {
        return answers;
    }

    public void setAnswers(int[] answers) {
        this.answers = answers;
    }

    void calculateScore() {
        int points = 0;
        for (int i = 0; i < getAnswers().length; i++) {
            if(answers[i] == goodAnswers[i]) {
                points++;
            }
        }
        this.score = points;
    }

}
