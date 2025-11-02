package Lesson;

public class Lesson_1 {

    public static void main(String[] args) {
        Person person = new Person("Petya", 6);
        System.out.println(person.isTooYoung());
        person.setAge(40);
        person.setAge(-9);
        System.out.println(person.getAge());

        Singer singer = new Singer("Olya", 25, 4);
        person.happyBirthday();
        singer.setAge(25);
        singer.sing("Кукула Колдуна");
        singer.setRating(25);
        System.out.println(singer.getRating());
        singer.happyBirthday();
        System.out.println(singer.toString());

        /*person.setRating(101);
        person.printRating();*/


    }
}
