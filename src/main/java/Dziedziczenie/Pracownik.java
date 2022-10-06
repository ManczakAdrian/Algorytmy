package Dziedziczenie;

class Pracownik extends Osoba{
    private String wydział;
    private int placa;

    public Pracownik(String nazwiskorodowe, String nazwisko, String adres, int wiek, String wydział, int placa) {
        super(nazwiskorodowe, nazwisko, adres, wiek);
        this.wydział = wydział;
        this.placa = placa;
    }
    public void pisz(){
        System.out.println("[Klasa Pracowni]-> metoda pisz()-najpierw wywołamy pisz () klasy nadrzędnej:");
        super.pisz();
        System.out.println("\t Wydział:"+  wydział +",płaca:" + placa);
    }
}
