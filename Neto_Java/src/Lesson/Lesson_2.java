package Lesson;

import java.util.Scanner;

public class Lesson_2 {
    public static void main(String[] args){
        System.out.println("Hello!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите число: ");
        //int kol = scanner.nextInt();
        int kol = 5;
        // || - Или, && - И, == - Равно, != - не равен.

        if(kol>=2 && kol<=5) {
            System.out.println("Оценка допустима!");
        } else{
            System.out.println("Оценка НЕ допустима!");}

        String name = "Alexander";

        /*if (name == "Ann")
            System.out.println("Совпадение");
        else
            System.out.println("НЕ совпадение");*/

        if (name.equals("Ann"))
            System.out.println("Совпадение");
        else
            System.out.println("НЕ совпадение");

        int top_rate = 3; //Топ от 1 до 10

        if (top_rate == 2)
            System.out.println("Ужасно");
        else if (top_rate<7){
            System.out.println("Нормально!");
        }
        else{
            System.out.println("Отлично!");
        }

        String mode = "Cold";

        switch (mode){
            case "Normal":
                System.out.println("Температуру не меняем");
                break;
            case "Cold":
                System.out.println("Температуру повышаем!");
                break;
            default:
                System.out.println("Ошибка!");
                break;
        }

        int x = 13;

        int y;

        if (x==13){
          y = 1;
        }
        else{
            y = 0;
        }

        System.out.println(y);

        int yy = (x==13) ? 1:0;

        System.out.println(yy);





        //System.out.println("Доброй ночи!");
    }
}
