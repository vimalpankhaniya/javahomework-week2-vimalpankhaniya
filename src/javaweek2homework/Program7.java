package javaweek2homework;
// 7. Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).7. Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).
//8. Write a program to calculate the area of a triangle
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        float temp;
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter the temperature/n");
        temp=sc.nextFloat();
        temp=(temp-32) *5/9;
        System.out.println("celcius temp is + temp");

    }


}
