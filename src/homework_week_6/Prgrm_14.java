package homework_week_6;

/**14.	Write a Java program to print the area and perimeter of a rectangle.
 Test Data:
 Width = 5.5 Height = 8.5
 Expected Output:
 Area is 5.6 * 8.5 = 47.60
 Perimeter is 2 * (5.6 + 8.5) = 28.20

 */
public class Prgrm_14 {
    public static void main(String[] args) {
        float Width = 5.6f;
        float Heigt = 8.5f;
        System.out.println("Area is ="+ Width*Heigt);
        System.out.println("Perimeter is ="+ 2*(Width+Heigt));
    }
}
