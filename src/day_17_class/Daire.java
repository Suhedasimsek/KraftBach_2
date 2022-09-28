package day_17_class;


public class Daire {

    int cap;
    final double PI=3.14;

    public double alanHesap () {
        int r=cap/2;
        double sonuc = PI * r * r;
        return sonuc;
    }


    public double cevre () {
        int r=cap/2;
        double sonuc = 2* PI * r;
        return sonuc;
    }


    }
