package Lesson1.java;

/*Имеется N кг металлического сплава. Из него изготавливают заготовки массой K кг каждая. После этого из каждой заготовки
вытачиваются детали массой M кг каждая (из каждой заготовки вытачивают максимально возможное количество деталей).
Если от заготовок после этого что-то остается, то этот материал возвращают к началу производственного цикла и сплавляют
с тем, что осталось при изготовлении заготовок. Если того сплава, который получился, достаточно для изготовления хотя
бы одной заготовки, то из него снова изготавливают заготовки, из них – детали и т.д. Напишите программу, которая
вычислит, какое количество деталей может быть получено по этой технологии из имеющихся исходно N кг сплава.*/

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(smelting(n,k,m));
    }

    public static int smelting(int n, int k, int m){

        int finalKol = 0;
        int ost = 0;
        int kol_k;
        boolean flag = (m>k || k>n || n == 0 || k == 0 || m == 0) ? false : true;

        while (flag){

            kol_k=n/k;
            ost = n%k;
            finalKol += (k/m)*kol_k;
            ost +=(k%m)*kol_k;

            if (ost<k){
                break;
            }

            n = ost;
        }

        return finalKol;
    }
}
