package homework_week_6;

import java.util.Scanner;

/** 16.	Write a Java program to add two binary numbers.
 * 	 	Input Data:
 * 	 	 	Input first binary number: 10
 * 	 	 	Input second binary number: 11
 */
public class Prgrm_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first binary number");
        String input1 = sc.next();
        System.out.println("Input second binary number");
        String input2 = sc.next();
        int a = Integer.parseInt(input1);
        int b = Integer.parseInt(input2);
        int sum = a+b;
        System.out.println("Sum of two binary numbers:" + Integer.toBinaryString(sum));

    }
}
