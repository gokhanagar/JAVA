package Generic;

public class G05GenericClasses {
    public static void main(String[] args) {

        veriSakla<String> veri1 = new veriSakla<>("veri saklama islemi");
        veriSakla<Integer> veri2 = new veriSakla<>(1000000);
        veriSakla<Double> veri3 = new veriSakla<>(3.14);

        //veriSakla Class'tan create edilen obj get() method calistik
        System.out.println(veri1.getVeri());
        System.out.println(veri2.getVeri());
        System.out.println(veri3.getVeri());

        // veriSakla Class'tan create edilen obj veriYzdir Class yazdir method() call calistik
        veriYazdir.yazdir(veri1.getVeri());
        veriYazdir.yazdir(veri2.getVeri());
        veriYazdir.yazdir(veri3.getVeri());


    }
}

//Generic Class
class veriSakla<T> {
    private T veri;

    public veriSakla(T veri) {
        this.veri = veri;
    }

    public T getVeri() {
        return veri;
    }

    public void setVeri(T veri) {
        this.veri = veri;
    }
}

//None Generic Class
class veriYazdir {
    public static <T> void yazdir(T veri) { // generic method
        System.out.println("veri = " + veri);
    }
}