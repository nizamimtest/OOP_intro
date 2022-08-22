package day018;

public class MainApp {
    public static void main(String[] args) {
        Araba araba1=new Araba();
        araba1.marka="Audi";
        araba1.silindirHacmi=1.9;
        araba1.yas=11;

        Araba araba2=new Araba();
        araba2.marka="BMW";
        araba2.silindirHacmi=2.0;
        araba2.yas=5;

        araba1.bilgileriGoster();
        araba2.bilgileriGoster();
    }
}
