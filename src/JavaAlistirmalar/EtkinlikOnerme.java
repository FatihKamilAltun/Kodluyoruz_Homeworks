package JavaAlistirmalar;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen hava sicakligini giriniz");
        double havaSicakligi=scan.nextDouble();

        if (havaSicakligi<=5){
            System.out.println("Kayak yapmaya gidiniz");
        } else if (havaSicakligi>5 && havaSicakligi<=15){
            System.out.println("Sinemaya gidiniz");
        } else if (havaSicakligi>15 && havaSicakligi<=25){
            System.out.println("Piknige gidiniz");
        } else System.out.println("Yuzmeye gidiniz");
    }
}
