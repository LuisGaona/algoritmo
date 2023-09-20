package org.lugaona.appmokito.ejemplos;

import java.util.Arrays;

/**
 * {0,0,0,0,0}
 * 1.- {100,100,0,0,0}
 * 2.- {100,200,100,100,100}
 * 3.- {100,200,200,200,100}  200
 */
public class MaximumValueArray {
    public static void main(String[] args) {
        int x = 5;
        int i[] = {0, 1, 2};
        int j[] = {1, 4, 3};
        //value of K that will be added
        int k[] = {100, 100, 100};
        int y = 3;

        System.out.println(getMaxValue(x, i, j, k, y));

    }

    public static int getMaxValue(int x, int i[], int j[], int k[], int y) {
        // Here i create the empty array.
        int nums[] = new int[x];
        //here iterate according to Y value
        for (var p = 1; p <= y; p++) {
            int start = i[p - 1];
            int end = j[p - 1];

            //fill up data with data from array K
            int aux = start;
            while (aux <= end) {
                nums[aux] += k[p - 1];
                aux++;
            }
        }
        // return with the maximum value.
        return Arrays.stream(nums).max().getAsInt();
    }

}
