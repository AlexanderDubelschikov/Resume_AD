package Lesson;

import java.sql.Array;
import java.util.Arrays;

public class Lesson_6 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[3] = 100;
        arr[1] = 105;
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {10, 105, 0, 100, 0};
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr, arr2));

        String[] arr3 = new String[5];
        arr3[0] = "Hello";
        arr3[4] = "World";
        System.out.println(Arrays.toString(arr3));

        Singer[] arr4 = {new Singer(),
                new Singer()
        };
        System.out.println(Arrays.toString(arr4));

        System.out.println("================");

        String[] names = {
                "Petya",
                "Olya",
                "Pavel",
                "Ann",
                "Alex"
        };

        /*if (!names[0].startsWith("P")){
            System.out.println(names[0]);
        }
        if (!names[1].startsWith("P")){
            System.out.println(names[1]);
        }*/

        /*for (int i = 0; i < names.length; i++) {
            if (!names[i].startsWith("P")) {
                System.out.println(names[i]);
            }

        }*/

        /*for (String name : names){
            if (!name.startsWith("P")) {
                System.out.println(name);
            }
        }*/

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] names2 = names.clone();

    }
}
