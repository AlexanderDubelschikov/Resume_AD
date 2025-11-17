package Lesson;

public class Lesson_4_part_2 {

    public static void main(String[] args) throws Exception {
        System.out.println(sameLenght("Petrov"));

    }

    public static boolean sameLenght(String text) throws Exception{
        String[] parts = text.split(" ");

        if (parts.length !=2){
            /*RuntimeException error = new RuntimeException();
            throw error;*/

            throw new NameInputMismatchException(text);

        }

        if (parts[0].length() == parts[1].length()){
            return true;
        } else {
            return false;
        }
    }

}
