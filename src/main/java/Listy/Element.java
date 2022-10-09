package Listy;

public class Element {
    private int wartosc;
    private Element nastepny;

    public Element(int wartosc) {
        this.wartosc = wartosc;
        this.nastepny = nastepny;

    }
    public int zwrocWartosc(){
        return wartosc;
    }
    public Element pobierzNastepny(){
        return nastepny;
    }
    public void ustawNastepny (Element kolejny){
        nastepny=kolejny;
    }
    public void wypiszKolejne (String s){
        Element tmp= this;
        System.out.printf("Kolejne elementy :%s", s);
        while (tmp!=null){
            System.out.printf("%d", tmp.wartosc);
            tmp=tmp.nastepny;

        }
        System.out.println();

    }
}
