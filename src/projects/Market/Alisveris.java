package projects.Market;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static projects.StorageManagement.TryCatch.scanner;

public class Alisveris {
    static  List<String> urunler = new ArrayList<>(Arrays.asList("Domates","Patates","Biber","Sogan","Havuc",
            "Elma","Muz","Cilek","Kavun","Uzum","Limon"));
    static List<Double> fiyat = new ArrayList<>(Arrays.asList(2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50));

   static List<String> sepetListes = new ArrayList<>();
   static List<Double> sepetKg = new ArrayList<>();
   static List<Double> sepetFiyat = new ArrayList<>();
    public static void main(String[] args) {

      String tercih;
        double toplamFiyat = 0;

        do{
            urunListele();
            System.out.println("Urun numarasina gore listeden urununuzu seciniz");
            int urunNo = scanner.nextInt();
            System.out.println("Almak istediginiz urunun kg giriniz ");
            double urunKg = scanner.nextDouble();

            sepeteEkle(urunNo,urunKg);
            toplamFiyat = Math.round(sepetiYazdir());
            System.out.println("Baska bir urun almak isiyorsaniz 'e' \n almak istemiyorsaniz 'h' ye basin ");
            tercih = scanner.next().toLowerCase().substring(0,1);

        }while(tercih.equalsIgnoreCase("e"));
        odeme(toplamFiyat);


    }

    private static void odeme(double toplamFiyat) {
        System.out.println("============ODEME===========");
        System.out.printf("ÖDENECEK TOPLAM FİYAT: %.2f", toplamFiyat);

        double nakit =0.0;
        do{
            System.out.println("Lutfen odemeniz icin nakit ucret giriniz");
            nakit = scanner.nextDouble();
            if(nakit< toplamFiyat){
                System.out.println("Lutfen odemeniz icin yeterli miktar giriniz");
                System.out.println("Yatirmaniz gereken miktar : " + (toplamFiyat - nakit));
            }

        }while(nakit<toplamFiyat);

        double paraUstu = nakit - toplamFiyat;
        if(paraUstu>0){
            System.out.println("Para ustunuz : " + paraUstu);
        }
        System.out.println("Yine bekleriz");
    }

    private static double sepetiYazdir() {

        double fiyatToplami = 0.0;
        double kgToplami = 0.0;

        System.out.println("urun adi/ urun kg / fiyat toplami");

        for(int i=0; i<sepetListes.size(); i++){

            System.out.println(sepetListes.get(i) + "    " + sepetKg.get(i) + "      " + sepetFiyat.get(i) );
            fiyatToplami += sepetFiyat.get(i);
            kgToplami += sepetKg.get(i);

        }
        System.out.println("Kilogram toplami : " + kgToplami + " Fiyat Toplami : " + fiyatToplami  );
        return fiyatToplami;
    }

    private static void sepeteEkle(int urunNo, double urunKg) {

        sepetListes.add(urunler.get(urunNo));
        sepetKg.add(urunKg);
        sepetFiyat.add(urunKg * fiyat.get(urunNo));


    }

    private static void urunListele() {
        System.out.println("urun no/ urun adi / urunun fiyati");

        for(int i =0; i<urunler.size(); i++) {
            System.out.println(i+"     "+ urunler.get(i) +"      " + fiyat.get(i));
        }



    }


}
