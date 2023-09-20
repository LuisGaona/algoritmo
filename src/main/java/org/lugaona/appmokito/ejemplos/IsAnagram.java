package org.lugaona.appmokito.ejemplos;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        /*
    Ex--
    str1 = "LOVE"
    str2 = "OLEV" or str2 = "EVOL" or str2 = "VOLE"

    str1 = "AABBCC";

str2 = "ABBBBC";
*/

        String str = "AABBCC";
        String str2 = "ABBBBC";
        System.out.println(anagram(str, str2));


    }

    public static boolean anagram(String str1, String str2) {
        boolean isAnagram = false;
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        //StringBuilder sb= new StringBuilder(str1);
        //char []b= str2.co
        Arrays.sort(a);
        Arrays.sort(b);

        isAnagram = Arrays.equals(a, b);

        return isAnagram;
    }
}
