package day03;

import java.util.Scanner;

public class A01_practise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type two numbers");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.println(" Yapmak Istediginiz islemi seciniz: \n 1. Toplama " +
                "\n 2. Cikarma \n 3. Carpma \n 4. Bolme");
        int character = scan.nextInt();
        if (character == 1) {
            System.out.println("Total what You typed numbers is: " + (number2 + number1));
        } else if (character == 2) {
            System.out.println("Total what You typed numbers is: " + (number1 - number2));
        } else if (character == 3) {
            System.out.println("Total what You typed numbers is: " + (number2 * number1));
        } else if (character == 4) {
            System.out.println("Total what You typed numbers is: " + (number1 / number2));
        } else {
            System.out.println("Hatali giris yaptiginiz");
        }
    }
}
