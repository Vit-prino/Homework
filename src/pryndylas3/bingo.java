package pryndylas3;
import java.util.Scanner;
public class bingo {
    public static void main(String[] args){

        int a = (int) ( Math.random() * 100 );
       // System.out.println(a);
        int n;
        int k=0;
        do {



        {



                Scanner read = new Scanner(System.in);
                System.out.println("Вгадайте число : ");
                n = read.nextInt();
                k++;
                if (n == 000) {
            System.out.println("гарного дня)");


        }
                else if (n < a) {
                    System.out.println("введіть більше значення");

                } else if (n > a) {
                    System.out.println("введіть менше значення");

                } else if (n == a)
                {
                    System.out.println("Бінго, ви використали спроб : " + k);
                }

             }


        }while(a!=n);


    }
}
