package Lesson;

import com.sun.jdi.ThreadGroupReference;

public class Lesson_2_part_2 {

    public static void main(String[] args) throws Exception{

        int i = 10;

        while(i>0){
            System.out.println("Hello world " + i + " раз!");
            Thread.sleep(100);
            i--;
        }

    }
}
