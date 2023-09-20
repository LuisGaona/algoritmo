package org.lugaona.appmokito.ejemplos;

import java.util.ArrayList;

public class SubarraySum {

    public static void main(String[] args) {
        int N = 5, S = 12;
        int A[] = {1, 2, 3, 7, 5};
        subarraySum(A,N,S);
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList result= new ArrayList();

        int sum=0;
        for (var i=0;i<n;i++){
            sum+=arr[i];
            System.out.println(sum);

        }
        // Your code here
        return new ArrayList<>();
    }
}
