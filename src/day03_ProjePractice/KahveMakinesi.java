package day03_ProjePractice;

import java.util.Scanner;

public class KahveMakinesi {
    /*
    Basit bir Kahve makinesi oluşturun.
        1. Şart
            3 çeşit kahvemiz olsun.
            Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

            Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
             Örn:
                Hangi Kahveyi İstersiniz?
                1.Türk kahvesi
                2.Filtre Kahve
                3.Espresso
        2.Şart
            Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?
            (Evet veya Hayır olarak cevaplayınız)
        3. Şart
            Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz?
            (Evet veya hayır cevabını veriniz)
        4. Şart
            Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun?
            (Büyük boy - orta boy - küçük boy olarak giriniz.)
        Sonuç
            Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
     */


    static String kahveCesidi = "";
    static String sut = "";
    static String seker = "";
    static String kahveBoyutu = "";
    static int sekerMiktari;

    static Scanner scan = new Scanner(System.in);


    // menu isminde method oluşturuldu.
     static void menu() {

        System.out.println("*******GAHVECİYE HOŞGELDİNİZ*******");

        do {
            System.out.print("***************MENU****************\n" +
                    "1. Türk Kahvesi\n" +
                    "2. Filtre Kahve\n" +
                    "3. Americano\n" +
                    "SEÇİM:");
            kahveCesidi = scan.nextLine();

            // eğer kahve çeşiti menüdekine eşit değilse
            if (!kahveCesidi.equalsIgnoreCase("türk kahvesi") &&
                    !kahveCesidi.equalsIgnoreCase("filtre kahve") &&
                    !kahveCesidi.equalsIgnoreCase("americano"))
                System.out.println("BU ÜRÜN MENUDE YOK.....");

            // if şartı sağlanmadığı sürece do şartı sürekli döner menü sürekli ekrana gelir.
        } while (!kahveCesidi.equalsIgnoreCase("türk kahvesi") &&
                !kahveCesidi.equalsIgnoreCase("filtre kahve") &&
                !kahveCesidi.equalsIgnoreCase("americano"));

    }

    /*
    2.Şart
  Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
     */
    // sutEkleme methodu oluşturuldu.
    static void sutEkleme() {
        System.out.println("Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)");
        sut = scan.next();

        // eğer sut ekleme methodu için evet yazılırsa aşağıdaki dönecek.
        if (sut.equalsIgnoreCase("evet"))
            System.out.println("Süt ekleniyor.....");
        else
            System.out.println("Süt eklenmiyor....");

    }

    /*
    3. Şart
  Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
  sorusunu sorsun.
     */
    // sekerEkleme methodu oluşturuldu.
    static void sekerEkleme() {
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)");
        seker = scan.next();

        if (seker.equalsIgnoreCase("evet")) {
            System.out.print("Kaç şeker istersiniz: ");

            sekerMiktari = scan.nextInt();
            System.out.println(sekerMiktari + " adet şeker ekleniyor....");
        } else
            System.out.println("Şeker eklenmiyor....");
    }

    /*
    4. Şart
  Şeker tercihini yaptıktan sonra sistem kullanıcıya kahvenin "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
  sorusunu sorsun.
     */
    // boyutSorgulama methodu oluşturuldu.
    static void boyutSorgula() {

        do {
            System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
            scan.nextLine();
            kahveBoyutu = scan.nextLine();

            if (!kahveBoyutu.equalsIgnoreCase("büyük boy") &&
                    !kahveBoyutu.equalsIgnoreCase("orta boy") &&
                    !kahveBoyutu.equalsIgnoreCase("kücük boy"))
                System.out.println("Hatalı giriş yaptınız....");

            // if teki şartlar sağlanana kadar devam et demek
        } while (!kahveBoyutu.equalsIgnoreCase("büyük boy") &&
                !kahveBoyutu.equalsIgnoreCase("orta boy") &&
                !kahveBoyutu.equalsIgnoreCase("kücük boy"));

    }
    /*
    Sonuç
   Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :

        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
     */
    // sonuc adında method oluşturuldu.
    static void sonuc(){
        // eğer sut için evet ise sut = sütlü döndürür
        if (sut.equalsIgnoreCase("evet"))
            sut="sütlü";
        else
            sut="sütsüz";

        // eğer seker için evet ise seker = sekerMiktarı nı döndürürü
        if (seker.equalsIgnoreCase("evet"))
            seker=sekerMiktari+" sekerli";
        else
            seker="şekersiz";

        System.out.println(sut+" "+seker+" "+kahveBoyutu+" "+kahveCesidi+" HAZIRDIR. AFİYET OLSUN!!!");
    }


    // main method altında
    // menu methodu gelir
    // sutEkleme methodu gelir
    // sekerEkleme methodu gelir
    // boyutSorgulama methodu gelir
    // sonuc methodu gelir.
    public static void main(String[] args) {

        menu();
        sutEkleme();
        sekerEkleme();
        boyutSorgula();
        sonuc();

    }
}
