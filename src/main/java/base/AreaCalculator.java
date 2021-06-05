/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class AreaCalculator {
    final double f2m2Conversion = 0.09290304;
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        AreaCalculator myApp = new AreaCalculator();
        myApp.output();
    }

    private int lengthPrompt() {
        System.out.print("What is the length of the room in feet? ");
        return Integer.parseInt(in.nextLine());
    }

    private int widthPrompt() {
        System.out.print("What is the width of the room in feet? ");
        return Integer.parseInt(in.nextLine());
    }

    private double[] calculations(int length, int width) {
        double areaFeet = length * width;
        double areaMeters = areaFeet * f2m2Conversion;
        return new double[]{areaFeet, areaMeters};
    }

    private void output() {
        int length = lengthPrompt();
        int width = widthPrompt();
        System.out.printf("You entered dimensions of %d feet by %d feet.", length, width);
        System.out.printf("The area is\n%.0f square feet\n%.3f square meters", calculations(length, width)[0], calculations(length, width)[1]);
    }
}
