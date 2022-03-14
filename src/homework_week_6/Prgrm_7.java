package homework_week_6;

import java.util.Scanner;

/**7.	Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Prgrm_7 {
    public void test(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temprature in degree Fahrenheit");
        double Fahrenheit = input.nextDouble();
        //degree Fahrenheit convert to degree Celsius ((F − 32) × 5/9 = 0°C)
double celcius =((5*(Fahrenheit - 32.0)) / 9.0) ;
        System.out.println("Temprature in celcius = " + celcius);
    }

    public static void main(String[] args) {
        Prgrm_7 obj = new Prgrm_7();// create object
        obj.test();// calling method
    }
}

