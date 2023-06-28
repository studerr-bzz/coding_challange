package dev.zwazel.easy;

/**
 * Warmup challenge: Write a calculator that can add, subtract, multiply, and divide two numbers.
 */
public class Calculator {
    public static float calculate(char operator, float number1, float number2) {

        float sum = 0;

        switch (operator) {
            case '+':
                sum = number1 + number2;
                break;
            case '-':
                sum = number1 - number2;
                break;
            case '/':
                if(number1 == 0 || number2 == 0) {
                    System.out.println("Cannot divide with 0");
                    throw new ArithmeticException();
                }
                else {
                    sum = number1 / number2;
                }
                break;
            case '*':
                sum = number1 * number2;
                break;
        }
     throw new IllegalArgumentException();

    }

}
