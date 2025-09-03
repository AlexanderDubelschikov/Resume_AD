package HW;

import java.util.Scanner;

public class HW_3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int year, day;
        int win = 0;

        while(true){

            System.out.println("Введи год в формате yyyy: ");
            year = scanner.nextInt();
            System.out.println("Введите кол-во дней (365 и 366): ");
            day = scanner.nextInt();

            if ((year%400==0 || (year%4==0 && year%100!=0)) && day == 366)
            {
                System.out.println("Молодец! Следующий раунд!");
                win = win + 1;
            } else if((year%400!=0 || (year%4!=0 && year%100==0)) &&day == 365){
                System.out.println("Молодец! Следующий раунд!");
                win = win + 1;
            }
            else {
                if (year%400==0 || (year%4==0 && year%100!=0))
                {
                    System.out.println("Не правильно! Правильно 366!");
                }
                else {
                    System.out.println("Не правильно! Правильно 365!");
                }
                break;
            }

        }

    System.out.println("Ты победил целых " + win + " раза.");

    }
}
