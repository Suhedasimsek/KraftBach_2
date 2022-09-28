package day_15;

public class methodOverLoading {
    public static void main(String[] args) {
//
concat(5,"Şüheda", false);
concat("Ayşe", 3);
    }

    public static void Alan ( double r) {
        double  PI=3.14;
        System.out.println(PI*r*r);

    }

    public static void Alan ( int a, int b) {

        System.out.println(a*b);

    }


    public static void concat (int i, String str, boolean bl) {
        if (bl) {
            System.out.println(str + i);
        } else
            concat(str,i);
    }




    public static void concat (String kelime, int j) {
        for (int k = 0; k < j; k++) {
            System.out.println(kelime);
        }
    }

}
