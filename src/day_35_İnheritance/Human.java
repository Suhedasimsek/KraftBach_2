package day_35_İnheritance;

public class Human {//MULTILEVEL İNHERİTANCE
    public void name(){
        System.out.println("İsmi Ahmet olabilir");
    }
}
class Man extends Human{
    public void role(){
        System.out.println("Baba olur");
    }
}
class Son extends Man{
    public void activity(){
        System.out.println("Oyun oynar");
    }
        }
        class Test{
            public static void main(String[] args) {
                Son son=new Son();
                son.name();
                son.role();
                son.activity();


                Man man=new Man();
                man.role();
                man.name();//activity erişemez

                Human human=new Human();
                human.name();//role ve activity erişemez
            }
        }