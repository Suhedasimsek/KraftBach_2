package day_45.abstraction;

public class Mod_2 extends D3_Print{
    @Override
    public void extrude() {
        System.out.println("Printig amodel with "+model+ "fileformat: "+fileFormat );

    }

    @Override
    public void polish() {
        System.out.println(model+ "is polishing" );

    }

    public Mod_2(String model, String fileFormat) {
        super(model, fileFormat);
    }
}
