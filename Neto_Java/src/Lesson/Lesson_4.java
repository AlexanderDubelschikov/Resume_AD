package Lesson;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson_4 {

    public static void main(String[] args) {

        // В ссылочных типах данных используется КУЧА. Мы кладем туда что-то, а в переменную заносим
        //уже адрес, где там в куче лежат наши данные.
        int x = 10;

        final int MY_AGE = 1_000_000;

        String str = "Hello";
        str = str.toLowerCase();
        System.out.println(str);
        Scanner scanner = new Scanner(System.in);

        ArrayList list = new ArrayList();
        list.add("Hello!");
        list.add("Bye!");
        System.out.println(list);

        ArrayList list2 = list;
        list2.remove("Bye!");
        System.out.println(list);
        System.out.println(list2);

        ArrayList list3 = new ArrayList();
        list3.add("Hello!");
        System.out.println(list == list3);
        System.out.println(list.equals(list3));

        System.out.println("==============");

        String s = "Hello World!";
        System.out.println(s.replace("l","@"));
        System.out.println(s);
        System.out.println(s.contains("llo"));
        System.out.println(s.startsWith("H"));
        System.out.println(s.indexOf(" "));

        //Это плохо. Копирование работает медленно.
        s = "";
        s = s + "Hello ";
        s = s + "World";
        s = s + "!";
        System.out.println(s);

        StringBuilder sb  = new StringBuilder();
        sb.append("Hello ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb);
        String ss = sb.toString();
    }
}
