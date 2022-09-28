package day_45.İnterface;

public interface A {
    public static final int i=110;//soluk yazanlar otomatik arkada yazan
    public abstract void M1();
    public abstract void M2();
    public abstract void M3();
    public abstract void M4();
    default void M5(){
        System.out.println("Hello from default method");
        M6();
    }
    private void M6(){
        System.out.println("Hello from private method");
    }
    static void M7(){
        M6_1();
        System.out.println("Hello from static method");
    }
    private static void M6_1 (){
        System.out.println("Hello from private static method");
    }
}
