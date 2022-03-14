package homework_week_6;
/**10.	Write a Java program that takes a number as input and prints its multiplication table up to 10.
 Test Data: Input a number: 8 Expected Output :
 8 x 1 = 8
 8 x 2 = 16
 8 x 3 = 24
 8 x 10 = 80
 */

import java.util.Scanner;

public class Prgrm_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table of number");
       int tbl =  sc.nextInt();
       // for loop
        for (int i = 1; i <=10; i++){
            // if u want to loop it up to 10,then we use <=10, "++" means increment upto 10
            int sum = i*tbl;
            System.out.println(tbl+" * "+ i + " = " + sum);
        }
    }
}
