package org.launchcode;


import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");


        double radius = input.nextDouble();


        if (radius < 0) {
            do {
            System.out.println("Please enter a positive number for the radius");
            System.out.println("Enter a radius: ");
                radius = input.nextDouble();
        } while (radius < 0);
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle with radius " + radius + " is: " + area);
            input.close();
        } else if (!input.hasNextDouble()) {
            System.out.println("Please enter only positive integers");
        } else {
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle with radius " + radius + " is: " + area);
            input.close();
        }
    }

}
