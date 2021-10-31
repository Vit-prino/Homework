package pryndylas5;

public class Book {
   private String namebook; // Поля класу
    private String autor; // Поля класу
    private int year; // Поля класу

    public Book(String namebook, String autor, int year){
   this.namebook = namebook;
   this.autor = autor;
   this.year = year;

    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void  takeBook(String fio, int n) {
        System.out.println(fio+"взяв книги " + n);
    }
    public void  takeBook(String autor, String namebook) {
        System.out.println(autor+"взяв книги " + namebook);
    }

    public void  takeBook(String autor, String namebook , String year) {
        System.out.println(autor+"взяв книги " + namebook +","+ year);
    }
    public void  returnBook(String fio, int n) {
        System.out.println(fio+"вернув книги " + n);
    }
    public void  returnBook(String autor, String namebook) {
        System.out.println(autor+"вернув книги " + namebook);
    }
    String getInfo() {
        return  namebook + "(автор: " + autor +",рік:" + year +")";
    }
}
