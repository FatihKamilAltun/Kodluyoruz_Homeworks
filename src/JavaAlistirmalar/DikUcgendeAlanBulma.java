package JavaAlistirmalar;

import java.util.Scanner;

public class DikUcgendeAlanBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dik ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double ucgeninAlani = (kenar1 * kenar2) / 2;
        System.out.println("Girilen degerlere gore dik ucgenin alani : " + ucgeninAlani);


        //Girilen 2 kenar degerine gore hipotenusteki kenar uzunlugunu bulalim
        double kenar3 ;

        double temp1 = (kenar1 * kenar1) + (kenar2 * kenar2);
        kenar3=Math.sqrt(temp1);
        System.out.println(kenar3);
    }
}
