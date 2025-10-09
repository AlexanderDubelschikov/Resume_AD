package Lesson;

import java.util.Arrays;

public class Lesson_7 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //int [][] arr2 = new int[3][5];
        int[][] arr2 = {
                new int[1],
                new int[2],
                {1, 22, 3}
        };
        int[][][] arr3 = new int[10][10][10];
        //arr2[0] = new int[1];
        //arr2[1] = new int[2];
        //arr2[2] = new int[3];
        arr2[1][1] = 15;

        for (int i = 0; i<arr2.length; i++){
            //int[] tmp = arr2[i];
            //System.out.println(Arrays.toString(tmp));
            for (int j = 0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }


        //System.out.println(Arrays.deepToString(arr2));
    }
}
