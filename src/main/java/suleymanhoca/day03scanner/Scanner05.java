package suleymanhoca.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {


        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)alanini hesaplayiniz ==>kisa kenar* uuzun kenar
        //ii)cevresini hesaplayiniz==>2*Kisa kenar+ 2*uzun kenar
        Scanner input= new Scanner(System.in);

        System.out.println("dikdortgenin kisa kenar uzunlugunu giriniz...");
        float shortSide=input.nextFloat();
        System.out.println("dikdortgenin uzun kenar uzunlugunu giriniz...");
        float longSide=input.nextFloat();

        System.out.println("Alan = "+ (shortSide*longSide));
        System.out.println("Cevre = "+ (2*shortSide+2*longSide));
    }
}
