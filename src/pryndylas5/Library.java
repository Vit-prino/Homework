package pryndylas5;

public class Library {
    public static void main(String[] args){
        Book book1 = new Book("gagarin","Иванов И. И",2000);
        Book book2 = new Book("Kapitan","Сидоров А. В",1980);
        Book book3 = new Book("kokon","Гусев К. В",2010);
        Readers readers = new Readers("Петров В.В.",1 ,"096558452");

        book1.setNamebook("Приключения");
        book2.setNamebook("Словарь");
        book3.setNamebook("Энциклопедия");


        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
        System.out.println(readers.getInfo());

    }

}
