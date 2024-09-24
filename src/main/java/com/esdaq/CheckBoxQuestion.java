package com.esdaq;

import java.util.ArrayList;

public class CheckBoxQuestion extends Question {
    private ArrayList<String> options;
    private ArrayList<String> correctAnswers;

    public CheckBoxQuestion(String question, ArrayList<String> options) {
        this.question = question;
        this.options = options;
    }

    @Override
    public void displayOptions() {
        System.out.println(question + "\n");

        for(String o : options) {
            System.out.println(o + "\n");
        }
    }
}
