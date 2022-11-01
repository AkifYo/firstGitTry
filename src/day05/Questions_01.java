package day05;

import java.util.Scanner;

public class Questions_01 {
    public static void main(String[] args) {
        //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bolmek istediginiz sayiyi giriniz");
        int bolunen =scan.nextInt();
        System.out.println("Lutfen Bolmek istediginiz sayiyi giriniz");
        int bolen =scan.nextInt();

        System.out.println(bolenBul(bolunen,bolen));


}  public static int bolenBul(int bolunen, int bolen){
        int counter =0;
        while (bolunen>=bolen){

            bolunen-=bolen;
            counter++;
        }
        return counter;
    }
}

