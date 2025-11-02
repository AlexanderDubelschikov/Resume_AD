package Lesson;

public class Person {

    protected String name;
    protected int age;
    /*public int rating;

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void printRating(){
        System.out.println(rating);
    }*/

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void happyBirthday(){
        age++;
        System.out.println("Поздравляем с " + age + " днем рождения!");
    }

    public boolean isTooYoung() {
        if (age < 18) {
            return true;
        } else {
            return false;
        }

    }
}
