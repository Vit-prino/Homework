package pryndylas3;
import java.util.Scanner;
public class SuppermasiveBlackWhole {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Заповніть масив з 10 чисел");
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();
        }System.out.print("Ви ввели");
        for (int i=0;i < mas.length;i++){

            {
                System.out.print(mas[i] + " ");
            }}
        int n = mas.length;
        for (int i= 0;i <= n - 1; i++){
            for (int j = 0;j <n - 1; j++)
                if (mas[j] > mas[j + 1]) {
                   int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
        }
        for (int i = 0; i<n; i++){
            System.out.print(+mas[i]);
            }
        System.out.println();
        int num = 0;
        for (int i=0 ; i< mas.length; i++){
            if (mas[i]>0 ){
                num++;
            }
        }
        System.out.println("Кількість елементів більше 0  =  "+ num);


    }
}