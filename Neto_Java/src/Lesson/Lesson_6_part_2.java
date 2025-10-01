package Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_6_part_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temps = new int[30];
        boolean[] wasInput = new boolean[30];

        //Arrays.fill(temps, -1000000);

        while(true){
            System.out.println("Введи два числа: дата и температура");
            String input = scanner.nextLine();

            if ("end".equals(input.toLowerCase())){
                break;
            }

            //input.substring(0, input.indexOf(" "));
            String[] parts = input.split(" ");
            int day = Integer.parseInt(parts[0]) - 1;
            int t = Integer.parseInt(parts[1]);
            temps[day] = t;
            wasInput[day] = true;

            double sum = 0;

            for (int tt: temps){
                sum+=tt;
            }

            int cnt = 0;

            for (boolean wasCnt : wasInput){
                if (wasCnt){
                    cnt++;
                }
            }

            System.out.println("Средняя " + (cnt));

        }

    }

}
