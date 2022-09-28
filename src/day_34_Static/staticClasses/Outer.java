package day_34_Static.staticClasses;

public class Outer {// Burayı static yapsam kabul etmez. İçteki static olabilir dıştaki olamaz.

    static class Nested {
        public static void message1(){

            System.out.println("Selam static classdan");// messaj yazmak için method yazmak lazım
        }
    }
    class inner {
        public void message2() {
            System.out.println("Selam inner classsdan"); } }
}
        class main {
            public static void main(String[] args) {
Outer.Nested.message1();

 Outer outer=new Outer();
 Outer.inner selam=outer.new inner();
 //yukarıda iki satırda yazılan tek satırda şöyle yazılabilir:
             //   Outer.inner selam=new Outer().new inner(); İki tane olduğu için birini kapattım
                selam.message2();





            }
        }

