package Listy;

public class Main {
    public static void main(String[] args) {
        Lista lista1 = new Lista(), lista2=new Lista();
        int tab []={-4,12,6,5,-8,11,15,21,-5};
        lista1.wypisz("L1:");
        lista1.wypisz("L2");
        for (int i=0; i<tab.length; i++)
            lista1.wstawNaKoniec(tab[i]);
        for (int i=0; i<tab.length; i++)
            lista2.wstawSort(tab[i]);
        lista1.wypisz("L1 bez sortowania:");
        lista2.wypisz("L2 z sortowaniem:");
    }
}
