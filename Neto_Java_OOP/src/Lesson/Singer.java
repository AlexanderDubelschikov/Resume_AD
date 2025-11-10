package Lesson;

import Lesson.Person;

public final class Singer extends Person {

    private int rating;

    public Singer(String name, int age, int rating){
        super(name, age);
        this.rating = rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public void happyBirthday() {
        age++;
        //super.happyBirthday();
        System.out.println("Еще один успешный год для певца! Уже " + age);
    }

    public void sing(String song) {
        System.out.println("Я пою " + song);
    }

    @Override
    public String toString() {
        return "[" + rating + "] " + "(" + name + ") " + "{" + age + "}";
    }
}
