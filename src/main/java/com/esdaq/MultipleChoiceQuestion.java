package com.esdaq;

public class MultipleChoiceQuestion extends Question {

    private String[] options = new String[4];
    private String correctAnswer;

    MultipleChoiceQuestion(String q1, String a1, String a2, String a3, String a4, String correctAnswer) {
        this.question = q1;
        options[0] = a1;
        options[1] = a2;
        options[2] = a3;
        options[3] = a4;
        this.correctAnswer = correctAnswer;
    }

    public String[] getOptions() {
        return options;
    }

    @Override
    public void displayOptions() {
        System.out.println(question + "\n");

        for(String o : options) {
            System.out.println(o + "\n");
        }
    }
}
