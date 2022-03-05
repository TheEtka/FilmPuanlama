import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Dizi mi Film mi?");
        String soru = s.next();

        if (soru.equals("Dizi"))
        {
            System.out.println(soru + "'nin İsmi:");
        }
        else if (soru.equals("Film"))
        {
            System.out.println(soru + "'in İsmi:");
        }
        else
        {
            System.out.println("Dizi mi Film mi?");
            soru = s.next();
        }

        String filmAdı = s.next();

        System.out.println("Konusu:");
        String konu = s.next();

        System.out.println("Yönetmeni:");
        String yonetmen = s.next();

        System.out.println("*** PUANLAMA SİSTEMİ ***");
        System.out.println("Özgünlük: (0-10 PUAN)");
        Double ozgun = s.nextDouble();

        System.out.println("Konuyu Kapsama: (0-10 PUAN)");
        Double kapsama = s.nextDouble();

        System.out.println("Yaratıcılık: (0-20 PUAN)");
        Double yaratici = s.nextDouble();

        System.out.println("Duygu ve Etkileyicilik: (0-20 PUAN)");
        Double etkileyici = s.nextDouble();

        System.out.println("Çekim Tekniği ve Kalitesi: (0-20 PUAN)");
        Double teknik = s.nextDouble();

        System.out.println("Anlatım Dili ve Kurgu: (0-20 PUAN)");
        Double kurgu = s.nextDouble();

        Degerlendirme d = new Degerlendirme(soru, filmAdı, konu, yonetmen, ozgun, kapsama, yaratici, etkileyici, teknik, kurgu);

        d.kriter();
        d.hesapla();
    }
}
