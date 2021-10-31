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


    String getInfo() {
        return "Назва :" + namebook + "(автор: " + autor +",рік:" + year +")";
    }
}
