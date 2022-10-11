package javaweek2homework;

import java.util.Scanner;

// 5. Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods.)
public class Program5 {
    public static void main(String[] args) {
        int first, second, add, subtract, multiply;
        float devide;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Two Number :");
        first = scanner.nextInt();
        second= scanner.nextInt();

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        devide = (float) first / second;

        System.out.println("Sum = " + add);
        System.out.println("add = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + devide);

    }

}
