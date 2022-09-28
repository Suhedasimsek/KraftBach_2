package day_37;

 public class Fabrika {
//    protected static String personelAdi;
//
//     String defaultMethod(){// başında birşey yazılmazasa default
//        return personelAdi;
//    }
//static void statikDefaultMethod(){
//         return "Method çalıştı";


String personelAdi;
boolean isActive;
private int num;

static {
    System.out.println("statik method çalıştı");//İlk çalışır Nesneler artsa da 1 kere çalışır
}
     {
         System.out.println("Blok çalıştı"); //Statikten sonra çalışır
     }
public Fabrika(){
    System.out.println("constructor çalıştı");// Boş bloktan sonra çalışır.
}

}

