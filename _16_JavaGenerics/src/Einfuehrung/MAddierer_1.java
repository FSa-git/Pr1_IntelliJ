package Einfuehrung;

import java.util.List;
import java.util.Vector;

public class MAddierer_1 {
    public static void main(String[] args) {
        int sum = 0;
        Integer zahl1 = 100;
        String name = "zehn";
        List myList = new Vector<>();

        myList.add(zahl1);
        myList.add(1000);

        for (Object object : myList) {
            sum = sum + ((Integer) object).intValue();
        }
        System.out.println(sum);

    }

}
