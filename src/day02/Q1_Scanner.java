package day02;

import java.util.Scanner;

public class Q1_Scanner {
    public static void main(String[] args) {
        /*
         * Write a Java program that asks to user 2 questions Question
         * 1 = how many tea do you drink in a day? Question
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */

         Scanner scan = new Scanner(System.in);
        System.out.println("how many tea do you drink in a day?");
        int dailyDrink=scan.nextInt();
        System.out.println("how many sugar do you use for a glass of tea?");
        int sugarUseDaily= scan.nextInt();

        double yearTotal= dailyDrink*sugarUseDaily*2.7*365/1000;
        double fortyYear= 40*yearTotal;
        System.out.println("You are using:"+yearTotal+"kg");
        System.out.println("You are using total in forty years: "+fortyYear+"kg");
        if (dailyDrink==0){
            System.out.println("“Good Job, less sugar more health”");
        };
    }
}
