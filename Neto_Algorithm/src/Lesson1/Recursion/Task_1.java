package Lesson1.Recursion;

public class Task_1 {

    public static void main(String[] args) {System.out.println(recMult(10,10));}

    public static int recMult(int a, int b){
        if (b == 1){return a;}
        else{return  a+recMult(a, b-1);}
    }
}
