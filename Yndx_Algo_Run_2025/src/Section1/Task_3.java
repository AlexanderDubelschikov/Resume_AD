package Section1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> charCount = new HashMap<>();

        String text = scanner.nextLine();

        for (char c : text.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }




    }
}
