package Camp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();

        Label:for (int k = Math.min(i,j); k <Math.max(i,j) ; k++) {
            for (int l =2 ; l <k ; l++) {
                if (k%l==0){
                    continue Label;
                }

            }
            System.out.println(k+" prime sayıdır");

        }


// for each kulanımı
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,4,6,8,9,6,5,4));


        for (Integer each:list) {
            System.out.print(each+" ");

        }




    }
}
