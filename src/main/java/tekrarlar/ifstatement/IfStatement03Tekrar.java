package tekrarlar.ifstatement;

import java.util.Scanner;

public class IfStatement03Tekrar {
    public static void main(String[] args) {
        //Example 3 ;Verilen bir sayinin pozitif,negatif veya notr oldugunu kontrol eden kodu yaziniz.
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
         int num= input.nextInt();

         if (num>0){
             System.out.println("Pozitif...");
         }else if(num<0) {
             System.out.println("Negatif");
        }else {
             System.out.println("notr...");
         }

    }
}
