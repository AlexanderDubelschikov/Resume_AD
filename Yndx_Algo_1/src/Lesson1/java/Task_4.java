/*Решите в целых числах уравнение. a, b, c – данные целые числа.
Найдите все решения или сообщите, что решений в целых числах нет.*/

package Lesson1.java;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double x = (c * c - b) / a;

        if (c < 0) {
            System.out.println("NO SOLUTION");
        } else if (a == 0) {
            if (b == c * c) {
                System.out.println("MANY SOLUTIONS");
            } else {
                System.out.println("NO SOLUTION");
            }
        } else if (Math.abs(x - Math.round(x)) < 1e-6) {
                System.out.println((long) x);
            }
        else {
                System.out.println("NO SOLUTION");
            }

    }
}




