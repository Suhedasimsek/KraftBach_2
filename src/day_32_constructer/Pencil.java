package day_32_constructer;

public class Pencil {
    public String color;
            public int lenght;
            public boolean haveEraser;

            public Pencil (){}
    public Pencil(String color){    ///constructerlarım 4 tane
                this.color=color;

    }
    public Pencil (String color, int lenght){
                this.color=color;
                this.lenght=lenght;

    }
    public Pencil (String color, int lenght,boolean haveEraser) {
        this.color = color;
        this.lenght = lenght;
        this.haveEraser = haveEraser;
    }
    public void write(){     // metodlarım
        System.out.println("Yazma işlemi yapılıyor");
    }

    public void delete(){
       if (this.haveEraser){// haveEraser zaten kendisi true ya da false verdiğinden bir daha eşittir yapmıyorm
           System.out.println("Silme işlemi yapılıyor");
                } else{
           System.out.println("Silme işlemi başarısız");
       }

    }





}
