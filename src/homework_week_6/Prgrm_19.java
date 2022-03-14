package homework_week_6;

import java.util.Scanner;

/** 19.	Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Prgrm_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Uppercase String");
       String upper =  sc.nextLine();
        System.out.println("Lowercase string is :" + upper.toLowerCase());
    }
}
