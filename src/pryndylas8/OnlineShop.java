package pryndylas8;

import java.util.Scanner;
public class OnlineShop {
    public static void main(String[] args) throws Auth.WrongLoginException, Auth.WrongPasswordException {
        Auth authUp = new Auth();
        Scanner init = new Scanner(System.in);
        int r;

        System.out.println("Вітаю на нашому магазині. Для початку Закупів з раббaтой в 50% вам необхідно зареєструватися.");
        do {
            r = 0;
            try {
                System.out.print("Введіть ваш Логін >>");
                String rLogin = init.nextLine();
                System.out.print("Введіть ваш Пароль >>");
                String rPass = init.nextLine();
                System.out.print("Повторіть пароль >>");
                String rPass2 = init.nextLine();
                authUp.signUp(rLogin, rPass, rPass2);
            } catch (Auth.WrongLoginException | Auth.WrongPasswordException e) {
                System.out.println(e);
                r = 1;
            }
        } while (r == 1);

        System.out.println("*************************");
        System.out.println("* Вход пользователя *");
        System.out.println("*************************");
        do {
            r = 0;
            try {
                System.out.println("Введіть ваш Логін >>");
                String authLogin = init.nextLine();
                System.out.println("Введіть ваш Пароль >>");
                String authPass = init.nextLine();

                authUp.signIn(authLogin, authPass);
            } catch (Auth.WrongLoginException | Auth.WrongPasswordException e) {
                System.out.println(e);
                System.out.println();
                r = 1;
            }
        } while (r == 1);





    }
}
