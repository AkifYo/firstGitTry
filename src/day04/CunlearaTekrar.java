package day04;

import java.util.Scanner;

public class CunlearaTekrar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        System.out.println("Cumlede aratmak istediginiz kelimeyi giriniz");
        String kelime=scan.nextLine();
        int sayac=0;

        for (int i = 0; i <= cumle.length()-kelime.length(); i++) {

            if (cumle.substring(i,i+kelime.length()).equalsIgnoreCase(kelime)){
                sayac++;
            }

        }
        System.out.println(sayac);
        if (sayac>1){
            System.out.println("Cumle icinde "+sayac+" adet "+kelime+" var");
        } else if (sayac==1) {
            System.out.println("Cumle icinde bir adet "+kelime+" var");

        }else {
            System.out.println("Cumle icinde bu kelime yok");
        }


    }

}
