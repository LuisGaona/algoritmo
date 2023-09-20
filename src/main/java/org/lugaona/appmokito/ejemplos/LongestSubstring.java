package org.lugaona.appmokito.ejemplos;

import java.util.*;
import java.util.stream.Collectors;

public class LongestSubstring {
    public static void main(String[] args) {
       String S = "nixnqsdsdlupn";
        int K = 4;
        System.out.println(longestkSubstr(S,K));
    }

    public static int longestkSubstr(String s, int k) {
        // code here
        int result=-1;
        int lnaght=s.length();
        for(var i=0;i<lnaght;i++) {
            String newString = s.substring(i);
            char data[] = newString.toCharArray();
            Set<Character> uniqueData = new HashSet<>();
            for (var j = 0; j < data.length; j++) {
                uniqueData.add(data[j]);
            }

            if (uniqueData.size()==k) {
                result = newString.length();
                break;
            }
        }
        return result;
    }
}
