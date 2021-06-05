package ex05;
/*
Exercise 5 - Simple Math
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints
Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.
 */
//UCF COP3330 Summer 2021 Assignment 1 Solution Copyright 2021 Ifeoma Chukwu
import java.util.Scanner;
import java.util.Formatter;
public class App5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number?");
        int number1 = input.nextInt();
        System.out.println("What is the second number?");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        int difference = number1 -number2;
        int product = number1 * number2;
        int quotient = number1 / number2;
        System.out.printf(+number1+ "+" +number2 + "= %d\n",sum);
        System.out.printf(+number1+ "-" +number2 + "= %d\n",difference);
        System.out.printf(+number1+ "*" +number2 + "= %d\n",product);
        System.out.printf(+number1+ "/" +number2 + "= %d",quotient);
    }
}
