package HW;

public class HW_5 {
    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < TEXT.length()-2; i++) {
            boolean flag = true;
            for (int j = 0; j<PATTERN.length(); j++)
            {
                if (TEXT.charAt(i+j)!=PATTERN.charAt(j)) {flag = false;}
            }
            if (flag){count +=1;}
        }
        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}