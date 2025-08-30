public class Lesson_1 {

    public static String name;
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
    public static void main(String[] args){
        printDelim("ДЕМОГРАФИЯ");
        System.out.println("Имя: Петя");
        System.out.println("Возраст: 70");
        printDelim("ФИНАНСЫ");
        System.out.println("Зарплата: 70000");
        System.out.println("Пенсия: 10000");
        printDelim("МЕДЕЦИНА");
        System.out.println("Группа крови: На рукаве");

        printMult(10,10);
        calcDep(100,1,0.1f);

    }
}
