package org.launchcode;

public class MultiChoice extends Question{

    //has boolean that selected correct number
    //method to check answer
    //take user input
    //  Call ArrayList[4] with System.out.print
    //take input and check against ArrayList[5]

    public MultiChoice(String question, Choice[] choiceArray) {
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
