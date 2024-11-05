package org.launchcode;

public class Checkbox extends Question{

    //put input into an ArrayList, and check if array contains correct numbers
    //a way to keep looping, to offer multiple answers
    //take user input

    public Checkbox(String question, Choice[] choiceArray) {
        super(question, choiceArray);
        setMaxResponses(getNumCorrect());
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "CHOOSE ONE: " + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }

    public int getNumCorrect() {
        int numCorrect = 0;
        for (Choice choice : getChoiceMap().values()) {
            if (choice.isCorrect()) {
                numCorrect++;
            }
        }
        return numCorrect;
    }

}
