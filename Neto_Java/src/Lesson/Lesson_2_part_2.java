package Lesson;

import com.sun.jdi.ThreadGroupReference;

import java.util.Scanner;

public class Lesson_2_part_2 {

    public static void main(String[] args) throws Exception{

        int i = 100;

        while(i>0){
            i--;
            if (i%2==0){
                continue;
            }
            if (i == 83){
                break;
            }
            System.out.println("Hello world " + i + " раз!");
            Thread.sleep(100);

        }

        /*do {

        } while(i > 10)*/

        for (int r = 0; r<10; r++){
            System.out.println(r);

        }

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true){
            System.out.println("Введи число или end чтобы закончить: ");
            String help = scanner.nextLine();

            if (help.equals("end")){
                break;
            }
            sum = sum + Integer.parseInt(help);


        }
        System.out.println(sum);
    }
}
