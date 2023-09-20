package org.lugaona.appmokito.ejemplos;

public class Power {
    public static void main(String[] args) {
        long n = 98;
        isPowerofTwo(n);

    }

    public static boolean isPowerofTwo(long n) {
        // Your code here
        boolean isPower = false;
        long prod=1;
        if(n==1){
            isPower=true;
            return isPower;
        }

        if(n%2==0){
            long i =0;
            while(i<n/2){
                prod = prod*2;
                if(prod>n){
                    return false;
                }
                else if(prod==n){
                    return true;
                }

                i++;
            }
        }

        return isPower;

    }
  /*
  * 1.- Definir en una variable la base=2
  * 2. DEfinir hasta cuantas veces va iterar.
  * */
}
