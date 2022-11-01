package day02;

import java.util.Scanner;

public class Q2_Ifelse {
    public static void main(String[] args) {
        /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Vize Final ve Devam puaninizi sirayla giriniz:");
        int vize= scan.nextInt();
        int finalPuani =scan.nextInt();
        int devamPuani= scan.nextInt();

        double ortalama= vize*0.1+finalPuani*0.8+devamPuani*0.1;
        System.out.println("ortalama = " + ortalama);
        if (ortalama>70){
            System.out.println("Gectiniz");
        } else if (ortalama>60) {
            System.out.println("sartli gectiniz");
        }else {
            System.out.println("Calismaya devam, Kaldiniz");
        }
        ;


    }
}
