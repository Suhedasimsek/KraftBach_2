package day_40_interface;

public interface A {
    int num=10;
    void M1();
    void M2();

    default void M3(){

    }
    static void M4(){

    }
}
