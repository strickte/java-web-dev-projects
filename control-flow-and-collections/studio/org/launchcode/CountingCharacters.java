package org.launchcode;

import java.util.ArrayList;

public class CountingCharacters {
    public static void main(String[] arg) {
        System.out.println("Please work!");
        String test = "Please continue to work!";
         String[] arr = test.split("");
        for (int i = 0; i < arr.length; i++) {
        
            if (arr.contains(arr[i])) {
                continue;
            }

        //1. Start with string
        //2. Split string into arrayList
        //3. For loop -> if.contains(i) continue; else .add(i) to newArray
        //4. Add newArray to Hashmap and set value to zero
        //5. Use .countMatch(newArray, string) and update this return to go to Hashmap value
        //Hashmap??
    }
}
