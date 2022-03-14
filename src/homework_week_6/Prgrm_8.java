package homework_week_6;

import java.util.Scanner;

//8. Write a program to calculate the area of a triangle.
public class Prgrm_8 {
    public void triangle(){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Height of triangle");
         double Height= a.nextDouble();// we write the input in cosole is store in this line as a height
        // We pass a input decimal or non decimal value thats why we use double data type
        System.out.println("Enter Base of triangle");
        double Base = a.nextDouble();
        double area = (Height*Base)/2;
        System.out.println("Area of Triangle = " + area);
    }

    public static void main(String[] args) {
        Prgrm_8 obj = new Prgrm_8(); // create object
        obj.triangle(); // calling method
    }



}
