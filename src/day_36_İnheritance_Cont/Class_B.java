package day_36_İnheritance_Cont;

public class Class_B extends Class_A {
    int b;

    public Class_B(int a, int b) {
        super(a);
        this.b = b;
    }

    public void bMethod(){
        System.out.println("B methodu");
    }
}
