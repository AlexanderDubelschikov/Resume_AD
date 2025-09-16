package Lesson;

import java.lang.reflect.Array;
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

        int[] arr2 = {10,105,0,100,0};
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr,arr2));

        String[] arr3 = new String[5];
        arr3[0] = "Hello";
        arr3[4] = "World";
        System.out.println(Arrays.toString(arr3));

        Singer[] arr4 = { new Singer(),
            new Singer()
        };
        System.out.println(Arrays.toString(arr4));


    }
}
