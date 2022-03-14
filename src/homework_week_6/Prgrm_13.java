package homework_week_6;

import java.util.Scanner;

/**13.	Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Prgrm_13 {
    public void average(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first input");
        double input1 = sc.nextDouble();
        System.out.println("Enter second input");
        double input2 = sc.nextDouble();
        System.out.println("Enter third input");
        double input3 = sc.nextDouble();

        double avrg = (input1 + input2 + input3)/2 ;
        System.out.println("Average of the number = " + avrg);
    }

    public static void main(String[] args) {
        Prgrm_13 obj = new Prgrm_13(); // create object
        obj.average(); // calling method via object
    }
}
