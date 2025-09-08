package Lesson;

public class Singer {

    public String name; //Это поля.
    public int age;
    public int rating;

    public void sing(String verse){

        System.out.println("Я " + name + ", пою тебе: " + verse);
    }

    public boolean isToYoung(){
        return (age<20) ? true:false;
    }

    public String toString(){
        return "[" + rating + "] " + name + " (" + age + ")";
    }
}
