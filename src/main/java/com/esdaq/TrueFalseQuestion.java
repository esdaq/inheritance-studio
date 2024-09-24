package com.esdaq;

public class TrueFalseQuestion extends Question{
    private Boolean answer;

    public TrueFalseQuestion(String question, Boolean answer){
        this.question = question;
        this.answer = answer;
    }

    @Override
    public void displayOptions() {
        System.out.println(question + "\n");

    }
}
