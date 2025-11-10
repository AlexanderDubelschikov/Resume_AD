package Lesson;

public class Lesson_2 {

    public static void main(String[] args) {

        //Person person = new Person("Alex",35);
        //Singer singer = new Singer("Ann", 29, 100);

        Person person = new Singer("Ann", 29, 100);
        person.happyBirthday();

        Singer singer = new Singer("Ann", 29, 100);
        if (checkPerson(singer))
            System.out.println("Слишком молодой");
        else
            System.out.println("Уважаемый");
    }

    public static boolean checkPerson(Person person) {
        if (person.getAge() < 18)
            return true;
        else
            return false;

        //return person.getAge()>=18;
    }


}
