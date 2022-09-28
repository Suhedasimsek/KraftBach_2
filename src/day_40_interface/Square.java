package day_40_interface;

public class Square implements Geometric{
    double a;

    public Square(double a) {
        this.a = a;
//        System.out.println(getArea());
//        System.out.println(getPrimeter(this.a,this.a,this.a,this.a));
    }

    @Override
    public double getArea() {
        return Math.pow(a,2);
    }
}

class run{
    public static void main(String[] args) {
        Square square1=new Square(5);//istersem getArea ve getPrimeter metodlarını constructor içinde yazarak
        //direk sonuc da elde edebilirim.
        System.out.println(square1.getArea());
        double primeter= square1.getPrimeter(4,4,4,4);
        System.out.println(primeter);
    }
}
