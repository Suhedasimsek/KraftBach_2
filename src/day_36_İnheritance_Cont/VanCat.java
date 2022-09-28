package day_36_İnheritance_Cont;

public class VanCat extends Cat{
    boolean isDifferenteyes;

    public VanCat(int ayaksayısı, String color,
                  boolean isNankör,
                  boolean isDifferenteyes) {
        super(ayaksayısı, color, isNankör);
        this.isDifferenteyes = isDifferenteyes;
    }
}
