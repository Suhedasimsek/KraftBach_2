package day_47;

import java.util.Arrays;

public class ArrayıBaşkaArrayaAtama {
    /*Bir Array'i farklı bir arrayin içerisine 5 farklı yöntem ile kopyalayabiliriz..
            1-For loop
    int[] arr=new int[array.length];
                        for (int i=0;i<array.length; i++){
        arr[i]=array[i];
    }

        2-Arrays.copyOf(int[] original, int newLength)

    int[] arr=Arrays.copyOf(array,array.length);

        3-Arrays.copyOfRange(int[] original, int from, int to)

    int[] arr=Arrays.copyOfRange(array,0,array.length-1);

         4-clone()

    int[] arr=array.clone();

         5-System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

    int[] arr=new int[array.length];
                         System.arraycopy(array,0,arr,0,array.length);

         */


    public static void main(String[] args) {
        System.out.println(newArray());





        //  int array[]= Arrays.copyOfRange(arr, 0,arr.length);
        //  System.out.println(Arrays.toString(array));
        // Arrays.sort(array);
        // System.out.println(Arrays.toString(array));
    }
public static String newArray() {
            int arr[] = {22, 3, 4, 55, 6, 7, 8};
            int array[] = new int [arr.length];
            for (int i = 0; i < arr.length; i++) {
                array[i] = arr[i];

            }
            return Arrays.toString(array);

        }
    }
