package day04;

public class StringSayilariToplama {
    public static void main(String[] args) {
        /*
         * write a method which accepts a String as parameter
         * and prints the sum of the digits, present in the given string
         *
         * Parametre olarak bir String kabul eden ve verilen Stringde
         * bulunan rakamların toplamını yazdiran bir method yazın.
         *
         * Input : ade1r4d3
         * Output : 1+4+3 = 8
         *
         * Use Character.isDigit()
         *     Integer.valueOf()
         */
        String kelime="ade7r6d3";
        rakamlarinToplami(kelime);

    }

    private static void rakamlarinToplami(String kelime) {
        int sayilarinToplami=0;
        for (int i = 0; i < kelime.length(); i++) {
            if (Character.isDigit(kelime.charAt(i)))
            sayilarinToplami+= Integer.valueOf(""+kelime.charAt(i));
        }
        System.out.println("Rakamlarin toplami: "+sayilarinToplami);

    }


}
