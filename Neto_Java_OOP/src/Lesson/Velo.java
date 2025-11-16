package Lesson;

public class Velo implements Transfer{
    @Override
    public void transfer(String name, String from, String to) {
        System.out.println("Пассажир: " + name + ". Поехал на велосипеде в " + to + " из " + from + ".");
    }
}
