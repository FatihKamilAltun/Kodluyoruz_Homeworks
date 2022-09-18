package JavaAlistirmalar;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen ilk sayiyi giriniz : ");
        double sayi1=scan.nextDouble();
        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        double sayi2=scan.nextDouble();
        System.out.println("Lutfen yapmak istediginiz islem icin secim yapiniz");
        System.out.println("1-Toplama\n2-Cikarma\n3-Bolme\n4-Carpma");
        int select=scan.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuc : " + sayi1+sayi2);
                break;
            case 2:
                System.out.println("Sonuc : " + (sayi1-sayi2));
                break;
            case 3:
                switch ((int) sayi2){
                    case 0:
                        System.out.println("Bir sayi sifira bolunemez");
                    break;
                    default:
                        System.out.println("Sonuc : " + sayi1/sayi2);
                }
                break;
            case 4:
                System.out.println("Sonuc : " + (sayi1*sayi2));
                break;
            default:
                System.out.println("Lutfen dogru secim yapiniz");
        }
    }
}
