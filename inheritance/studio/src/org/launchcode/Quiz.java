package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {

    //store Q's and A's (maybe store in ArrayList)
    //Q&A for org.launchcode.TrueFalse are indexed in ArrayList at 0,1
    //Q&A for org.launchcode.Checkbox are indexed at 2,3
    //Q&A for org.launchcode.MultiChoice are indexed at 4,5
    //Separate ArrayList for each Q&A

    private final ArrayList<Question> questions = new ArrayList<>();
    private int numCorrect = 0;

    public Quiz() {
        this.numCorrect = numCorrect;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void addQuestion(Question[] questionArray) {
        Collections.addAll(questions, questionArray);
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        Collections.shuffle(questions);

        for(Question question : questions) {
            System.out.println(question);
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i=0;
            while (i < question.getMaxResponses()) {
                String userResponse;

                do {
                    System.out.println("Please enter a number: ");
                    userResponse = input.nextLine();
                } while (question.isInvalid(userResponse));

                int userRespNum = Integer.parseInt(userResponse);
                if (userResponses.contains(userRespNum)) {
                    System.out.println("You already got that one!");
                } else if (!question.getChoiceMap().get(userRespNum).isCorrect()) {
                    System.out.println("Sorry, the correct answer was: ");
                    for (Choice choice : question.getChoiceMap().values()) {
                        if (choice.isCorrect()) {
                            System.out.println(choice.getContent());
                        }
                    }
                    break;
                } else {
                    System.out.println("Correct!");
                    userResponses.add(userRespNum);
                    if (i == question.getMaxResponses() - 1) {
                        numCorrect++;
                    }
                    i++;
                }
            }
        }
        input.close();
    }
}
