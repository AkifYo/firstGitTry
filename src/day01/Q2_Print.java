package day01;

public class Q2_Print {
    public static void main(String[] args) {
        /*input: 76543
        output:7
               6
               5
               4
               3
        */
        int number=76543;
        int firstDigid=76543%10;
        int secondDigid=(number/10)%10;
        int thirdDigid= (number/100)%10;
        int fourthDigid= (number/1000)%10;
        int fifthDigid= (number/10000)%10;
        System.out.println(firstDigid +"\n");
        System.out.println(secondDigid +"\n");
        System.out.println(thirdDigid +"\n");
        System.out.println(fourthDigid +"\n");
        System.out.println(fifthDigid +"\n");
    }
}
