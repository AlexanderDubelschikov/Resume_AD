public class Lesson_1_Help {

    public static void printDelim(String title){ //Статический метод(ПАПАМЕТР)
        System.out.println();
        System.out.println();
        System.out.println("^^^^^^^^");
        System.out.println(title);
        System.out.println("________");
    }

    public static void printMult(int a, int b){
        System.out.println(a*b);
    }

    public static void calcDep (int sum, int month, float perc){
        System.out.println("Сумма вклада: " + sum + "; Месяцев до выплат: " + month + "; Процент в месяц: " +
                perc + "; Сумма по возвращению вклада: " + (sum + month * (sum*perc)));
    }

}
