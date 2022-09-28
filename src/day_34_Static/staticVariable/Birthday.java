package day_34_Static.staticVariable;

public class Birthday {
    static int cakeSlice=28;
    public void takeASlice(){
        cakeSlice--;
    }public void takeAslice2(int slice){
        cakeSlice-=slice;
    }
}
class main2{
    public static void main(String[] args) {
        Birthday Asım=new Birthday();
        Birthday Arzu=new Birthday();
        Birthday İnci=new Birthday();
        Birthday Asaf=new Birthday();
        Asım.takeASlice();// Herbir nesne metodu işlettiğinde statik olan
        Arzu.takeASlice();//cakeSlice dan birer dilim düştü
        Asaf.takeASlice();
        İnci.takeASlice();
        Asım.takeAslice2(4);// değerli metodu döndürdü
        System.out.println(Birthday.cakeSlice);


    }
}