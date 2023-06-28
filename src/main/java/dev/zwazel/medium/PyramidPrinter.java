package dev.zwazel.medium;

import java.util.Scanner;

/**
 * Write a program that takes a number as input and outputs a pyramid of that width.
 * Example: if number is 3, console output should be:
    *
   * *
  * * *
 */
public class PyramidPrinter {
    public static int pyramidString(int baseWidth){

        for (int i = 0; i <= baseWidth; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        return 0;
    }
}
