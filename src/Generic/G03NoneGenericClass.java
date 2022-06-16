package Generic;

import java.util.ArrayList;
import java.util.List;

public class G03NoneGenericClass {

    public static void main(String[] args) {
        List liste = new ArrayList();
        liste.add("yagmur hanim");
        liste.add(571622);

        System.out.println(liste); // [yagmur hanim, 571622]

        String devName = (String) liste.get(0); // casting
        Integer tel = (Integer) liste.get(1); // casting
        System.out.println(devName + " " + tel);

        liste.add(7.4);
        System.out.println((Integer) liste.get(2)); //ClassCastException

        List<Object> objList = new ArrayList<>();
        objList.add("bahar hanim");
        objList.add(2021);
        String uzman = (String) liste.get(0);
        Integer trh = (Integer) liste.get(1); // casting


        for (Object each : objList) {

            String yazi = (String) each;
            System.out.println(yazi); //RTE  ClassCastException
        }


    }


}
