package Przeszukiwanie;

public class SzukajTxt {
    public static int szukaj (char t[], char w []){
        int i=0, j=0;
        int M=w.length, N=t.length;
        while ((j<M) && (i<N)){
            if (t[i]!=w[j]){
                i-=j-1;
                j=-1;
            }
            i++;
            j++;
        }
        if(j==M)
            return  i-M;
        else
            return -1;
    }

    public static void main(String[] args) {
        char t[]={'a','b','r','a','k','a','d','a','b','r','a'};

        String tS=new String(t);
        char w1 []={'r','a','k','i'};
        char w2 []={'r','a','k'};

        String w1S=new String(w1);
        String w2S=new String(w2);
        System.out.printf("Szukam[%s] w [%s], wynik (pozycja): %d\n",w1S,tS,szukaj(t,w1));
        System.out.printf("Szukam[%s] w [%s], wynik (pozycja): %d\n",w2S,tS,szukaj(t,w2));

    }
}
