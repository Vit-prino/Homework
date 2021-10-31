package pryndylas5;

public class Readers {
    private String fio; // Поля класу
    private int numbertic; // Поля класу
    private String numberfone; // Поля класу

    public Readers(String fio, int numbertic, String numberfone) {
        this.fio = fio;
        this.numbertic = numbertic;
        this.numberfone = numberfone;
    }

    public Readers(String fio, float numbertic, String numberfone) {

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumbertic() {
        return numbertic;
    }

    public void setNumbertic(int numbertic) {
        this.numbertic = numbertic;
    }

    public String getNumberfone() {
        return numberfone;
    }

    public void setNumberfone(String numberfone) {
        this.numberfone = numberfone;
    }

    String getInfo() {
        return "Ім'я:" + fio + "Номер читацького:" + numbertic +"телефон:" + numberfone +".";
    }

}
