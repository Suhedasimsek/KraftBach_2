package day_24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {




       /* int[] iArry =new int[5];
        iArry[0]=10;
        iArry[1]=20;
        iArry[2]=30;
        iArry[3]=40;
        iArry[4]=50;

        System.out.println(Arrays.toString(iArry));

        for (int i: iArry) {
            System.out.println(i);

        }// ya da şöyle yazabiliriz
        for (int i = 0; i < iArry.length; i++) {
            System.out.println(iArry[i]);

        }*/

 String str="Merhaba java insanları";
        String[] arry =str.split(" ");
        System.out.println(Arrays.toString(arry));


        arry[1]="yurdum";
        System.out.println(Arrays.toString(arry));

        String[] arry2 =str.split ("java");
        System.out.println(Arrays.toString(arry2));

        int[] arrys={1,2,3,4,5,6};
        int [] ints=Arrays.copyOfRange(arrys, 2, 5);
        System.out.println(Arrays.toString(ints));


        int[] arrys2={9,2,7,4,5,6};
        Arrays.sort(arrys2);
        System.out.println(Arrays.toString(arrys2));

        int[] arrys3={9,8,7,3,5,6};
        Arrays.fill(arrys3,2,4,12);
        System.out.println(Arrays.toString(arrys3));
    }
}
