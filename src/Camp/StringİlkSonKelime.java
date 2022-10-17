package Camp;

public class StringİlkSonKelime {
    public static void main(String[] args) {
        String str="Ben senin beni sevebilme ihtimalini sevdim";
        int ilkBoşluk= str.indexOf(" ");//ilk boşluğun kaçıncı indexte olduğunu verecek
        String ilkKelime=str.substring(0,ilkBoşluk);
        System.out.println(ilkKelime);

        int sonBoşluk= str.lastIndexOf(" ");
        String sonKelime=str.substring(sonBoşluk);
        System.out.println(sonKelime);
    }
}
