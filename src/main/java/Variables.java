public class Variables {

    public static final int licznik=1;

    public static void main(String[] args) {
        final  double mojePI=3.14;
        int a=2;
        int b=5;
        int n=a+b++;
        char c1='X';
        char c2='\n';

        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.print("c1+c2="+c1+c2);
        System.out.println(n);
        System.out.println(b);
        System.out.println(a+ ++b);
        System.out.println(b/a);
        System.out.println(b%a);
        System.out.println(mojePI);
    }
}
