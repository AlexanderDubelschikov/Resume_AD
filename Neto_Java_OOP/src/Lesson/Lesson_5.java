package Lesson;

public class Lesson_5 {

    public static void main(String[] args) {
        Memory<String> memory = new Memory<String>();
        memory.save("AxA");
        memory.save("ExE");
        String value = memory.getLast();

        String v1 = "Petya";
        String v2 = "Olya";
        System.out.println(choose(true,v1,v2));
        System.out.println(choose(false,v1,v2));
        String result = choose(true,v1,v2);

    }

    public static <T> T choose(boolean flag, T first, T second){
        if (flag)
            return first;
        else
            return second;

    }

}
