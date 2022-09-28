package day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10); nums.add(100); nums.add(190); nums.add(120); nums.add(55); nums.add(5);

        System.out.println("nums = " + nums);
        nums.remove(1);
        System.out.println("nums = " + nums);
        System.out.println("nums.size() = " + nums.size());
        nums.add(100);
        nums.add(800);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);


        int num=5;
        Integer NUM=5;
        nums.remove(num);
        System.out.println("nums = " + nums);
        nums.remove(NUM);
        System.out.println("nums = " + nums);

    }
}
