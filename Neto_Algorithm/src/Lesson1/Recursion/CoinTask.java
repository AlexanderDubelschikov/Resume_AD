package Lesson1.Recursion;

import java.util.Scanner;

public class CoinTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int k = scanner.nextInt();
        int i = 0;

        int result = recCoin(a,k,i);
        //System.out.println((recCoin(0,k)>0 ? true : false));

        System.out.println("Общее количество найденных путей: " + result);
        System.out.println("Возможно ли представить? " + (result > 0));

    }


    public static int recCoin(int a, int k, int i){


        if (a>k || i>5 ){
            return 0;
        }

        if (a==k && i == 5){
            return 1;
        }

        return recCoin(a+3,k, i+1)+recCoin(a+5,k, i+1);

    }
}
