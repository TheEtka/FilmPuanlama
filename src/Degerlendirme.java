public class Degerlendirme {

    private final String diziFilm;
    private final String movie;
    private final String subject;
    private final String director;
    private final double ozgunluk;
    private final double konuKapsama;
    private final double yaraticilik;
    private final double duygu;
    private final double kalite;
    private final double kurgu;

    public Degerlendirme(String diziFilm, String movie, String subject, String director,
                         double ozgunluk, double konuKapsama, double yaraticilik,
                         double duygu, double kalite, double kurgu) {
        this.diziFilm = diziFilm;
        this.movie = movie;
        this.subject = subject;
        this.director = director;
        this.ozgunluk = ozgunluk;
        this.konuKapsama = konuKapsama;
        this.yaraticilik = yaraticilik;
        this.duygu = duygu;
        this.kalite = kalite;
        this.kurgu = kurgu;
    }

    public void kriter()
    {

        if (diziFilm.equals("Dizi"))
        {
            System.out.println("\nDizi'nin İsmi: " + movie);
        }
        else
        {
            System.out.println("\nFilm'in İsmi: " + movie);
        }

        System.out.println("Konusu: " + subject);
        System.out.println("Yönetmeni: " + director);
        System.out.println("\n*** PUAN ***");

        if (ozgunluk <= 10 && ozgunluk >= 0)
        {
            System.out.println("Özgünlük: " + ozgunluk);
        }
        else
        {
            System.out.println("Özgünlük, 0 ile 10 puan arasında olmalı!");
        }

        if (konuKapsama <= 10 && konuKapsama >= 0)
        {
            System.out.println("Konuyu Kapsama: " + konuKapsama);
        }
        else
        {
            System.out.println("Konuyu Kapsama, 0 ile 10 puan arasında olmalı!");
        }

        if (yaraticilik <= 20 && yaraticilik >= 0)
        {
            System.out.println("Yaratıcılık: " + yaraticilik);
        }
        else
        {
            System.out.println("Yaratıcılık, 0 ile 20 puan arasında olmalı!");
        }

        if (duygu <= 20 && duygu >= 0)
        {
            System.out.println("Duygu ve Etkileyicilik: " + duygu);
        }
        else
        {
            System.out.println("Duygu ve Etkileyicilik, 0 ile 20 puan arasında olmalı!");
        }

        if (kalite <= 20 && kalite >= 0)
        {
            System.out.println("Çekim Tekniği ve Kalitesi: " + kalite);
        }
        else
        {
            System.out.println("Çekim Tekniği ve Kalitesi, 0 ile 20 puan arasında olmalı!");
        }

        if (kurgu <= 20 && kurgu >= 0)
        {
            System.out.println("Anlatım Dili ve Kurgu: " + kurgu);
        }
        else
        {
            System.out.println("Anlatım Dili ve Kurgu, 0 ile 20 puan arasında olmalı!");
        }
    }

    public void hesapla()
    {
        double[] ortalama = {ozgunluk, konuKapsama, yaraticilik, duygu, kalite, kurgu};

        double ort1 = 0;

        for (int i=0; i < ortalama.length; i++)
        {
            ort1 += ortalama[i];

            if (i == 5)
            {
                double ort2 = ort1 / 10;
                System.out.println("\nDerecelendirme: " + ort2);
            }
        }
    }

}
