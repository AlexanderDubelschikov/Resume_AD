package Lesson1.java;

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        tableSize(a,b,c,d);

    }

    public static void tableSize(int a, int b, int c, int d){

        int flag = 1;
        int minSquare;

        int s1 = (c+a)*Math.max(b,d);
        String str_1 = (c+a) + " " + Math.max(b,d);
        minSquare = s1;

        int s2 = (c+b)*Math.max(d,a);
        String str_2 = (c+b) + " " + Math.max(d,a);
        if (minSquare>s2) {
            flag = 2;
            minSquare = s2;
        }

        int s3 = (d+b)*Math.max(c,a);
        String str_3 = (d+b) + " " + Math.max(c,a);
        if (minSquare>s3) {
            flag = 3;
            minSquare = s3;}

        int s4 = (d+a)*Math.max(c,b);
        String str_4 = (d+a) + " " + Math.max(c,b);
        if (minSquare>s4) {
            flag = 4;
            }


        switch (flag){

            case 1:

                System.out.println(str_1);
                break;

            case 2:

                System.out.println(str_2);
                break;

            case 3:

                System.out.println(str_3);
                break;

            case 4:

                System.out.println(str_4);
                break;
        }
    }
}
