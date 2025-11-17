package Lesson;

public class Lesson_4 {

    public static void main(String[] args) {

        try /*() Автоматическое закрытие ресурсов!*/ {
            System.out.println("Hello!");
            String s = "Hello";
            char c = getTenSymb(s);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Ошибка была отловлена!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка была отловлена! ...но дургая...");
        } finally {
            System.out.println("Пока-Пока!");
        }
    }

    public static char getTenSymb(String string){
        System.out.println("Извлекаю!");
        char c = string.charAt(10);
        System.out.println("Отправляю!");
        return c;
    }
}
