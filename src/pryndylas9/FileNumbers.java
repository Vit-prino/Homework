package pryndylas9;
import java.io.File;
import java.io.IOException;
public class FileNumbers {
    public static void main(String[] args) {
        try {
            File myObj = new File("numbers.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
