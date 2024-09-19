package org.launchcode;

import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired" +
                " of sitting by her sister on the bank, and of having" +
                " nothing to do: once or twice she had peeped into the" +
                " book her sister was reading, but it had no pictures" +
                " or conversations in it, ‘and what is the use of a" +
                " book,’ thought Alice ‘without pictures or" +
                " conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search whether it is present:");
        String searchTerm = input.next();
        String loweredSearchTerm = searchTerm.toLowerCase();
        String loweredFirstSentence = firstSentence.toLowerCase();
        int wordLength = searchTerm.length();
        int indexOfWord = loweredFirstSentence.indexOf(loweredSearchTerm);
        System.out.println("The index of the word is: " + indexOfWord);
        System.out.println("The length of the word is: " + wordLength);
        String sentenceWithoutWord = firstSentence.replace(searchTerm,"");
        System.out.println(sentenceWithoutWord);
//        boolean outcomeOfSearch = loweredFirstSentence.contains(loweredInput);
//        System.out.println("It is " + outcomeOfSearch + " that the word was found.");
    }
}
