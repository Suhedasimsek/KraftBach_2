package day_15;

public class methods {
    public static void main(String[] args) {
       // basamakSayisi(1455);
        System.out.println("ebob = " + ebob(50,60));
    }

//    public static void basamakSayisi(int sayi) {
//        if (sayi == 0) {
//            return;
//        }
//        int basamak = 0;
//        while (sayi > 0) {
//            sayi/=10;
//            basamak++;
//
//        }
//        System.out.print(basamak);
//    }

public static int ebob (int x, int y){
        int sonuc=1;
        for (int i=1;i<=Math.min(x,y); i++) {
     if( x%i==0 && y%i==0)  {
         sonuc=i;
     }
     }return sonuc;
}















}
