package JavaAlistirmalar;

import java.util.Scanner;

public class KareninAlani {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenarini giriniz");
        int kareninKenari=scan.nextInt();

        int kareninAlani=kareninKenari*kareninKenari;

        System.out.println("Karenin alani : " + kareninAlani);
    }
}
