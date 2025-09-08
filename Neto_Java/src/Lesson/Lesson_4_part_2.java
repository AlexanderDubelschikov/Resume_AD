package Lesson;

public class Lesson_4_part_2 {

    /*public static final int MON = 1;
    public static final int TUE = 2;
    public static final int WED = 3;
    public static final int THU = 4;
    public static final int FRI = 5;
    public static final int SAT = 6;
    public static final int SUN = 7;*/


    public static void main(String[] args) {

        Lesson_4_Day day = Lesson_4_Day.SAT ;
        System.out.println(isDayOff(day));

    }

    public static boolean isDayOff(Lesson_4_Day day){

        if (day == Lesson_4_Day.SAT || day == Lesson_4_Day.SUN){
            return true;
        } else {
            return false;
        }


    }
}
