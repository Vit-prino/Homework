package pryndylas10;

public class Main {
    public static void main(String[] args) {
        NumBox<Number> box = new NumBox<>(5);
        box.add(0, 63);
        box.add(1, 29);
        box.add(2, 68);
        box.add(3, 69);
        box.add(4, 8);
        box.add(5, 81);


        int index = (int) (Math.random() * box.length());
        System.out.println("Значення " + (index + 1) + " Дорівнює " + box.get(index));
        System.out.println("Розмір " + box.length());
        System.out.println("Середнє арифметичне " + box.average());
        System.out.println("Сумма: " + box.sum());
        System.out.println("Максімум " + box.max());
    }
}
