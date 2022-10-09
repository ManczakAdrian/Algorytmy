package Listy;

import javax.swing.plaf.PanelUI;

public class Lista {
    private Element glowa;
    private Element ogon;

    public boolean czyPusta(){
        return (glowa==null);

    }
    public Element wstawNaKoniec (int x){
        Element nowy=new Element(x);
        if (this.czyPusta()){
            glowa=nowy;
            ogon=nowy;
        }else{
            ogon.ustawNastepny(nowy);
            nowy.ustawNastepny(null);
            ogon=nowy;
        }
        return nowy;
    }
    public  Element wstawSort (int x) {
        Element nowy = new Element(x);
        if (glowa == null) {
            glowa = nowy;
            ogon = nowy;
            nowy.ustawNastepny(null);
            return nowy;
        }
        Element przed = null, po = glowa;
        Status stan = Status.SZUKAJ;
        while ((stan == Status.SZUKAJ) && (po != null))
            if (po.zwrocWartosc() >= x)
                stan = Status.ZAKONCZ;
            else {
                przed = po;
                po = po.pobierzNastepny();
            }
        if (przed == null) {
            glowa = nowy;
            nowy.ustawNastepny(po);
        } else if (po == null) {
            ogon.ustawNastepny(nowy);
            nowy.ustawNastepny(null);
            ogon = nowy;
        } else {
            przed.ustawNastepny(nowy);
            nowy.ustawNastepny(po);
        }
        return nowy;
    }
    public boolean szukaj (int x){
        Element tmp=glowa;
        boolean res=false;
        while (tmp!=null){
            if (tmp.zwrocWartosc()==x){
                res=true;
                break;
            }
            else tmp=tmp.pobierzNastepny();
        }
        return res;
    }
    public void wypisz (String s){
        if (glowa!=null)
            glowa.wypiszKolejne(s);
        else
            System.out.printf("Lista %s jest pusta\n", s);

    }
}
