package com.esdaq;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz {

    ArrayList mcQuestions = new ArrayList<MultipleChoiceQuestion>();
    ArrayList cbQuestions = new ArrayList<CheckBoxQuestion>();
    ArrayList tfQuestions = new ArrayList<TrueFalseQuestion>();


    public Quiz() {
        HashMap<String, String[]> multipleChoiceQuestions = new HashMap<>();
        String question1 = "What year did the Cold War officially start?";
        String[] question1Options = new String[] {"1941", "1945", "1947", "1950"};
        String question1Answer = "1945";

        String question2 = "True or False: The Berlin Wall was constructed in 1961 to separate East and West Berlin.";
        Boolean question2Answer = true;


        String question3 = "Which of the following events were part of the Cold War? (Select all that apply)";
        String[] question3Options = new String[] {
                "The Cuban Missile Crisis",
                "The Vietnam War",
                "The Treaty of Versailles",
                "The Berlin Blockade",
                "World War II",
                "The Space Race"
        };
        ArrayList<String> question3Answers = new ArrayList<>();
        question3Answers.add("The Cuban Missile Crisis");
        question3Answers.add("The Berlin Blockade");
        question3Answers.add("The Space Race");



        //multipleChoiceQuestions.put(q1,mqQOptions);

       MultipleChoiceQuestion multipleChoiceQuestion = new MultipleChoiceQuestion(question1, question1Options, question1Answer);
       TrueFalseQuestion trueFalseQuestion = new TrueFalseQuestion(question2, question2Answer);
       CheckBoxQuestion checkBoxQuestion = new CheckBoxQuestion(question3, question3Answers);
       mcQuestions.add(multipleChoiceQuestion);
       tfQuestions.add(trueFalseQuestion);
       cbQuestions.add(checkBoxQuestion);
    }

    public void startQuiz(){
        System.out.println();
    }
    public void gradeQuiz() {

    }
}
