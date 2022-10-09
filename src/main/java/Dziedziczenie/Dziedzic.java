package Dziedziczenie;

public class Dziedzic {
    public static void main(String[] args) {
        Osoba os= new Osoba("Doe", "Java", "Nowy York", 50);
        os.pisz();

        Pracownik pr=new Pracownik("Kowalska", "Hibernate", "wrocław", 30, "Dział Kadr", 4500);
        pr.pisz();

        pr.ukryjNazwiskoRodowe();
        pr.pisz();
    }
}
