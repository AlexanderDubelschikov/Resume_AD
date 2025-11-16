package Lesson;

public abstract class Transport implements Transfer, Billable {

    private int fuel;
    public Transport(int fuel){
        this.fuel = fuel;
    }

    public void spendFuel(int spend){
        fuel -= spend;
    }

    @Override
    public void pay(int sum) {
        System.out.println("Уплачено: " + sum);
    }
}
