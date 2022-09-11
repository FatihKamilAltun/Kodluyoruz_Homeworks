package JavaAlistirmalar;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen Matematik notunuzu giriniz : ");
        int matematikNotu=scan.nextInt();
        System.out.print("Lutfen Fizik notunuzu giriniz : ");
        int fizikNotu=scan.nextInt();
        System.out.print("Lutfen Turkce notunuzu giriniz : ");
        int turkceNotu=scan.nextInt();
        System.out.print("Lutfen Kimya notunuzu giriniz : ");
        int kimyaNotu=scan.nextInt();
        System.out.print("Lutfen Muzik notunuzu giriniz : ");
        int muzikNotu=scan.nextInt();

        double notlarToplami=0;

        if (matematikNotu<=100 && matematikNotu>=0){
            notlarToplami+=matematikNotu;
        }

        if (fizikNotu<=100 && fizikNotu>=0){
            notlarToplami+=fizikNotu;
        }
        if (turkceNotu<=100 && turkceNotu>=0){
            notlarToplami+=turkceNotu;
        }
        if (kimyaNotu<=100 && kimyaNotu>=0){
            notlarToplami+=kimyaNotu;
        }
        if (muzikNotu<=100 && muzikNotu>=0){
            notlarToplami+=muzikNotu;
        }

        double notOrtalamasi = notlarToplami/5;



        if (notOrtalamasi>=55){
            System.out.println("Ogrencinin not ortalamasi : " + notOrtalamasi + " ve ogrenci sinifi gecti");
        } else System.out.println("Ogrencinin not ortalamasi : " + notOrtalamasi + " ve ogrenci sinifta kaldi");

    }
}
