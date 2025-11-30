package HW;

import java.util.ArrayList;
import java.util.Scanner;

public class HW_3 {

    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {

            enterMainMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    System.out.println("Вы выбрали: 0. Выход из программы");
                    flag = false;
                    break;
                case "1":
                    System.out.println("Вы выбрали: 1. Добавить дело");
                    System.out.print("Введите название задачи: ");
                    String task = scanner.nextLine();
                    if (toDoList.contains(task)) {
                        System.out.println("Такое дело уже есть!");
                    } else {
                        toDoList.add(task);
                        System.out.println("Добавлено!");
                    }
                    break;

                case "2":
                    System.out.println("Вы выбрали: 2. Показать дела");
                    int num = 1;
                    for (String str : toDoList) {
                        System.out.println(num + ". " + str);
                        num += 1;
                    }
                    break;

                case "3":
                    System.out.println("Вы выбрали: 3. Удалить дело по номеру");
                    System.out.print("Введите номер для удаления: ");
                    String toDoNum = scanner.nextLine();

                    if (Integer.parseInt(toDoNum) > toDoList.size() || Integer.parseInt(toDoNum) <= 0) {
                        System.out.println("Нет дела с таким номером!");
                    } else {
                        toDoList.remove(Integer.parseInt(toDoNum) - 1);
                    }
                    break;

                case "4":
                    System.out.println("Вы выбрали: 4. Удалить дело по названию");
                    System.out.print("Введите дело для удаления: ");
                    String str = scanner.nextLine();

                    if (toDoList.contains(str)) {
                        toDoList.remove(str);
                        System.out.println("Удалено!");
                    } else {
                        System.out.println("Нет такого дела!");
                    }

                    break;
                default:
            }
            System.out.println();
        }
    }

    public static void enterMainMenu() {
        System.out.println("Выберите операцию:\n\n0. Выход из программы\n1. Добавить дело\n2. Показать дела\n3. Удалить дело по номеру\n4. Удалить дело по названию\n\n");
    }
}
