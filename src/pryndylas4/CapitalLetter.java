package pryndylas4;
import java.util.Objects;
import java.util.Scanner;
public class CapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Введіть рядок : ");
        String thisArray;
        thisArray = in.nextLine();
        if (Objects.equals(thisArray, "")) {
            System.out.println("Здається у вас відключена клавіатура!)");
        } else
            thisArray = thisArray.substring(0, 1).toUpperCase() + thisArray.substring(1).toLowerCase();

        upperCase(thisArray);
    }
    public static void upperCase(String thisArr) {
        int tx = thisArr.length();
        char[] rx = new char[tx];
        int[] vk = new int[tx];
        thisArr.getChars(0, tx, rx, 0);
        for (int j = 1; j < tx; j++) {
            vk[j] = rx[j];
            if (vk[j - 1] == ' ' && rx[j] > 96) {
                vk[j] = vk[j] - 32;
            }
            rx[j] = (char) vk[j];
        }
        for (int k = 0; k < tx; k++) {
            System.out.print(rx[k]);
        }
    }
}
