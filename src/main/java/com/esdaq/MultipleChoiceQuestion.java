package com.esdaq;

public class MultipleChoiceQuestion extends Question {

    private String[] options = new String[4];
    private String correctAnswer;

    MultipleChoiceQuestion(String q1, String[] options, String correctAnswer) {
        this.question = q1;
        this.options = options;
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
