package Lesson;

import java.util.Scanner;

public class Lesson_7_tic_tac_toe {

    public static final int SIZE = 3;
    public static final char EMPTY = ' ';
    public static final char PLAYER_1 = 'x';
    public static final char PLAYER_2 = 'o';


    public static void main(String[] args) {

        char[][] field = startGame();
        game(field);

    }

    public static void game(char[][] field){
        printMatrix(field);
        Scanner scanner = new Scanner(System.in);
        int limit = SIZE * SIZE;
        int turn = 0;

        while (true) {
            turn += 1;
            char playerNow = turn % 2 == 0 ? PLAYER_2 : PLAYER_1;
            System.out.println("Ходит - " + playerNow + ". Введи координаты: ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);

            if (field[x][y] != EMPTY) {
                System.out.println("Ход не верный! Поле занято! Повторите ход");
                turn -= 1;
            } else {
                field[x][y] = playerNow;
                printMatrix(field);
                if (colWin(field, playerNow) || rowWin(field, playerNow) || diagonalWin(field, playerNow)) {
                    System.out.println("Выйграл - " + playerNow);
                    break;
                }

                if (turn == limit) {
                    System.out.println("Ничья!");
                    break;
                }
            }
        }

    }
    //Внимание! Только для 3 на 3.
    public static boolean colWin(char[][] arr, char player){
        boolean win = false;

        for (int i = 0; i<SIZE; i++){
            if (arr[i][0] == player && arr[i][1] == player && arr[i][2] == player){
                win = true;
                break;
            }
        }

        return win;
    }

    public static boolean rowWin(char[][] arr, char player){
        boolean win = false;

        for (int i = 0; i<SIZE; i++){
            if (arr[0][i] == player && arr[1][i] == player && arr[i][2] == player){
                win = true;
                break;
            }
        }

        return win;
    }

    public static boolean diagonalWin(char[][] arr, char player){
        boolean win = false;

        if (arr[0][0] == player && arr[1][1] == player && arr[2][2] == player) {
            win = true;
        }
        if (arr[2][0] == player && arr[1][1] == player && arr[0][2] == player) {
            win = true;
        }

        return win;

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

    /*public static void alternativePrint(char[][] arr) {
        for (char[] row : arr) {
            for (char cell : row) {
                System.out.println(cell + " ");
            }
        }
        System.out.println();
    }*/
}
