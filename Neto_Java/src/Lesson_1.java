public class Lesson_1 {

    public static void printDelim(String title){ //Статический метод(ПАПАМЕТР)
        System.out.println();
        System.out.println();
        System.out.println("^^^^^^^^");
        System.out.println(title);
        System.out.println("________");
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

    }
}
