public class Singer extends Person {

    private int rating;

    public void setRating(int rating){
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }

    public void happyBirthday(){
        age++;
        super.happyBirthday();
        System.out.println("Еще один успешный год для певца! Уже " + age);
    }

    public void sing(String song){
        System.out.println("Я пою " + song);
    }
}
