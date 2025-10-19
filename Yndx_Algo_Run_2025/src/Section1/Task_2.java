package Section1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextInt();
        float b = scanner.nextInt();
        float c = scanner.nextInt();

        float v1 = scanner.nextInt();
        float v2 = scanner.nextInt();
        float v3 = scanner.nextInt();

        float var1 = a/v1 + c/v2 + b/v3;
        float var2 = b/v1 + c/v2 + a/v3;
        float var3 = a/v1 + a/v2 + b/v1 + b/v2;
        float var4 = a/v1 + c/v2 + c/v3 + a/v3;
        float var5 = b/v1 + c/v2 + c/v3 + b/v3;
        float var6 = a/v1 + c/v1 + c/v2 + a/v3;
        float var7 = b/v1 + c/v1 + c/v2 + b/v3;
        float var8 = a/v1 + c/v1 + c/v2 + a/v2 + a/v1 + a/v2;
        float var9 = b/v1 + c/v1 + c/v2 + b/v2 + b/v1 + b/v2;

        float min =  Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(var1,var2), var3), var4), var5), var6), var7), var8), var9);

        System.out.println(min);
    }
}
