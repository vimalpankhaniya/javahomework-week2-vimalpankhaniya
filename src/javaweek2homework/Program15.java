package javaweek2homework;
// 15. Write a Java program to swap two variables.

public class Program15 {
    public static void main(String[] args) {
        String x = "Coke";
        String y = "Fanta";
        String temp;
        temp = x;
        x=y;
        y=temp;
        System.out.println("x: "+x);
        System.out.println("y: "+y);

    }
}
