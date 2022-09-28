package com.gg.zad7.z4;

public class Exam {
    public String[] questions = {
            "Gdzie jest słonko kiedy śpi?",
            "Czy wilk zawsze bywa zły?",
            "Dokąd tupta nocą jeż?",
            "O co chodzi?",
            "A kogo to obchodzi?"
    };

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


}
