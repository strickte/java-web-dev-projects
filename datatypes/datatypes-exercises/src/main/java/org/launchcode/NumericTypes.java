package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the length of the rectangle?:");
    int rectangleLength =  input.nextInt();
    System.out.println("What is the width of the rectangle?:");
    int rectangleWidth = input.nextInt();
        input.close();
    int rectangleArea = rectangleLength * rectangleWidth;
    System.out.println("The area of the rectangle is " + rectangleArea);
    }
}