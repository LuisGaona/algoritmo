package org.lugaona.appmokito.ejemplos;

/*
[11:37] Alejandro Aguayo Acosta (CW)

You are climbing a staircase.
 It takes n steps to reach the top.
 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 Input: n = 3
 Output: 3

Explanation: There are three ways to climb to the top:

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

*/

public class Climbing {
    public static void main(String[] args) {
        int n=3;
        getClimbing(n);
    }


    public static int getClimbing(int n){
       int [] arr = new int[n];
        for(int i=1;i<=n;i++){
              arr[i-1]=i;
        }
        int count=0;

        for(int j=0;j<arr.length;j++){
            for(int p=j+1;p<arr.length;p++){
                int sum=arr[j]+arr[p];
                if(sum==n){
                    count++;
                }else {

                }
            }
        }
        return count;
    }
}
