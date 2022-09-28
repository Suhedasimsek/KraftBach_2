package day_45.abstraction;

public class Mod_1 extends D3_Print{
    @Override
    public void extrude() {
        System.out.println("Printig amodel with "+model+ "fileformat: "+fileFormat );

    }

    @Override
    public void polish() {
        System.out.println(model+ "is polishing" );
    }

    public Mod_1(String model, String fileFormat) {
        super(model, fileFormat);
        extrude();
        System.out.println(fileFormatCheck());
        if (fileFormat.equals("OBJ")){
            polish();
        }else {
            fileFormatCheck();
        }
        System.out.println(counter());
    }
}
