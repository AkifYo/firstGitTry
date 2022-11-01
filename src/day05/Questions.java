package day05;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max=0;
        int sayac=0;
       while(sayac<=5) {
            System.out.println("lutfen bes sayi giriniz");
         int girilenSayi=scan.nextInt();

            if (girilenSayi>max){

                max= girilenSayi;
            }
            sayac++;
        }
        System.out.println(max);
    }
}
