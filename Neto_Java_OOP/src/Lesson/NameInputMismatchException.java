package Lesson;

public class NameInputMismatchException extends RuntimeException{

    public NameInputMismatchException(String text){
        super("Нет Фамилии! " + text);
    }
}
