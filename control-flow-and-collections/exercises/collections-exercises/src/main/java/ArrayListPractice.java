package main.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayListPractice {
//        public static int sumEven(ArrayList<Integer> arr) {
//            int total = 0;
//            for (int integer :arr) {
//                if (integer % 2 == 0) {
//                    total += integer;
//                }
//            }
//            return total;
//        }
    public static void main(String[] args) {
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] phraseSplit = phrase.split(" ");
        ArrayList<String> phraseList = new ArrayList<String>(Arrays.asList(phraseSplit));

//        Scanner input;
//        input = new Scanner(System.in);
//        System.out.println("Enter a word length: ");
//        int numChars = input.nextInt();

        ArrayList<String> printWords = new ArrayList<>();

        for (String word : phraseList) {
            if (word.length() == 5) {
                printWords.add(word);
            }
        }
        System.out.println(printWords);
    }

}
