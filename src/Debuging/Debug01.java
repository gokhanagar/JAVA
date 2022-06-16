package Debuging;

public class Debug01 {
   static int global =7;
    public static void main(String[] args) {

        /*Debug yapmak kodun zihinsel bir modelinin eksikligine isarettir
        iki durumda debugger gerekli olabilir:
        Mevcut kod devralindiginda
        Yeni kod yazildiginda

        Her iki durumdada debugger calistirmaya dikkat edilmeli.
        Amac sifir debug aktivitesi ile uygulamayi istenilen seviyeye getirebilmek
         */

    dongu1();


    }
    public static void dongu1(){
        global++;
        int a =0;

        for(int i=1; i<=10; i++){

            System.out.print(i+" ");
            a = 3*i;
        }
        System.out.println(" -->1. dongu");
        dongu2();
        dongu3();
    }

    private static void dongu3() {
        global +=5;
        for(int i=0; i<=7; i++){

            System.out.print(i+" ");
        }
        System.out.println(" -->3. dongu");
    }

    private static void dongu2() {
        global -=3;
        for(int i=0; i<=3; i++){

            System.out.print(i+" ");
        }
        System.out.println(" -->2. dongu");
    }


}
