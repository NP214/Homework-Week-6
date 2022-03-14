package homework_week_6;

/**
 * 2.1	Declare two static variables
 * 2.2	Declare one static method
 * 2.3	Call both static variables into the static method inside the print statement.
 * 2.4	Declare the Main method.
 * 2.5	Call the static method into the Main method and Run the programme.
 */
public class Prgrm_2 {
    //2.2	Declare one static method
    public static void addition() {
        //2.1	Declare two static variables
        int a = 10;
        int b = 20;
        int c = a + b;
        //2.3	Call both static variables into the static method inside the print statement.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    //2.4	Declare the Main method.
    public static void main(String[] args) {
        //2.5	Call the static method into the Main method and Run the programme.
        Prgrm_2.addition();
    }
}
