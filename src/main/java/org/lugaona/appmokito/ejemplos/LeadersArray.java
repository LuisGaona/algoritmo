package org.lugaona.appmokito.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersArray {
    public static void main(String[] args) {
        int n = 5;
        int A[] = {31 ,40 ,93 ,40 ,98};
        leaders(A, n);
    }

    static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> result= new ArrayList<>();
        boolean isLeader=false;
        for( var i=0;i<n;i++){
        // System.out.println(arr[i]);
          for(var j=i;j<n;j++){
              if(arr[i]>=arr[j]){
               isLeader=true;
              }else{
                  isLeader=false;
                  break;
              }
          }
          if(isLeader){
              result.add(arr[i]);
          }
     }
        result.stream().forEach(x-> System.out.print(x+" "));
     return result;
    }
}
