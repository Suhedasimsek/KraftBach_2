package day_45.abstraction;

public abstract class D3_Print {

    String model;
    String fileFormat;
    static int counterModel;

    public abstract void extrude();

    public abstract void polish();

    public static int counter() {
        counterModel++;
return counterModel;
}

    public D3_Print(String model, String fileFormat) {
        this.model = model;
        this.fileFormat = fileFormat;
    }
    public String fileFormatCheck(){
     if(fileFormat.equals("OBJ")){
         return "file format is suiteble for polishing";
        }else {
         return "file format is not suiteble for polishing";

     }

    }
}
