package day_47;

import java.util.Arrays;

public class maxNumber {
    public static void main(String[] args) throws Exception {
        int arr[]={22,33,12,65,45,98,98,54};
        System.out.println(ArrayBüyükSayı(arr));
        System.out.println(büyükSayılıindexiBul(arr));

    }
    public static int ArrayBüyükSayı (int[] arr){
        int max= arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i]){
                max=arr[i];
        }
        }return  max;
    }

    public static int büyükSayılıindexiBul (int[] arr) throws Exception {
        int index=0;
        int max=ArrayBüyükSayı(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                 index=i;
            }

        }
        Arrays.sort(arr);
        if((arr[arr.length-1])==(arr[arr.length-2])){
            throw new Exception("1'den fazla büyük sayı var");
        }
return index;


    }


}
