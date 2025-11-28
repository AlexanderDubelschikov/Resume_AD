package Lesson;

import java.util.ArrayList;

public class Lesson_6 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Petya");
        list.add("Olya");
        list.add("Sergay");
        System.out.println(list);
        System.out.println(list.size());
        list.set(0, "Kolya");
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(1,"Hero");
        System.out.println(list);
        System.out.println(list.contains("Olya"));


    }
}
