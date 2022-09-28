package day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_6 {
    public static void main(String[] args) {


        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("elma");
        fruitBasket.add("armut");
        fruitBasket.add("kayısı");
        fruitBasket.add("üzüm");
        fruitBasket.add("incir");


        ArrayList<String> fruitinPlate = new ArrayList<>();
        fruitinPlate.add("armut");
        fruitinPlate.add("kayısı");
        fruitinPlate.add("üzüm");

        fruitBasket.removeAll(fruitinPlate);
        System.out.println(fruitBasket);
        System.out.println(fruitinPlate == fruitBasket);//aynı ArrayList olup olmadığına bakıyo
        System.out.println(fruitinPlate.equals(fruitBasket));//equals içerik denetimi

        ArrayList<String> listOfNums = new ArrayList<>();

//        listOfNums.add(5);
//        listOfNums.add(10);
//        listOfNums.add(15);
//        listOfNums.add(20);
//        listOfNums.add(25);
//        listOfNums.add(100);
//        listOfNums.add(100);
//        listOfNums.add(200);


    }


    public static void printListNumbers(ArrayList<Integer> nums) {
        for (Integer I : nums) {
            System.out.println(I + " ");

        }
    }

    public static int sum(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer I : nums) {
            sum += I;

        } return sum;
    }
}
