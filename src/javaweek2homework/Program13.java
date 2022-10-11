package javaweek2homework;
// 13. Write a Java program that takes three numbers as input to calculate and
//print the average of the numbers13. Write a Java program that takes three numbers as input to calculate and
//print the average of the numbers.

 import java.util.Scanner;

public class Program13 {
    int input1 =10;
    int input2 =20;
    int input3 =30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter thirf number:");
        int num3 = sc.nextInt();

        System.out.println("Average of given 3 number is :"+"\t"+(num1+num2+num3)/3);

    }
}
