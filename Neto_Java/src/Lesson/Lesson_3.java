package Lesson;

//spvm, sout,

public class Lesson_3 {

    public static void main(String[] args) throws Exception{

        // byte - -128 до 127
        // short - -32768 до 32767
        // int - -2^31 до 2^31-1 (2 лярда)
        // long - -2^63 до 2^63-1

        byte b = 3;
        short s = 15;
        int x = 5;
        long q = 5_000_000_000L;

        int i = 10;
        long i2 = i;

        long r = 10_000_000_000L;
        int r2 = (int) r;
        System.out.println(r2);

        int sp = 1;
        while (true){
            System.out.println(sp);
            sp *=10;
            Thread.sleep(300);
        }

        //При сложении (других операциях) целых чисел с разными типами, итог будет самым "жирным" типом.




    }

}
