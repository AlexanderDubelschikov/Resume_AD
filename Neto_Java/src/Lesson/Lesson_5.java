package Lesson;

public class Lesson_5 {

    public static void main(String[] args) {

        Singer singer = new Singer();
        singer.name = "Petya";
        singer.age = 23;
        singer.rating = 10;
        singer.sing("Good Morning!");
        System.out.println(singer.isToYoung());

        System.out.println(singer);

        Singer singer2 = new Singer();
        singer2.name = "Ann";
        singer2.age = 20;
        singer2.rating = 5;

        System.out.println(singer2);

    }

}
