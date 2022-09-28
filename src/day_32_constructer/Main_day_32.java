package day_32_constructer;

import java.io.Writer;

public class Main_day_32 {
    public static void main(String[] args) {

        //   //Square adında bir class oluşturun, sideLenght adında field tanımlayın, constructors,
        //        //calculateArea ve calculatePerimeter metodları oluşturarak main metodunda bu class dan
        //        //bir obje oluşturun.

//        Square square1=new Square();
//        square1.sideLenght=5;
//        System.out.println(square1.calculateArea());
//        System.out.println(square1.calculatePerimeter());
//
//        Square square2=new Square(8);
//        System.out.println(square2.calculateArea());
//        System.out.println(square2.calculatePerimeter());
//
//
//        System.out.println(Square.calculateArea(4));//sınıfı static tanımladığım için nesne
                                                             //oluşturmadan da metoda ulaşabildim.

//
//        Pencil pencil1=new Pencil("mavi",7,false);// () i.ini boş bırakırsaam pencil classımın içinde boş tanımlarsam
//        // hata vermez tanımlamazsam verir. Boşken yazdırırsam (0,null, false) default eder.
//        System.out.println(pencil1.lenght);
//        System.out.println(pencil1.haveEraser);
//        System.out.println(pencil1.color);
//
//        pencil1.write();
//        pencil1.delete();
//
//        cat cat1=new cat("yeşil","sokak köpeği",true, false);
//        System.out.println(cat1.isFat);
//        System.out.println(cat1.eyeColor);
//        System.out.println(cat1.isPat);
//        System.out.println(cat1.breed);
//        System.out.println(cat1.food());
//        System.out.println(cat1.run());
//        cat1.sleep();

        kraft_Bank_Customer customer1=new kraft_Bank_Customer(152986655,"Asım",true);
        //Üçünüde zorunlu tuttuğum bir constructor yaptığım için boş olamaz
        System.out.println(customer1.customerToken);
        System.out.println(customer1.customerAccount);
        customer1.addMoney(500);
        System.out.println(customer1.customerAccount);
        customer1.addMoney(1200);
        System.out.println(customer1.customerAccount);

    }
}
