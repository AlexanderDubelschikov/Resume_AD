package Lesson;

public class Singer {

    private static int maxRating = 0;
    private String name; //Это поля.
    private int age;
    private int rating;

    public Singer(String name , int age, int rating){
        this.name = name;
        this.age = age;
        this.rating = rating;
        maxRating = Math.max(maxRating, this.rating);
    }

    public Singer(){
        this("Ann", 23, 10);
        //this.name = "Ann";
        //this.age = 23;
        //this.rating = 10;
    }

    public void sing(String verse){

        System.out.println("Я " + name + ", пою тебе: " + verse);
    }

    public boolean isToYoung(){
        return (age<20) ? true:false;
    }

    public String toString(){
        return "[" + rating + "] " + name + " (" + age + ") " + "<" + maxRating + ">";
    }
}
