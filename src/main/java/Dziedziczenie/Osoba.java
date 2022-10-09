package Dziedziczenie;

import java.net.PortUnreachableException;

public class Osoba {
    private String nazwiskorodowe;
    protected String nazwisko;
    protected String adres;
    public int wiek;

    public Osoba(String nazwiskorodowe, String nazwisko, String adres, int wiek) {
        this.nazwiskorodowe = nazwiskorodowe;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wiek = wiek;
    }
    public void pisz(){
        System.out.println("[Klasa Osoba]-> metoda pisz()");
        System.out.println("\t Nazwisko:"+ nazwisko +"nazwisko rodowe:"+ nazwiskorodowe+ ",wiek:"+wiek+",miasto:"+ adres);
    }
    public void ukryjNazwiskoRodowe(){
        System.out.println("[Klasa Osoba]-> Wymazuje nazwisko rodowe");
        nazwiskorodowe="****************";
    }
    public String getNazwiskorodowe(){
        return nazwiskorodowe;

    }
}
