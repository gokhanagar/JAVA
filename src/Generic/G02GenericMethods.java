package Generic;

import java.util.Arrays;
import java.util.Comparator;

public class G02GenericMethods {
    public static void main(String[] args) {
        Integer[] intDizi = {1, 2, 3, 4, 5, 6, 7};
        Double[] doubleDizi = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charDizi = {'B', 'A', 'H', 'A', 'R'};

        System.out.println("integer dizi");
        diziYazdir(intDizi);
        System.out.println("double dizi");
        diziYazdir(doubleDizi);
        System.out.println("character dizi");
        diziYazdir(charDizi);

        System.out.println(maxBul(3, 5, 11));

        System.out.println("************   ***********");
        System.out.println(maxbulGeneric(3, 5, 7)); // int
        System.out.println(maxbulGeneric(10.1, 5.6, 7.5)); // double
        System.out.println(maxbulGeneric(3f, 1f, 24f)); // float


    }

    /*
    Bir Generic (type ozgu) method tanimlarken method'un donun tipinin onune <T> (angle brackets) konulur.
    E- Element(used extensively by the Java Collections Framework)
    K- Key
    N- Number
    T- Type
    V- Value
    S,U,V etc. 2nd, 3rd, 4th types kullanilan veri tipini gostermektedir
    Method'un parametre listesinde Generic parametre tipleri kullanilir
    Method parametre listeleri bir veya daha fazla olabilir ve virgulle ayrilarak yazilirlar.
    onemli -> Parametre tipleri non-primitive olmalidir
    JVM derleyici, compile asamasinda generic method'u java byte kodlara cevirirken parametre tiplerini
    kaldirir ve yerine gercek parametreleri koyar. Bu surece erasure denilir

     */
    //Generic method creation- single parameter
    private static <T> void diziYazdir(T[] dizi) {

        Arrays.stream(dizi).forEach(System.out::println);
    }

    public static int maxBul(int x, int y, int z) {

        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;

        }
        return max;

    }
        /*
        Generic veri tipleri sadece non-primitive olabilir
        Binary operatorler (+,-,*,/,<,>) ise non-primitive  veri tiplerinde kullanilmazlar
        Dolayisiyla bir generic method da karsilastirma icin ne kullanilabilir ?
        Cevap Comparable interface'i kullanilmali
        Generic method create --> cok parametreli
         */


    public static <T extends Comparable> T maxbulGeneric(T a, T b, T c) {

        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }


}
