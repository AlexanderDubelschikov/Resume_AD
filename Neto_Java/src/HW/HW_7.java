package HW;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class HW_7 {

    public static void main(String[] args) {

        String[] product = {"Молоко", "Хлеб", "Гречка"};
        int[] price = {50,14,80};

        productShow(product,price);
        int[] result = fillBasket(product, price);
        infoOutput(product, result, price);
    }

    public static void infoOutput(String[] product, int[] result, int[] price){

        System.out.println("Ваша Корзина: ");
        for (int i = 0; i<result.length; i++){
            if (result[i] != 0){
                System.out.println(product[i] + " " + result[i] + "шт. Стоимость: " + (result[i]*price[i]) + ".");
            }
        }

        System.out.println("Итоговая сумма: " + (result[0]*price[0] + result[1]*price[1] + result[2]*price[2]));

    }

    public static void productShow(String[] product, int[] price){
        for (int i = 0; i< product.length; i++){
            System.out.println("Товар: " + (i+1) + ". "  + product[i] + ". Цена: " + price[i] + " руб.");
        }
    }

    public static int[] fillBasket(String[] product, int[] price){
        int[] result = new int[3];

        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Укажи номер товара и кол-во, сколько хочешь купить.");
            String str = scanner.next();

            if (str.equals("end".toLowerCase())){
                break;
            }

            int numProduct = Integer.parseInt(str);
            int colProduct = scanner.nextInt();

            result[numProduct-1] = result[numProduct-1] + colProduct;
        }



        return result;

    }
}
