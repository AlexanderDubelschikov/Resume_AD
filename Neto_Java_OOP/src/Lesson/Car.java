package Lesson;

public class Car extends Transport{

    public Car() {
        super(100);
    }

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println("Пассажир: " + name + ". Поехал на машине в " + to + " из " + from + ".");
        spendFuel(10);
    }
}
