package src.autoBoxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            // this is called autoboxing -> converting an int to Integer using valueOf method
            intArray.add(Integer.valueOf(12));
        }

        for (int i = 1; i <= 10; i++) {
            // this is called unboxing -> converting from Integer back to int
            System.out.println(i + "------> " + intArray.get(i).intValue());
        }

        Integer myIntValue = 26;  // Integer.valueOf(26);
        int value = myIntValue;  // myIntValue.intValue();
    }
}
