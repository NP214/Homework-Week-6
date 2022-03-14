package homework_week_6;

/**
  1.1	Declare two instance variables.
  1.2	Declare one instance method.
  1.3	Call both instance variables into the instance method inside the print statement.
  1.4	Declare the Main method.
  1.5	Call the above instance method into the Main method and Run the programme.
 */
public class Prgrm_1 {
    //1.	Declare two instance variables.
    int a = 10;
    String b = "Nidhi";

    // 2.	Declare one instance method.
    public void test() {
        //3.	Call both instance variables into the instance method inside the print statement.

        System.out.println(a);
        System.out.println(b);
    }

    //4.	Declare the Main method.
    public static void main(String[] args) {
        Prgrm_1 p = new Prgrm_1();
        p.test(); //Call the above instance method into the Main method and Run the programme.
    }
}
