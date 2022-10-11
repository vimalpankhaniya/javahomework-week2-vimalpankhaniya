package javaweek2homework;
// 4. Write a Java programme using the following steps.
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.
public class Program4 {
    int a = 15;
    int b = 20;
    static String name = "vimal";
    static String surname = "Pankhaniya";

    public static void main(String[] args) {
        Program4 d = new Program4();
        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(name);
        System.out.println(surname);



    }

    // instance method
    public void myMethod() {
        System.out.println(a);
        System.out.println(b);
        Program4 program4 = new Program4();
        System.out.println(program4.a);
        System.out.println(program4.b);
    }
    // static method
        public static void bike (){
            System.out.println(name);
            System.out.println(surname);
        }

}
