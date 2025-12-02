package Lesson;

import java.util.HashMap;
import java.util.Map;

public class Lesson_7_part_2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Petya", 8);
        map.put("Oleg", 10);
        map.put("Tanya", 25);
        int age = map.get("Tanya");
        System.out.println(age);
        System.out.println("Hello World".hashCode());

        for (String m : map.keySet()){
            System.out.println(m+" "+map.get(m));

        }

        for (Map.Entry<String, Integer> kv : map.entrySet()){
            System.out.println(kv.getKey() + " = "+ kv.getValue());

        }
    }
}
