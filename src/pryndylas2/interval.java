package pryndylas2;
import java.util.Scanner;

public class interval {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);

        System.out.println("Введіть число : ");
        int n = read.nextInt();
        if (n >= 0 && n <= 14) {
            System.out.println("Число в діапазоні від 0 до 14");
        } else if (n >= 15 && n < 35) {
            System.out.println("Число в діапазоні від 15 до 35");
        } else if (n >= 36 && n < 50) {
            System.out.println("Число в діапазоні від 36 до 50");
        } else if (n >= 51 && n < 100) {
            System.out.println("Число в діапазоні від 51 до 100");
        } else {
            System.out.println("Число поза діапазонами");
        }

    }
}
