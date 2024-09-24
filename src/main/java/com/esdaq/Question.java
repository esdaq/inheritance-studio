package com.esdaq;

public abstract class Question {
    public String question;

    Question(){

    }
    Question(String question) {
        this.question = question;
    }

    public abstract void displayOptions();
}
