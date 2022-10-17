package Camp;

import java.util.Arrays;

public class diziSoruları {
    public static void main(String[] args) {
        //Array yazılışları
        int[] arr=new int[3];
        int arr2[]=new int[3];
        int[] arr3={2,4,6,8};
        int[] nums ={10,20,30,40,50,60};
        //ilk sayıyı ekrana yazdır
        System.out.println(nums[0]);
        //son sayıyı yazdır
        System.out.println(nums[nums.length-1]);
        //Bütün elemanlarını ekrana yazdır
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+ nums[i]);

        }
        System.out.println(Arrays.toString(nums));
    }
}
