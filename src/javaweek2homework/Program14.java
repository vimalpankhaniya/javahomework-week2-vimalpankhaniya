package javaweek2homework;
// 14. Write a Java program to print the area and perimeter of a rectangle.
//Test Data:
//Width = 5.5 Height = 8.5
// Expected Output:
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.2014. Write a Java program to print the area and perimeter of a rectangle.
//Test Data:
//Width = 5.5 Height = 8.5
// Expected Output:
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20
 import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        long s1 = input.nextLong();
        long s2 = input.nextLong();
        long area = s1 * s2;
        long perimeter = 2 *(s1 + s2);
        System.out.println("Area" + area);
        System.out.println("Perimeter" + perimeter);



    }


}
