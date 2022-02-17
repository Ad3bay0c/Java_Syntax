package src.refernces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int intValue = 25;
        int myIntValue = intValue;

        System.out.printf("intValue: %d and myIntValue: %d\n", intValue, myIntValue);

        myIntValue = 30;
        System.out.printf("intValue: %d and myIntValue: %d\n", intValue, myIntValue);

        int[] intArray = new int[5];
        int[] myIntArray = intArray;
        System.out.println("Before Insert................");
        System.out.println("Int Array: " + Arrays.toString(intArray));
        System.out.println("My Int Array: " + Arrays.toString(myIntArray));

        myIntArray[2] = 32;
        System.out.println("\nAfter Insert................");
        System.out.println("Int Array: " + Arrays.toString(intArray));
        System.out.println("My Int Array: " + Arrays.toString(myIntArray));
    }
}
