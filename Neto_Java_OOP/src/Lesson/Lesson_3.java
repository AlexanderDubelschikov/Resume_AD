package Lesson;

public class Lesson_3 {

    public static void main(String[] args) {

        Car car = new Car();
        car.transfer("Petya", "Moscow", "Belobog");

        Ship ship = new Ship();
        ship.transfer("Alexander", "St.Peter", "Novgorod");

        Velo velo = new Velo();
        velo.transfer("Alexander", "St.Peter", "Novgorod");

        Plane plane = new Plane();

        spbToMsc("Vasya", car);
        spbToMsc("Vasya", ship);
        spbToMsc("Peter", plane);
        spbToMsc("Olya", velo);

    }

    public static void spbToMsc(String name, Transfer transport){
        transport.transfer(name, "SPB", "MSC");
    }
}
