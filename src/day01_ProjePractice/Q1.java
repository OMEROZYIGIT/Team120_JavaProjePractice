package day01_ProjePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    /*
   Girilen desimal değeri binary değere çeviren methodu oluşturunuz.
   desimal sayi = ondalıklı sayı
   binary sayi =bilgisayar sayı istemi 1 0
       Örnek: 12 = 1 1 0 0

       12/2=6 kalan 0
       6/2=3 kalan 0
       3/2=1 kalan 1

       sonda kalan bölüm + son işlemin kanaı+ 2. işlemin kalanı + ilk işlemin kalanı
       1 1 0 0
    */

    public static void main(String[] args) {

        System.out.print("Desimal değer giriniz: ");
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();

        System.out.println(sayi + " desimal sayısının binary karşılığı: " + binaryConvert(sayi));
    }

    public static List<Integer> binaryConvert(int sayi) {

        List<Integer> binary = new ArrayList<>();

        while (sayi>0){
            binary.add(sayi%2);
            sayi/=2;
        }
/*
        List<Integer> tersBinary = new ArrayList<>();

        for (int i = binary.size()-1; i >=0 ; i--) {
            tersBinary.add(binary.get(i));
        }
        return tersBinary;
 */

        // direkt olarak List ve Arraylerde kullanılabilecek hazır method mevcut
        Collections.reverse(binary);

        return binary;
    }
}
