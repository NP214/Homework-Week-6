package homework_week_6;

/** 12.	Write a Java program to compute the specified expressions and print the output.
 Test Data:
 ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))  Expected Output :  2.138888888888889

 */
public class Prgrm_12 {
    public static void main(String[] args) {
        float f1 = 25.5f;
        double d = 3.5;
        double d1 = 40.5;
        float f2 = 4.5f;
        double answer = ((f1 * d - d * d) / (d1 - f2));
        System.out.println(answer);

    }
}
