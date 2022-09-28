package day_6_Operators;

public class AritmeticOperators {
    public static void main(String[] args) {
      /*  int x=5, y=6, z;
        z=x+y;
        z=y%x;
        System.out.println(z);
        int sonuc=3123%168;
        System.out.println("sonuc=" +sonuc);
        double sayi= 3+5/2*4%(12-9);
        System.out.println(sayi);

        int yas=2022-1990;
        System.out.println(yas);
        int aliYas=2022-1998;
             int   ahmetYas=aliYas-5;
        System.out.println("ahmetYas=" +ahmetYas);

        final double PI=3.14;
                double r=3;
                double alan=PI*r*r;
                double çevre=2*PI*r;
        System.out.println("alan=" +alan);
        System.out.println("çevre="+ çevre);

               double fahreniet=300;
       double celcious=(fahreniet-32)/1.8;
        System.out.println(celcious);
        double fizik=92, kimya=55, matematik=89;
        double ortalama= (fizik+kimya+matematik)/3;
        System.out.println(ortalama);

       boolean sinifGecti=ortalama>80;

       System.out.println(sinifGecti);

        int sira=15;
        int koltuk=12;
        int kisi= sira*koltuk;
        int toplantiSayi=113;
                int bosKoltuk;
                int oturulanSira=(toplantiSayi/koltuk)+1;


        System.out.println("kisi="+kisi);
       System.out.println("bosKoltuk=" +(kisi-toplantiSayi));
        System.out.println("Toplam " +((toplantiSayi/koltuk)+1)+ " sırada oturulmaktadır.");
        System.out.println(15- ((toplantiSayi/koltuk)+1)+ " sira tamamen bostur.");
        System.out.println((12-(113%12))+ " oturulan sıradaki boş koltuk sayısıdır.");*/
        int saat= 31502/3600;
        System.out.println(saat);
        int dakika=(31502- saat*3600)/60;
        System.out.println(dakika);
        int saniye=31502-((saat*3600)+(dakika*60));
        System.out.println(saniye);


    }
}
