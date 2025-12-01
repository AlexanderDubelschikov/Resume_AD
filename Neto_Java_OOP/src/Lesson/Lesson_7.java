package Lesson;

import java.util.ArrayList;

public class Lesson_7 {

    public static void main(String[] args) {

        /*ArrayList<String> goodList = new ArrayList<>();
        goodList.add("Хрю");
        goodList.add("Гав");
        goodList.add("Мяу");

        String sound = goodList.get(1);*/


        MyMap<String, UserInfo> map = new MyMap();
        map.put("Petya", new UserInfo(10));
        map.put("Olya", new UserInfo(15));
        map.put("Cris", new UserInfo(20));
        UserInfo info = map.get("Petya");
        System.out.println(info);

    }
}
