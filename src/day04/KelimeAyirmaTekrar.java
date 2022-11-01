package day04;

import java.util.Arrays;

public class KelimeAyirmaTekrar {
    public static void main(String[] args) {
        String kelime="ayse";
        kelimeAyir(kelime);
    }

    private static void kelimeAyir(String kelime) {
        char [] output= new char[kelime.length()];
        for (int i = 0; i < kelime.length(); i++) {
            output[i]=kelime.charAt(i);


        }
        System.out.println(Arrays.toString(output));
    }
}
