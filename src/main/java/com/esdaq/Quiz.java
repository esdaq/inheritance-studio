package com.esdaq;

import java.util.ArrayList;

public class Quiz {

    ArrayList mcQuestions = new ArrayList<MultipleChoiceQuestion>();
    ArrayList cbQuestions = new ArrayList<CheckBoxQuestion>();
    ArrayList tfQuestions = new ArrayList<TrueFalseQuestion>();


    public Quiz(ArrayList<MultipleChoiceQuestion> mc,
                ArrayList<CheckBoxQuestion> cb, ArrayList<TrueFalseQuestion> tf ) {
        this.mcQuestions = mc;
        this.cbQuestions = cb;
        this.tfQuestions = tf;
    }

    public void startQuiz(){
        System.out.println();
    }
    public void gradeQuiz() {

    }
}
