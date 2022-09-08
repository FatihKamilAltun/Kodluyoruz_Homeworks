package JavaAlistirmalar;

import java.util.Scanner;

public class NotOrtalamasiHesaplamaAlistirmasi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        int matematikNot=scan.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        int fizikNot=scan.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        int kimyaNot=scan.nextInt();
        System.out.print("Turkce notunuzu giriniz : ");
        int turkceNot=scan.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        int tarihNot=scan.nextInt();
        System.out.print("Muzik notunuzu giriniz : ");
        int muzikNot=scan.nextInt();

        double notlarinOrtalamasi = (matematikNot+fizikNot+kimyaNot+turkceNot+tarihNot+muzikNot)/6;
        System.out.println("Ogrencinin not ortalamasi " + notlarinOrtalamasi+"'dir");
        System.out.println(notlarinOrtalamasi>60?"Sinifi Gecti":"Sinifta Kaldi");
    }
}
