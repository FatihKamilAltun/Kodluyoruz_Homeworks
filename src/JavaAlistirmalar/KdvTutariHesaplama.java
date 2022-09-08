package JavaAlistirmalar;

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen urun tutarini giriniz");
        int price=scan.nextInt();

        double KDV;

        if (price>=1000){
            KDV=0.08;
        } else KDV=0.18;

        double kdvliTutar=price+(price*KDV);
        System.out.println("KDV'siz tutar : " + price +
                "\nKDV'li tutar : " + kdvliTutar+
                "\nKDV miktari : " + (kdvliTutar-price));
    }
}
