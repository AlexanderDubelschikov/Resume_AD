package HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {

        Address adress1 = new Address("Russia", "Moscow");
        Address adress2 = new Address("USA", "New-York");
        Map<Address, Integer> map = new HashMap<>();
        map.put(adress1, 500);
        map.put(adress2, 1000);
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[3];
        int sum = 0;
        boolean flag = true;

        while (flag) {

            System.out.println("Заполнение нового заказа.");
            System.out.print("Введите страну: ");
            input[0] = scanner.nextLine();

            if (input[0].toLowerCase().equals("end")) {
                flag = false;
                continue;
            }

            System.out.print("Введите город: ");
            input[1] = scanner.nextLine();
            System.out.print("Введите вес (кг): ");
            input[2] = scanner.nextLine();

            Address adressForCheck = new Address(input[0], input[1]);

            if (map.containsKey(adressForCheck)) {

                int howMany = Integer.parseInt(input[2]);
                int cost = map.get(adressForCheck);
                int finalCost = cost * howMany;
                sum = sum + finalCost;
                System.out.println("Стоимость доставки составит: " + finalCost);
                System.out.println("Общая стоимость всех доставок: " + sum + "\n");

            } else {
                System.out.println("Доставки по этому адресу нет\n");
            }
        }
    }
}
