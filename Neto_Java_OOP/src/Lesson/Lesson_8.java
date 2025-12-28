package Lesson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lesson_8 {

    public static void main(String[] args) {
        //NewPerson p1 = new NewPerson("Petya", 25);
        //NewPerson p2 = new NewPerson("Kolya", 30);

        List<NewPerson> people = new ArrayList<>();
        people.add(new NewPerson("Petya", 25));
        people.add(new NewPerson("Kolya", 30));
        people.add(new NewPerson("Olya", 8));
        people.add(new NewPerson("Ann", 44));

        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);

    }
}
