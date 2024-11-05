package org.launchcode;

public class TrueFalse extends Question{

    //method for how to grade a true/false Q
    //boolean field to store whether it was correct
    // -> this is extended from org.launchcode.Question Class
    //take user input

    public TrueFalse(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "CHOOSE ONE: " + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }

}
