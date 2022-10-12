package Camp;

public class diziSoruları {
    public static void main(String[] args) {
        int[] nums ={10,20,30,40,50,60};
        //ilk sayıyı ekrana yazdır
        System.out.println(nums[0]);
        //son sayıyı yazdır
        System.out.println(nums[nums.length-1]);
        //Bütün elemanlarını ekrana yazdır
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+ nums[i]);

        }
    }
}
