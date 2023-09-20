package org.lugaona.appmokito.ejemplos;

public class PerfectSum {
    public static void main(String[] args) {
        int arr[]={2, 3, 5, 6, 8, 10};
        int n=6;
        int sum=10;
        System.out.println(Sum(arr,n,sum));
    }


    public static int Sum(int arr[],int n, int sum)
    {
        // Your code goes here
        int mod = 1000000007;
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for(var i=1;i<=n;i++){
        for(var j=0;j<=sum;j++){
            System.out.println(arr[i-1]);
            System.out.println(j);
            if(arr[i-1]<=j){
                dp[i][j]=(dp[i-1][j] + dp[i-1][j- arr[i-1]]) % mod;
            }else {
                dp[i][j] = dp[i - 1][j];
            }
        }

        }
        return dp[n][sum];
    }
}
