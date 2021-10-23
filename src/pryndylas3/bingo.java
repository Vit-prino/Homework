package pryndylas3;
import java.util.Scanner;
public class bingo {
    public static void main(String[] args){

        int a = (int) ( Math.random() * 100 );
        System.out.println(a);

        {



                Scanner read = new Scanner(System.in);
                System.out.println("Введіть ваше число : ");
                int n = read.nextInt();
                if (n < a) {
                    System.out.println("введіть більше значення");

                } else if (n > a) {
                    System.out.println("введіть менше значення");

                } else if (n == a)
                {
                    System.out.println("бінго");
                }
            else if (n == 000) {
                    System.out.println("гарного дня)");

                }

        }


    }
}
