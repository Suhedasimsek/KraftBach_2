package day_4_review;

public class TypeCasting {
    public static void main(String[] args) {
        int myAge=8;
                double MyDouble=myAge;
        System.out.println(MyDouble);
        int versiyon=2;
                double ver=versiyon;
        System.out.println(ver);
        long uzun=2;
         ver=uzun;
        System.out.println(ver);

        float kayan=uzun;
        System.out.println(kayan);

        double d=9.78;
                int i=(int)d;
        System.out.println(i);

        // 2.3 4.1 ve 5 sayılarını uygun typelara atayın. Sayıların toplamını tam sayı olarak yazdırın.
        double sayi1=2.3, sayi2=4.1;
               int sayi3=5;
                      int toplam=(int)sayi1+(int)sayi2+sayi3;
        System.out.println(toplam);

       // ya da;
        double sayi4=sayi1+sayi2;
        System.out.println(sayi4);
        int sayi6= (int)sayi4;
        System.out.println(sayi6 + sayi3);

        //2.3, 4.4, 5.3 ve 5 sayılarını uygun typelara atayın ve sayıların toplamını tamsayı olarak yazdırın.

double num1=2.3, num2=4.4, num3=5.3;
        int num4=5;
                toplam= (int) (num1+num2+num3)+num4;
        System.out.println(toplam);
    }
}
