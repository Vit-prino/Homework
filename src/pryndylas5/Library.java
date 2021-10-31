package pryndylas5;

public class Library {
    public static void main(String[] args){
        Book book1 = new Book("Приключения","Иванов И. И",2000);
        Book book2 = new Book("Словарь","Сидоров А. В",1980);
        Book book3 = new Book("Энциклопедия","Гусев К. В",2010);
        Readers readers = new Readers("Петров В.В.",1 ,"096558452");

       System.out.println(book1.getInfo() + book2.getInfo() + book3.getInfo() );
       System.out.println(readers.getInfo());
       // System.out.println(readers.getFio() + "Взяв книги:" + book1.getNamebook() + ","+ book2.getNamebook() +","+ book3.getNamebook());
       // System.out.println(readers.getFio() + "Взяв книги:" + book1.getInfo() +  book2.getInfo() + book3.getInfo());
        book1.takeBook(readers.getFio(),3);
        book1.takeBook(readers.getFio(),book1.getNamebook()+","+ book2.getNamebook()+","+ book3.getNamebook());
        book1.takeBook(readers.getFio(),book1.getInfo() +  book2.getInfo() + book3.getInfo());
        book1.returnBook(readers.getFio(),3);
        book1.returnBook(readers.getFio(),book1.getNamebook()+","+ book2.getNamebook()+","+ book3.getNamebook());
        book1.returnBook(readers.getFio(),book1.getInfo() +  book2.getInfo() + book3.getInfo());

    }


}
