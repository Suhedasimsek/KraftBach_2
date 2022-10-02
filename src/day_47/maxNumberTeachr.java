package day_47;

import java.util.Arrays;

public class maxNumberTeachr {
    public static void main(String[] args) throws Exception{


        //array içerinde en büyük sayının index numarasını getiren metodu yazınız
        //eğer en büyük sayıdan 2 veya daha fazla var ise new exception throw edin.

        int[] array = {1, 3, 5, 8, 5};
        //  System.out.println(maxDeger(array));

        System.out.println(maxNumberIndex(array));


    }

    public static int maxNumberIndex(int[] array) throws Exception {

        /*
        Bir Array'i farklı bir arrayin içerisine 5 farklı yöntem ile kopyalayabiliriz..
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

        int[] arr=array.clone();

        int indexNumber=0;

        Arrays.sort(arr);
        int x=arr[arr.length-1];

        if(arr.length==1) return 0;

        if(arr[arr.length-2]==x){
            throw new Exception("en büyük sayıdan 2 adet vardır");
        }


       /* try {
            if(arr[arr.length-2]==x){
                throw new Exception("en büyük sayıdan 2 adet vardır");
            }
        }catch (ArrayIndexOutOfBoundsException e){

        }catch (Exception e){}  */

        for(int i=0; i<array.length; i++){
            if(array[i]==x){
                indexNumber=i;
            }

        }
        return indexNumber;
    }



    public static int maxNumber(int[] arr){

        // Arrays.sort(arr);
        //int min=arr[0];
        //int max=arr[arr.length-1];




        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;



    }
}
