package day_12NestedAndWhileLoops;

public class day_12_Examples {
    public static void main(String[] args) {
       /* int k=1;
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                k++;
                System.out.print(k);

            }
            System.out.println();
        }*/

    int i=0, k=1;
    while (i<5){
        for (int j=0; j<2;j++){
            System.out.println(k+ " merhaba");
            if (k==8) {
                break;
            }
            k++;
        }
        i++;
    }

























































    }
}
