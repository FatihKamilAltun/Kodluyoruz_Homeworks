package JavaAlistirmalar;

import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
        double boy=scan.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo=scan.nextDouble();

        double vucutKitleEndeksi=kilo/(boy*boy);
        System.out.println("vucutKitleEndeksi = " + vucutKitleEndeksi);
    }
}
