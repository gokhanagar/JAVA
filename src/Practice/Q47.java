package Practice;

import java.util.ArrayList;

public class Q47 {
    // Part1:
    // Create an arraylist of Strings
    // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
    // print out all the elements, each element on new line

    // Part2:
    // Create a method that accepts a String arraylist and a String as parameters
    // method should add the element at the first index of arraylist

    // Part3:
    // Create a method that accepts a String arraylist and a String as parameters
    // it should add element before last element
    // ex:  [1, 2, 3]  -> [1, 2, 4, 3]
    public static void main(String[] args) {

        // Part1:
        ArrayList<String> renkler = new ArrayList<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Yellow");
        renkler.add("Black");

        System.out.println(renkler); //[Red, Green, Blue, Yellow, Black]

        for (int i = 0; i < renkler.size(); i++) {

            System.out.println(renkler.get(i));

        }

        // part 2

        ilkIndexeEkle(renkler, "White");
        System.out.println(renkler);
        //part 3
        sonIndextenOnceEkle(renkler, "Pink");
        System.out.println(renkler);

    }

    private static void sonIndextenOnceEkle(ArrayList<String> renkler, String pink) {

        renkler.add(renkler.size() - 1, pink);
    }

    private static void ilkIndexeEkle(ArrayList<String> renkler, String white) {


        renkler.add(0, white);


    }
}
