package javaweek2homework;
// // 1 Write a Java programme using the following steps.
////1.1 Declare two instance variables.
////1.2 Declare one instance method.
////1.3 Call both instance variables into the instance method inside the print statement.
////1.4 Declare the Main method.
////1.5 Call the above instance method into the Main method and Run the programme.
public class Program1 {
    int a = 5;
    int b = 6;

    public static void main(String[] args) {
         Program1 m=new Program1();
        System.out.println(m.a);
        System.out.println(m.b);
        m.myMethod();

    }
    // instance method
     public void myMethod() {
         System.out.println(a);
         System.out.println(b);
     }
}
