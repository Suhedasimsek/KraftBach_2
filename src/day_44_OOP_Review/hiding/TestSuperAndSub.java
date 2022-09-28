package day_44_OOP_Review.hiding;

public class TestSuperAndSub {
    public static void main(String[] args) {
        Sub sub=new Sub();
        System.out.println(sub.i);
        sub.increment();
        System.out.println(sub.i);

//        Super sup=new Super();
//        System.out.println(sup.i);
//        sup.increment();
//        System.out.println(sup.i);
    }
}
