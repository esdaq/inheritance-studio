package com.esdaq;

import java.util.ArrayList;

public class CheckBoxQuestion extends Question {
    private ArrayList<String> answers;
    private ArrayList<String> correctAnswers;

    public CheckBoxQuestion(ArrayList<String> ans) {
        this.answers = ans;
    }

    @Override
    public void displayOptions() {
        System.out.println(question + "\n");

        for(String o : answers) {
            System.out.println(o + "\n");
        }
    }
}
