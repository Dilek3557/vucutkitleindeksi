import java.util.Scanner;

public class test {

    public static void main(String[] args) {
       double armut=2.14;
        double elma =3.67 ;
        double domates=1.11;
        double  muz=0.95;
        double patlican=5.00;
        double toplam=0;
         double kg;
        Scanner input =new Scanner(System.in);
        System.out.println("kaç kg armut");
        kg=input.nextDouble();
        toplam+=kg*armut;

        System.out.println("kaç kg elma");
        kg=input.nextDouble();
        toplam+=kg*elma;

        System.out.println("kaç kg domates");
        kg=input.nextDouble();
        toplam+=kg*domates;

        System.out.println("kaç kg muz");
        kg=input.nextDouble();
        toplam+=kg*muz;

        System.out.println("kaç kg patlican");
        kg=input.nextDouble();
        toplam+=kg*patlican;

        System.out.println(toplam);

    }

}
