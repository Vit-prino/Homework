package pryndylas2;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введіть перше число для дії: ");
        num1 = reader.nextDouble();
        System.out.print("Введіть перше друге для дії: ");
        num2 = reader.nextDouble();
        System.out.print("\nОберіть дію яку потрібно зробити (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Помилка ,не вірне значення)");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
