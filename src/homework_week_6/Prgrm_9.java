package homework_week_6;

// 9. Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class Prgrm_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter uppercase string");
        String upperstr = sc.nextLine();// wrriten string in console is pass here
        String uppperstr1 = upperstr.toLowerCase();
        System.out.println("Lowercase string = " + uppperstr1);
        // or we write as
      //  System.out.println(upperstr.toLowerCase());
    // here we direct print the lowercase in print statement without store in another variable name
    // like we store upperstr1, not necessary to store it, we can print it direct in statement
    }
}
