package day_29_Wrapper;

public class Wrapper {
    public static void main(String[] args) {
        Byte B = new Byte((byte) 127);
        Byte B2 = new Byte("127");
        System.out.println("B2 = " + B2);
        System.out.println("B = " + B);

        Short S = new Short((short) 1000);
        Short S2 = new Short("1000");

        Integer I = new Integer(10000);
        Integer I2 = new Integer("10000");

        Long L = new Long(1000000);
        Long L2 = new Long("1000000");

        Float F = new Float(1.4);
        Float F2 = new Float("1.4");

        Double D = new Double(5.4);
        Double D2 = new Double("5.4");

        Character C = new Character('a');

        int i=10;
        Integer x=i;  //autobox

        Integer x1=new Integer(5);
        int i1=x1;
    }
}
