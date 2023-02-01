package grupcalismasi.calisma03;

import java.util.Scanner;

public class InterviewSoru01 {
    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir cumle ve bir harf giriniz.");

        String cumle=input.nextLine().toLowerCase();
        char harf=input.next().toLowerCase().charAt(0);

        int sayac=0;

        for (int i=0;i<cumle.length();i++){
            if(cumle.charAt(i)==harf){
                sayac++;
            }

        }
        System.out.println(sayac);
    }
}
