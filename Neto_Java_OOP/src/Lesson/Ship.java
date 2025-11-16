package Lesson;

public class Ship extends Transport {

    public Ship(){
        super(500);
    }

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println("Пассажир: " + name + ". Поплыл на лодке в " + to + " из " + from + ".");
        spendFuel(80);
    }
}
