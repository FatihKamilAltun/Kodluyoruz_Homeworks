package JavaAlistirmalar;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac kilo armut aldiginizi giriniz");
        double armutKilo=scan.nextDouble();
        System.out.println("Lutfen kac kilo elma aldiginizi giriniz");
        double elmaKilo=scan.nextDouble();
        System.out.println("Lutfen kac kilo domates aldiginizi giriniz");
        double domatesKilo=scan.nextDouble();
        System.out.println("Lutfen kac kilo muz aldiginizi giriniz");
        double muzKilo=scan.nextDouble();
        System.out.println("Lutfen kac kilo patlican aldiginizi giriniz");
        double patlicanKilo=scan.nextDouble();

        double toplamAlisverisTutari=(armutKilo*armut)+
                                     (elmaKilo*elma)+
                                     (domatesKilo*domates)+
                                     (muzKilo*muz)+
                                     (patlicanKilo*patlican);

        System.out.println("toplamAlisverisTutari = " + toplamAlisverisTutari);

    }
}
