package JavaAlistirmalar;

import java.util.Scanner;

public class DaireninAlaniVeCevresiniBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dairenin yaricapini giriniz");
        double yariCap=scan.nextDouble();

        double pi=3.14;

        //Dairenin cevresini hesaplayalim
        double daireninCevresi=2*pi*yariCap;
        System.out.println("Dairenin cevresi : " + daireninCevresi);

        //Dairenin alanini hesaplayalim
        double daireninAlani=pi*yariCap*yariCap;
        System.out.println("Dairenin alani : " + daireninAlani);

        //Açısı a olan daire diliminin alaninin hesaplayalim
        System.out.println("a degerine esas olmak uzere bir aci giriniz");
        double aci=scan.nextDouble();
        double sonuc=(pi*(yariCap*yariCap)*aci)/360;
        System.out.println("Girilen aciya ait alan : " + sonuc);
    }
}
