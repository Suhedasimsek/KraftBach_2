package day_31_Construction;

public class Flower {

    public static String renk;
    public int boy;
    public boolean diken;

    public Flower() {

    }

    public Flower(String renk) {
        this.renk = renk;

    }

    public Flower(String renk, int boy) {
        this.renk = renk;
        this.boy = boy;
    }

    public Flower(String renk, int boy, boolean diken) {
        this.renk = renk;
        this.boy = boy;
        this.diken = diken;


    }
}
