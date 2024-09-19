package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?:");
        int milesDriven =  input.nextInt();
        System.out.println("How many gallons of gas have you used?:");
        int gasUsed = input.nextInt();
        input.close();
        int milesPerGallon = milesDriven / gasUsed;
        System.out.println(milesPerGallon + " mpg");
    }
}
