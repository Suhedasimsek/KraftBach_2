package day_32_constructer;

public class cat {
    //Cat adında bir class oluşturun, eyeColor, breed, isFat, isPet adında fields tanımlayın,
    //constructors (5 adet), sleep, food, run metodları oluşturarak main metodunda bu class dan
    //bir obje oluşturun.

    public String eyeColor;
    public String breed;
    public boolean isFat;
    public boolean isPat;

    public cat(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public cat(String eyeColor, String breed) {
        this.eyeColor = eyeColor;
        this.breed = breed;
    }

    public cat(String eyeColor, String breed, boolean isFat) {
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.isFat = isFat;
    }
    public cat(String eyeColor, String breed, boolean isFat, boolean isPat) {
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.isFat = isFat;
        this.isPat = isPat;
    }
    public cat() {
    }///Sağ tıkla generate bas sonra construction ve istediğin variableları seç otomatin gelsin
public void sleep(){
    System.out.println("Uyuyorum");
}
    public String food(){
        return "yemek yiyorum";
    }
    public String run(){
        return "koşuyorum";
    }




}
