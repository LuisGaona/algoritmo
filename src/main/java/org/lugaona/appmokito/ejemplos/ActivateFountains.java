package org.lugaona.appmokito.ejemplos;

public class ActivateFountains {
    static int minCntFountain(int a[], int N){
        int [] dp=new int[N];
        for(var i=0;i<N;i++){
            dp[i]=-1;
        }
        int idxRight;
        int idxLeft;
        // Traverse the array
        for(var i=0;i<N;i++){
            idxLeft=Math.max(i-a[i],0);
            idxRight=Math.min(i+(a[i]+1),N);
            dp[idxLeft]= Math.max(dp[idxLeft],idxRight);
        }

        // Stores count of fountains needed to be activated
        int cntfount = 1;
        // Stores index of next fountain that needed to be activated
        int idxNext = 0;
        idxRight = dp[0];
        // Traverse dp[] array
        for(var i=0;i<N;i++){
            idxNext=Math.max(idxNext,dp[i]);

            // If left most fountain cover all its range
            if(i==idxNext){
                cntfount++;
                idxRight=idxNext;
            }
        }

        return cntfount;
    }
    public static void main(String[] args) {
        int a[]={0};
        int N=a.length;
        System.out.println("Luis");
        System.out.println(minCntFountain(a,N));
    }
}
