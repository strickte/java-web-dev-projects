package org.launchcode;

import java.util.HashMap;
import  java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
//        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        Scanner input = new Scanner(System.in);
        System.out.println("Please give me a string to count: ");
        String testString = input.nextLine().toLowerCase();

        char[] lettersOfString = testString.toCharArray();

        HashMap<Character, Integer> countOfLetters = new HashMap<>();

        for(char letter : lettersOfString) {
            if (Character.isLetterOrDigit(letter)) {
                if (countOfLetters.containsKey(letter)) {
                    countOfLetters.put(letter, countOfLetters.get(letter) + 1);
                } else countOfLetters.put(letter, 1);
            }
        }

        for(Map.Entry<Character, Integer> pair : countOfLetters.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
//        System.out.println("Please work!");
//        String test = "Please continue to work!";
//         String[] arr = test.split("");
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr.contains(arr[i])) {
//                continue;
//            }

//1. Start with string
//2. Split string into arrayList
//3. For loop -> if.contains(i) continue; else .add(i) to newArray
//4. Add newArray to Hashmap and set value to zero
//5. Use .countMatch(newArray, string) and update this return to go to Hashmap value
//Hashmap??