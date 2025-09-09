package Lesson1.java;

/*Телефонные номера в адресной книге мобильного телефона имеют один из следующих форматов: +7<код><номер>, 8<код><номер>,
<номер>, где <номер> — это семь цифр, а <код> — это три цифры или три цифры в круглых скобках. Если код не указан,
то считается, что он равен 495. Кроме того, в записи телефонного номера может стоять знак “-” между любыми двумя
цифрами (см. пример). На данный момент в адресной книге телефона Васи записано всего три телефонных номера,
и он хочет записать туда еще один. Но он не может понять, не записан ли уже такой номер в телефонной книге.
Помогите ему! Два телефонных номера совпадают, если у них равны коды и равны номера. Например,
+7(916)0123456 и 89160123456 — это один и тот же номер.*/

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String startNum = standartNumber(scanner.next());

        for(int i =0; i<3; i++){
            String number = scanner.next();
            number =  standartNumber(number);
            System.out.println(isEqualNum(number,startNum));

        }

    }

    public static String standartNumber(String number){
        number = number.replaceAll("[-+()]","");

        switch (number.length()){
            case 11:
                number = number.substring(1);
            case 10:
                break;
            case 8:
                number = "495" + number.substring(1);
            case 7:
                number = "495" + number;
        }

        return number;
    }

    public static String isEqualNum(String number, String startNum){
        return (number.equals(startNum)) ? "YES" : "NO";
    }
}
