package pryndylas2;
import java.util.Scanner;
import java.io.*;
public class interval {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введіть число для зясування в якому воно діапазоні: ");
        int num1 = Integer.parseInt(read.readLine());
        if(num1%2 <= 0 && num1 <= 14 ){
            System.out.println("в діапазоні від 0 до 15");
        }else if(num1%2 >= 0 && num1 <= 15){
            System.out.println("в діапазоні від 0 до 15");
        }else if(num1%2 <= 16 && num1 <= 35){
            System.out.println("в діапазоні від 16 до 35");
        }else if(num1%2 <= 36 && num1 <= 50){
            System.out.println("в діапазоні від 36 до 50");
        }else if(num1%2 <= 51 && num1 <= 100){
            System.out.println("в діапазоні від 51 до 100");
        }else if(num1 > 100 || num1 < 1){
            System.out.println("число виходить за задані діапазони");


        }
    }
}
