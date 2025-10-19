package Section1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theLessVas = 1001;
        int theMostMash = -1;
        int sumVas = 0;
        int sumMash = 0;
        boolean flag = true;

        int n = scanner.nextInt();
        int[] mushWeight = new int[n];

        for (int i = 0; i < n; i++) {
            mushWeight[i] = scanner.nextInt();
        }


        for (int i = 0; i<mushWeight.length; i++){
            if (flag){

                //Вася
                sumVas+=mushWeight[i];
                theLessVas = (theLessVas>mushWeight[i]) ? mushWeight[i] : theLessVas;

            } else {

                //Маша
                sumMash+=mushWeight[i];
                theMostMash = (theMostMash<mushWeight[i]) ? mushWeight[i] : theMostMash;
            }

            flag = newFlag(flag);
        }

        if (theLessVas<theMostMash){
            System.out.println((sumVas-theLessVas+theMostMash) - (sumMash+theLessVas-theMostMash));
        } else {
            System.out.println(sumVas-sumMash);
        }
    }

    public static boolean newFlag(boolean flag){
        return (flag) ? false : true;
    }
}
