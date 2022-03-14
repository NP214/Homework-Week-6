package homework_week_6;

/**
 * 4.1	Declare two instance and two static variables.
 * 4.2	Declare one instance method.
 * 4.3	Declare one static method.
 * 4.4	Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5	Declare the Main method.
 * 4.6	Call both instance and static methods into the Main method and run the programme.
 */

public class Prgrm_4 {
    // 4.1	Declare two instance two static variable
    byte b = 30;
    float f = 30.5f;
    static int a = 10;
    static boolean c = true;

    // 4.2	Declare one instance method.
    public void itest4() {
        // print all 4 variable
        System.out.println(b);// instance variable
        System.out.println(f);// instance variable
        System.out.println(a); // static variable in instance method
        System.out.println(c);// static variable
    }

    //4.3	Declare one static method.
    public static void stest4() {
        // print all 4 variables
        // to print instance variable into the static method create object
        Prgrm_4 p4 = new Prgrm_4();
        System.out.println(p4.b);
        System.out.println(p4.f);
        // print static variable into the static method print direct
        System.out.println(a);
        System.out.println(c);

    }

    // 4.5	Declare the Main method.
    public static void main(String[] args) {
        //4.6	Call both instance and static methods into the Main method and run the programme.
Prgrm_4 obj = new Prgrm_4();// create object for instance method
obj.itest4();// instance method calling via object
Prgrm_4.stest4();// static method calling in main method via class name
    }


}
