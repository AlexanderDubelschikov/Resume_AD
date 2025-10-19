package Lesson;

import java.util.Scanner;

public class Lesson_7_tic_tac_toe {

    public static final int SIZE = 3;
    public static final char EMPTY = ' ';
    public static final char PLAYER_1 = 'x';
    public static final char PLAYER_2 = 'o';


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        char[][] field = startGame();
        printMatrix(field);

        System.out.println("Введи координаты!");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);

        if (field[x][y] != EMPTY) {
            // TODO переходить!
        } else {
            field[x][y] = PLAYER_1;
        }


    }

    public static char[][] startGame() {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }
        return field;
    }

    public static void printMatrix(char[][] arr) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + arr[i][j] + " ");
                if (j != 2) System.out.print("|");
            }
            System.out.println();
            if (i != 2) System.out.println("-----------");
        }
    }

    public static void alternativePrint(char[][] arr) {
        for (char[] row : arr) {
            for (char cell : row) {
                System.out.println(cell + " ");
            }
        }
        System.out.println();
    }
}
