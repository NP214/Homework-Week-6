package homework_week_6;

/**
 * 5.Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Prgrm_5 {
    int a = 20;
    int b = 10;


    public static void main(String[] args) {
        // Creating object for calling to instance method addition and subtraction
        Prgrm_5 obj1 = new Prgrm_5();
        obj1.addition();
        obj1.subtraction();
        // calling static multiplication and division method direct by method name
        multiplication();
        division();
    }

    public void addition() {
        int c = a + b;
        System.out.println("this is addition method");
        System.out.println("Addition of a+b ="+ c);
        //System.out.println(s);

    }

    public void subtraction() {
        int f = a - b;
        System.out.println("this is subtraction method");
        System.out.println("Subtraction of a -b = " + f);
    }

    public static void multiplication() {
        Prgrm_5 obj2 = new Prgrm_5();
        int m = obj2.a * obj2.b;
        System.out.println("this is multiplication method");
        System.out.println("Multiplication of a * b =" + m);
    }

    public static void division() {
        Prgrm_5 obj3 = new Prgrm_5();
        int d = obj3.a / obj3.b;
        System.out.println("this is division method");
        System.out.println("Division of a/b = "+ d);
    }
}

