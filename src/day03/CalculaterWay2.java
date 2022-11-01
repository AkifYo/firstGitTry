package day03;

import java.util.Scanner;

public class CalculaterWay2 {
    //static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type two numbers");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        System.out.println(" Yapmak Istediginiz islemi seciniz: \n 1. Toplama " +
                "\n 2. Cikarma \n 3. Carpma \n 4. Bolme");
       char islem2  = scan.next().charAt(0);
        System.out.println(calculator(islem2, number1, number2));
    }

    public static double calculator(char procesType, double number1, double number2) {
        double result = 0;
        switch (procesType) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                division(number1, number2);
                break;
        }
        return result;
    }
    public static double division(double number1, double number2){
        if (!(number1==0) && number2==0){
            return Double.POSITIVE_INFINITY;
        } else if (number1==0 && number2==0) {
            return Double.NaN;
        }
        else
            return number1/number2;

    }
}
