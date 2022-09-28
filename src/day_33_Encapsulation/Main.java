package day_33_Encapsulation;

public class Main {
    public static void main(String[] args) {

//          Dog karabaş=new Dog ();
//       karabaş.setName("karabaş");
//        System.out.println(karabaş.getName());
//        karabaş.setName("boncuk");
//        System.out.println(karabaş.getName());
//        System.out.println(karabaş.isBlack);
//        karabaş.isBlack=true;
//        System.out.println(karabaş.isBlack);
//        karabaş.setBreed("sivas");
//        System.out.println(karabaş.getBreed());

//        circle circle=new circle(8);
//        System.out.println(circle.getRadius());
//        System.out.println(circle.circleArea());

Dog.foot=5;
        System.out.println(Dog.foot);
        Dog karabas=new Dog();
        System.out.println(karabas.foot);
        karabas.foot=10;
        Dog sevimli=new Dog();
        System.out.println(sevimli.foot);
        //foot static olarak sınıfın bir değişkeni
        // olduğundan sınıfta değişiklik yapıldığında
        // bütün nesneleri etkiliyor.



    }
        }

