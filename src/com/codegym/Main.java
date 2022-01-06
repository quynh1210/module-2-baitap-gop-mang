package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 6, 9};
        int[] array2 = {4, 5, 6, 3, 8};

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int pos = 0;

        for (int element : array1) {
            result[pos] = element;
            pos++;
        }

        for (int element : array2) {
            result[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(result));
        
    }
}
