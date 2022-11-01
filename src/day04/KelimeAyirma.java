package day04;

import java.util.Arrays;

public class KelimeAyirma {
    public static void main(String[] args) {

        /* create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
                * Output : [J, o, h, n]
         */

        String input= "kelime";
       harfAyir(input);

    }

    public static void harfAyir(String Kelime) {
        char[] karakter = new char[Kelime.length()];
        for (int i = 0; i < Kelime.length(); i++) {
            karakter[i] = Kelime.charAt(i);
        }
        System.out.println(Arrays.toString(karakter));
    }
}
