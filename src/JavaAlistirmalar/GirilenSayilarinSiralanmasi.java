package JavaAlistirmalar;

import java.util.Scanner;

public class GirilenSayilarinSiralanmasi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen siralama icin birinci sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen siralama icin ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("Lutfen siralama icin ucuncu sayiyi giriniz");
        int sayi3=scan.nextInt();

        if (sayi1>sayi2 && sayi1>sayi3){
            if (sayi2>sayi3){
                System.out.println("sayi1>sayi2>sayi3");
            } else {
                System.out.println("sayi1>sayi3>sayi2");
            }
        } else if (sayi2>sayi1 && sayi2>sayi3){
            if (sayi1>sayi3){
                System.out.println("sayi2>sayi1>sayi3");
            } else {
                System.out.println("sayi2>sayi3>sayi1");
            }
        } else if (sayi3>sayi1 && sayi3>sayi2){
            if (sayi1>sayi2){
                System.out.println("sayi3>sayi1>sayi2");
            }else {
                System.out.println("sayi3>sayi2>sayi1");
            };
        }

    }
}
