package homework_week_6;

import java.util.Scanner;

/**Write a program to enter any radius value of the circle and find out the area.
 * (Formula of Area A=PI*r*r).
 */
public class Prgrm_6 {
    // Instance method
    public  void test(){
        // scanner class for entering the value in console
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the value of r");
        double radius = Input.nextDouble();// we store in double data type if some one enter the decimal value

        // area of circle = (22*r*r)/7
        double areacircle = (22*radius*radius)/7;
        System.out.println("Area of circle = " + areacircle);
    }
    public static void main(String[] args) {

Prgrm_6 circle = new Prgrm_6();// craete the object
circle.test(); // calling instance method by object name


        }
    }