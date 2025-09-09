package Lesson1.java;

/*Даны три натуральных числа. Возможно ли построить треугольник с такими сторонами. Если это возможно, выведите строку YES, иначе выведите строку NO.
       Треугольник — это три точки, не лежащие на одной прямой.*/

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(isTriangle(a,b,c));

    }

    public static String isTriangle(int a, int b, int c) {
        return (a + b > c && a + c > b && c + b > a) ? "YES" : "NO";
    }
}
