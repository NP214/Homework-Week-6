package homework_week_6;

/**
 * 3.1	Declare one instance and one static variable.
 * 3.2	Declare one instance method.
 * 3.3	Declare one static method.
 * 3.4	Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5	Declare the Main method.
 * 3.6	Call both instance and static methods into the Main method and run the programme.
 */
public class Prgrm_3 {
    //  3.1	Declare one instance and one static variable.
    int a = 10; // instance variable
    static String s = "nidhi"; // static variable

    //3.2	Declare one instance method.
    public void itest() {
        //3.4declare instance and static variable into the instance method
        System.out.println(a);// print instance variable into the instance method direct
        System.out.println(s); // here s variable is static , still we only write "s" in instance
        // bcoz "itest" instance method calling into the main method that,s why no need to create object here

    }

    //3.3	Declare one static method.
    public static void stest() {
        Prgrm_3 obj = new Prgrm_3(); // create object for instance variable to print this method

        //3.4 declare instance and static variable into this static method
        System.out.println(obj.a);
        System.out.println(s);

    }

    // 3.5 Declare one main method
    public static void main(String[] args) {
        Prgrm_3.stest(); // static method direct calling via class name
        Prgrm_3 p = new Prgrm_3(); // create object for instance method
        p.itest();// instance method calling

    }
}
