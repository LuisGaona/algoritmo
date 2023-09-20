package org.lugaona.appmokito.ejemplos;

import com.sun.source.tree.ReturnTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class LargestNumberPosible {
    public static void main(String[] args) {
        int N = 2;
        int S = 9;

        System.out.println(findLargest(N, S));


    }

    static String findLargest(int N, int S) {
        if(S==0){
            return "-1";
        }
        int digitos = 0;
        List<Integer> largestNumber= new ArrayList<>();
        for (int i = 10; digitos <= N; i++) {
            digitos = (int) (Math.log10(i) + 1);
            String number = String.valueOf(i);

            String [] data= number.split("");
            int sum = 0;
            //for (int j = 0; j<digits1.length; j++) {
               // sum += Character.getNumericValue(digits1[j]);
            //}
             //Arrays.stream(data).mapToInt();

            //System.out.println(sum);
            if (sum == S) {
                largestNumber.add(Integer.valueOf(number));
            }
        }
        return largestNumber.stream().max(Integer::compare).get().toString();
    }
}
