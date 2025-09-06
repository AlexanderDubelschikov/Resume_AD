package HW;

import java.util.Scanner;

public class HW_4 {

    // УСН доходы - налог 6% от доходов;
    // УСН доходы минус расходы - налог 15% от разницы доходов и расходов.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;

        while (true) {

            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            int operation = Integer.parseInt(input);

            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Введите сумму расхода: ");
                    String spendStr = scanner.nextLine();
                    int spend = Integer.parseInt(spendStr);
                    spendings += spend;
                    System.out.println("");
                    break;

                case 3:
                    int tax = taxEarningsMinusSpendings(earnings, spendings);
                    int tax2 = taxEarnings(earnings);

                    if (tax > tax2) {
                        System.out.println("Ваш налог составит: " + tax2 + " рублей.");
                        System.out.println("Налог в другой системе : " + tax + " рублей.");
                        System.out.println("Экономия: " + (tax-tax2) + " рублей");
                        System.out.println("");
                    }
                    else{
                        System.out.println("Ваш налог составит: " + tax + " рублей.");
                        System.out.println("Налог в другой системе : " + tax2 + " рублей.");
                        System.out.println("Экономия: " + (tax2-tax) + " рублей");
                        System.out.println("");
                    }
                    break;

                default:
                    System.out.println("Такой операции нет");

            }

        }

    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static int taxEarnings(int earnings) {
        int tax = earnings* 6 / 100;
        return tax;
    }

}
