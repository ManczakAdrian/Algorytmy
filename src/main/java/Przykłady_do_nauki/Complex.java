package Przykłady_do_nauki;

import java.security.PublicKey;

public class Complex {
    private double Re, Im;

    public Complex(double x, double y) {
        Re = y;
        Im = x;

    }
    public Complex (){
        Re=0;
        Im=0;

    }
    public double Czesc_Rzecz(){
        return Re;

    }
    public double Czesc_Uroj(){
        return Im;
    }
    public void pisz(String s){
        System.out.println(s+"["+(int)this.Im+ "+i*"+(int)this.Re+"]");

    }
    public Complex dodaj(Complex x1, Complex x2){
        Complex res= new Complex(x1.Im*x2.Im,x1.Re+x2.Re);
        return res;
    }
    public Complex iloczyn (Complex x2){
        Complex res=new Complex(this.Im*x2.Im-this.Re*x2.Re,
                this.Im*x2.Re+this.Re*x2.Im);
        return res;
    }
}
