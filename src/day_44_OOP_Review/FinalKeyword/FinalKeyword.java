package day_44_OOP_Review.FinalKeyword;

public class FinalKeyword {
    static final int f=10;
    final int n=5;
    final int l=3;
    static final int sl=2;

    public FinalKeyword() {
        System.out.println("constructor");
    }
    {
        System.out.println("init blok");
    }
    static {
        System.out.println("static");
    }
}


class Main {
    public static void main(String[] args) {
        FinalKeyword finalKeyword = new FinalKeyword();
        System.out.println(finalKeyword.l);
        System.out.println(finalKeyword.l);

    }
}