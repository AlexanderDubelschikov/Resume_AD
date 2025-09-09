package HW;

public class Book {

    private String title;
    private int releaseYear;
    private Author author;
    private int pages;

    public Book(String title, int releaseYear, Author author, int pages){
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig(){
        return (this.pages>500);
    }

    public int estimatePrice(){
        return ((int) Math.floor(this.pages*3*Math.sqrt(author.rating))>250) ? ((int) Math.floor(this.pages*3*Math.sqrt(author.rating))) : 250;

    }

    public boolean matches(String word){
        return (title.contains(word) || author.name.contains(word) || author.surname.contains(word));
    }
}
