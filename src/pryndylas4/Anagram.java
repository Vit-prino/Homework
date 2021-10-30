package pryndylas4;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Anagram {
    public static void main(String[] args) {
        String dan1 ;
        String dan2 ;
        dan1 = tokenizer(intText(1));
        dan2 = tokenizer(intText(2));
        if (dan1.compareTo(dan2) == 0) {
            System.out.println("Це Анаграмма");
        } else {
            System.out.println("це НЕ Анаграмма!");
        }
    }
    public static String intText(int n) {
        Scanner in = new Scanner(System.in);
        String inText;
        do {
            System.out.println(" Введіть рядок " + n + " :");
            inText = in.nextLine();///Зберегаєм в Чемодан.
            if (Objects.equals(inText, "")) {
                System.out.println("Нажаль не введено нічого( ");
            }
        } while (Objects.equals(inText, ""));
        return inText;
    }
    public static String tokenizer(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "");
        StringTokenizer tok = new StringTokenizer(s, "`~!@#$%^&*()-—/_+=\\.,><? ");
        String s1 = "";
        while (tok.hasMoreTokens()) {
            s1 = tok.nextToken();
        }
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        String sortString = new String(charArray);
        return sortString;
    }
}
