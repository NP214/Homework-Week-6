package homework_week_6;

import java.util.Scanner;

/**
 * 18.	Write a Java program to print the sum (addition), multiply, subtract,
 * divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125 Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Prgrm_18 {
    //int a = 125;
   // int b = 24;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b ");
        int b = sc.nextInt();
        // Here we create all the formulas and store in integer and print it
        int sum = a+b;
        int mult = a*b;
        int sub = a-b;
        int div = a/b;
        int rem = a%b;
        System.out.println("Addition of a +b = "+ sum);
        System.out.println("Multiplication of a * b =" + mult);
        System.out.println("Subtraction of a - b = " + sub);
        System.out.println("Division of a / b = " + div);
        System.out.println("Remainder of a % b = " + rem);
    }

}
