package day_34_Static.staticVariable;

public class studentTEST {
    public static void main(String[] args) {
        Student student1=new Student("Asım");
        Student student2=new Student("İnci");// name sınıf içinde static tanımlandığı için hepsi son
        //yapılana dönüyor.

        student1.printName();
        student2.printName();





    }
}
