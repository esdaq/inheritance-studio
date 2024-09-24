package com.esdaq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz {

    private ArrayList<MultipleChoiceQuestion> mcQuestions = new ArrayList<MultipleChoiceQuestion>();
    private ArrayList<CheckBoxQuestion> cbQuestions = new ArrayList<CheckBoxQuestion>();
    private ArrayList<TrueFalseQuestion> tfQuestions = new ArrayList<TrueFalseQuestion>();
    Scanner input = new Scanner(System.in);
    private HashMap<String, String> responses = new HashMap<>();


    public Quiz() {
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
        System.out.println("Welcome to History Quiz!\n");

        for(MultipleChoiceQuestion q : mcQuestions) {
            q.displayOptions();
            System.out.print("Your answer: ");
            responses.put(q.question, input.nextLine());
            System.out.println();
        }

        for(CheckBoxQuestion q : cbQuestions) {
            q.displayOptions();
            System.out.print("Your answer: ");
            responses.put(q.question, input.nextLine());
            System.out.println();
        }

        for(TrueFalseQuestion q : tfQuestions) {
            q.displayOptions();
            System.out.print("Your answer: ");
            responses.put(q.question, input.nextLine());
            System.out.println();
        }

        System.out.print(responses);

    }
    public void gradeQuiz() {

    }
}
