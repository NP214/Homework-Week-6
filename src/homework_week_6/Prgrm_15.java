package homework_week_6;

import java.util.Scanner;

//15.	Write a Java program to swap two variables.
public class Prgrm_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b = ");
        int b = sc.nextInt();
        int exmp;
        exmp = a;
        a = b;
        b = exmp;
        System.out.println("After swapping a = " + a + " b = " +b );

    }
}
