package day05;

public class Questions_3 {
    public static void main(String[] args) {
        double yukseklik;
        int yereVurmaSayisi=0;
        do {

            yereVurmaSayisi++;
            yukseklik = 150;
            double toplamYol = 0;

            yukseklik = yukseklik - (yukseklik * 3 / 4);
            toplamYol = yukseklik + (yukseklik * 3 / 4);
        } while (yukseklik < 100);


    }





}
