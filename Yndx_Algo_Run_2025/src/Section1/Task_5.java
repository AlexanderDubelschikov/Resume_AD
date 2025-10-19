package Section1;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(recTable(0,x,k));

    }

    public static int recTable(int i, int x, int k){

        if (i==k){
            return x;
        }

        x = x + x%10;
        return recTable(i+1,x,k);
    }
}
