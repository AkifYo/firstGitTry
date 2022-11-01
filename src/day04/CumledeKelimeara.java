package day04;

import java.util.Scanner;

public class CumledeKelimeara {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle girin");
        String cumle= scan.nextLine();

        System.out.println("Cumlede aratmak istedginiz kelimeyi giriniz");
        String kelime= scan.nextLine();

        int sayac=0;

        for (int i = 0; i < cumle.length()-kelime.length(); i++) {
            if (cumle.substring(i,i+kelime.length()).equalsIgnoreCase(kelime)){
                sayac++;

            } }
            if (sayac>1){
                System.out.println("cumle icerisinde "+sayac+"tane"+kelime+"var");
            }else if(sayac==1) {
                System.out.println("cumlede 1 adet "+kelime+"var");
            }else{
                System.out.println("Aradiginiz kelime yok");
            }


} }
