package Camp;

public class FibonacciSayılar {
    public static void main(String[] args) {
      // 1 1 2 3 5 8 13
        //fibonacci kendinden önceki iki sayının toplamı olan sayıların dizilerle çözümü
        int[] fibonacci=new int[10];
        fibonacci [0]=1;
        fibonacci [1]=1;

        for (int i = 2; i <fibonacci.length ; i++) {
            fibonacci [i]= fibonacci[i-1]+fibonacci[i-2];
            System.out.println(fibonacci[i]);}// ya da
        for (int i = 0; i < fibonacci.length; i++) {
            fibonacci[i+3]=fibonacci[i+2]+fibonacci[i+1];

        }

        //döngülerle çözümü
        int a=1;
        int b=1;
        int c;
        for (int i = 0; i < 10; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);

        }


    }
}
