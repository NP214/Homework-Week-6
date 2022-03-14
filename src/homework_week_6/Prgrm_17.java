package homework_week_6;

import java.util.Scanner;

/** 17.	Write a Java program to convert a decimal number to binary number.
 Input Data:
 Input a Decimal Number : 5
 Expected Output
 Binary number is: 101
 */
public class Prgrm_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal number");
        int decimal = sc.nextInt();
        System.out.println(Integer.toBinaryString(decimal));

    }
}

