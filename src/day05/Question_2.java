package day05;

public class Question_2 {
    public static void main(String[] args) {
        //Interview questions…
  //write a return method to reverse number

 //Input : 12345 Output : 54321
        int input=7612349;
        System.out.println(reversNumber(input));

    }
    public static int reversNumber(int input){
        int reverseNum=0;
        while(input>0){
            reverseNum=input%10+reverseNum*10;
            input=input/10;
        }
        return reverseNum;
    }


}
