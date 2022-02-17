package src.arrays;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myIntArray = new int[2];
//        myIntArray[0] = 10;
//        System.out.println(myIntArray[0]);
//
//        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9};
//        System.out.println(myIntArray2[5]);
//
//        String[] myStringArray = new String[2];
//        System.out.println(myStringArray[1]);
//
//        for (int i = 0; i < myStringArray.length; i++) {
//            myStringArray[i] = "String "+i;
//        }
//        printArray(myStringArray);
        int[] results = getIntegers(5);
        sortedArray(results);
        printArray(results);
        System.out.println("The Average is " + getAverage(results));
    }

    public static int[] getIntegers(int value) {
        System.out.printf("Please enter %d integer values\n", value);
        int[] inputValue = new int[value];
        for (int i = 0; i < value; i++) {
            inputValue[i] = scanner.nextInt();
        }
        return inputValue;
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int i=0; i < values.length; i++) {
            sum += values[i];
        }
        return (double) sum / (double) values.length;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d : %d\n",i+1, array[i]);
        }
    }

    public static void sortedArray(int[] values) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < values.length-1; i++) {
                if (values[i] < values[i+1]) {
                    flag = true;
                    int temp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = temp;
                }
            }
        }
    }
}
