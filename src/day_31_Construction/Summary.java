package day_31_Construction;

public class Summary {
    public static void main(String[] args) {

        String x="Arzu İnci Asım Şüheda İbrahim";
                String[] arg=x.split(" ");

        for (int i = 0; i <arg.length ; i++) {
            System.out.println(i+1+ " . argüman "+arg[i]);

        }
    }
}
