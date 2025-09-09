package Lesson1.java;

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
