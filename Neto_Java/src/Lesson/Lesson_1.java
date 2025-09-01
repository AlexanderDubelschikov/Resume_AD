package Lesson;

import my.favourite.code.B;
import java.util.Scanner;
public class Lesson_1 {

    public static String name;

    public static void main(String[] args){
        Lesson_1_Help.printDelim("ДЕМОГРАФИЯ");
        System.out.println("Имя: Петя");
        System.out.println("Возраст: 70");
        Lesson_1_Help.printDelim("ФИНАНСЫ");
        System.out.println("Зарплата: 70000");
        System.out.println("Пенсия: 10000");
        Lesson_1_Help.printDelim("МЕДЕЦИНА");
        System.out.println("Группа крови: На рукаве");

        Lesson_1_Help.printMult(10,10);
        Lesson_1_Help.calcDep(100,1,0.1f);

        B.Me();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число: ");
        int num = scanner.nextInt();
        double d_num = scanner.nextDouble();
        String words = scanner.next();
        //scanner.nextLine()//Всю строку
        System.out.println(num);






    }
}
