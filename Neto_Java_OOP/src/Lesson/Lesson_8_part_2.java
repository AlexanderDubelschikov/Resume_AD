package Lesson;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lesson_8_part_2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();
        map.put("Petya", 23);
        map.put("Olya", 64);
        int age = map.get("Petya");
        System.out.println(age);

        Set<String> newSet = new TreeSet<>();
        newSet.add("Petya");
        newSet.add("Olya");
        newSet.add("Boris");

        System.out.println(newSet);

    }
}
