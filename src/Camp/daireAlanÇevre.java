package Camp;

import java.util.Scanner;

public class daireAlanÇevre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen yarıçap giriniz");
        double yarıCap=sc.nextDouble();
        double alan, çevre;
        alan=Math.PI*Math.pow(yarıCap,2);
        çevre=2*Math.PI*yarıCap;

        System.out.println("alan = " + alan);
        System.out.println("çevre = " + çevre);


    }
}
