package org.launchcode;

public class QuizRunner {

    public static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        String q1 = "Which of the following are books by Jane Austen?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Jane Eyre"),
                new Choice("Pride and Prejudice", true),
                new Choice("Wives and Duaghters"),
                new Choice("Mansfield Park", true)
        };
        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "The most popular author of all time is Agatha Christie.";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };
        TrueFalse question2 = new TrueFalse(q2, q2Choices);

        String q3 = "Which poem did history making poet Amanda Gorman recite at the U. S. inauguration in 2021?";
        Choice[] q3choices = new Choice[] {
                new Choice("The Hill We Climb", true),
                new Choice("The Miracle of Morning"),
                new Choice("We Rise"),
                new Choice("New Day's Lyric")
        };
        MultiChoice question3 = new MultiChoice(q3, q3choices);

        quiz.addQuestion(new Question[] {question1, question2, question3});

        quiz.run();

        String newline = System.lineSeparator();
        System.out.println(newline + "You answered " + quiz.getNumCorrect() +
                " questions correctly. Thanks for playing!" + newline);

    }

}
