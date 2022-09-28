package day_34_Static.staticBlocks;

public class BlocksVs {
    static int i=10;

    public BlocksVs() {

        System.out.println("Constructor çalıştı");
    }
    static {
        System.out.println("Static block çalıştı");
        i=i*10;
        System.out.println(i);
    }
    {
        System.out.println("İnstance block çalıştı");
    }
}
