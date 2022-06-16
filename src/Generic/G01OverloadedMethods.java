package Generic;

import java.util.Arrays;

public class G01OverloadedMethods {

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

        System.out.println("********  *********");
        System.out.println("integer dizi");
        diziYazdirObject(intDizi);
        System.out.println("double dizi");
        diziYazdirObject(doubleDizi);
        System.out.println("character dizi");
        diziYazdirObject(charDizi);

    }

    //overloaded methods
    public static void diziYazdir(Integer[] intDizi) {

        Arrays.stream(intDizi).forEach(System.out::println);
    }

    public static void diziYazdir(Double[] dbDizi) {

        Arrays.stream(dbDizi).forEach(System.out::println);
    }

    public static void diziYazdir(Character[] chrDizi) {

        Arrays.stream(chrDizi).forEach(System.out::println);
    }

    //Object Class parameter method
    public static void diziYazdirObject(Object[] Dizi) {
        Arrays.stream(Dizi).forEach(System.out::println);
    }

    //Object classdaki verilerin type'i farkli oldugu icin bu veriler alinirken casting yapilmazsa CTE verir


}
