package day_34_Static.staticVariable;

public class Student_Test {
    public static void main(String[] args) {
        Student_ student1=new Student_("Arzu", 8);
        Student_ student2=new Student_("İnci", 8);
        Student_ student3=new Student_("Asım", 8);
        Student_ student4=new Student_("Zeynep", 8);

student1.schoolName="NEWKRAFT";
Student_.schoolName="NEWKRAFT";// static olduğu
// için değişiklik bütün sınıfı etkiledi
        System.out.println(student1.getinfo());
        System.out.println(student2.getinfo());
        System.out.println(student3.getinfo());
        System.out.println(student4.getinfo());


    }
}
