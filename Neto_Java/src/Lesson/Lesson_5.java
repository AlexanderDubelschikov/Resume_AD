package Lesson;

public class Lesson_5 {

    public static void main(String[] args) {

        Singer singer = new Singer("Petya", 8, 3);
        /*singer.name = "Petya";
        singer.age = 23;
        singer.rating = 10;
        singer.sing("Good Morning!");
        System.out.println(singer.isToYoung());*/

        System.out.println(singer);

        Singer singer2 = new Singer();
        /*singer2.name = "Ann";
        singer2.age = 20;
        singer2.rating = 5;*/

        System.out.println(singer2);
        System.out.println(singer);

        Album album = new Album("Rock and Roll", 2025, singer);

    }

}
