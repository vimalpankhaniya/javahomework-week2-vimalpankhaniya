package javaweek2homework;

import java.util.Scanner;

// . Write a program to enter any radius value of the circle and find out the
//area.(Formula of Area A=PI*r*r).
public class Program6 {

    public static void main(String[] args) {
        double radius,area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radios of the circle");
        radius = input.nextDouble();
        input.close();
       area = Math.PI *radius * radius;
        System.out.println("Area of the Circle is "+area);
    }
}
