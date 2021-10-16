package pryndylas2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введіть перше число : ");
        int  operand1 = read.nextInt();
        System.out.println("Введіть друге число : ");
        int  operand2 = read.nextInt();
        System.out.println("Оберіть дію (+,-,/,*) :");
        char  sign  = read.next().charAt(0);
        int result ;
        switch (sign) {
            case '+':
                result = operand1 + operand2;
                System.out.println("Результат операції: "+result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println("Результат операції: "+result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println("Результат операції: "+result);
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("За таке в школі по жопі б'ють");
                    break;
                }else {
                    result = operand1 / operand2;
                    System.out.println("Результат операції: "+result);
                    break;}
            default:
                System.out.println("Операция не разпізнана.");
        }

    }

}