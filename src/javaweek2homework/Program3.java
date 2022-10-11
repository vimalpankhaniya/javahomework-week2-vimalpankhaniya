package javaweek2homework;

// 3 . Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the
//print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme
public class Program3 {

    int a = 12;
    static String name = "Vimal";

    public static void main(String[] args) {
        Program3 c = new Program3();
        System.out.println(c.a);
        System.out.println(name);
        bike();




    }

    // instance method

    public void myMethod() {
        Program3 program3=new Program3();
        System.out.println(a);
        System.out.println(program3.a);

    }

    // static method
    public static void bike() {
        System.out.println(name);
    }
}
