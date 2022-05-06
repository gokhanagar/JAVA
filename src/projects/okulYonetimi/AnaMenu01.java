package projects.okulYonetimi;

import java.util.Scanner;

public class AnaMenu01 implements AnaMenu{
    static Scanner scanner = new Scanner(System.in);


    public static void giris(){
        AnaMenu01 object = new AnaMenu01();
        System.out.println(" Okul Yonetimi ");
        System.out.println("Lutfen yapmak istediginiz islemi secin");
        System.out.println("1-Ogretmen \n2-Ogrenci \nq-");

        String scm =  TryCatch.stringGirisi();

        switch(scm){

            case "1":
                object.ogrenciIslemleri();

            case "2":
                object.ogretmenIslemleri();

            case "3":
                object.cikis();

            default:
                System.out.println("Hatali deger girdiniz. Tekrardan giris yapin");
                giris();
        }
    }


    @Override
    public void ogrenciIslemleri() {

        Islemler01.islemlerMenu(1);
    }

    @Override
    public void ogretmenIslemleri() {
        Islemler01.islemlerMenu(2);
    }

    @Override
    public void cikis() {
        System.out.println("Sistemden cikis yaptiniz");
    }
}
