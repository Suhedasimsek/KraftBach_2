package day_31_Construction;

public class okul {

    public static String renk;
    public int sınıfAdeti;
    public int kapasite;

    public okul(){
        System.out.println("Parametresiz constructor çalışıyor");}

    public okul(String renk){
        this();// this methodu önce yazılır sonra yazılmaz.
        this.renk=renk;
        System.out.println("1 Parametreli constructor çalışıyor");
       }

    public okul(String renk, int sınıfAdeti){
        this("pembe");//tek parametreli olduğu için önce tek paremetreli consructura gidecek
        this.sınıfAdeti=sınıfAdeti;
        System.out.println("2 Parametreli constructor çalışıyor");}

    public okul(String renk, int sınıfAdeti,int kapasite){
        this.renk=renk;
        this.sınıfAdeti=sınıfAdeti;
        this.kapasite=kapasite;
        System.out.println("3 Parametreli constructor çalışıyor");}

    public okul( int kapasite ,int sınıfAdeti){
this.kapasite=kapasite;
this.sınıfAdeti=sınıfAdeti;
        System.out.println("2Farklı Parametreli constructor çalışıyor");
    }

    public void controlKapasite (){
        if (this.kapasite>500){
            System.out.println("Kapasite aşılmıştır");
        }else System.out.println("Kapasite aşılmasına " +(500-this.kapasite)+ " kalmıştır");
    }


}
