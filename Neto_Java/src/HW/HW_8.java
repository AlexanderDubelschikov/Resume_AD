package HW;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_8 {

    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors;
        int[][] rotatedColors;
        Scanner scanner = new Scanner(System.in);
        int move = scanner.nextInt();
        colors = generation();
        outputColor(colors);
        rotatedColors = rotated(colors,move);
        outputColor(rotatedColors);
    }
    public static void outputColor(int[][] arr){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] generation(){
        int arr[][] = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arr[i][j] = random.nextInt(256);
            }
        }
        return arr;
    }

    public static int[][] rotated(int[][] arr, int move){
        int[][] rotated = new int[SIZE][SIZE];

        switch(move){
            case(90):
                for (int i = 0; i<SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotated[j][SIZE - i - 1] = arr[i][j];
                    }
                }
                break;

            case(180):
                for (int i = 0; i<SIZE; i++){
                    for (int j = 0; j<SIZE; j++){
                        rotated[i][j] = arr[SIZE-i-1][SIZE-j-1];
                    }
                }
                break;

            case(270):
                for (int i = 0; i<SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotated[i][j] = arr[j][SIZE - i - 1];
                    }
                }
                break;

            default:
                System.out.println("Ошибка, вы ввели ерунду!");
                break;
        }

        return rotated;

    }
}
