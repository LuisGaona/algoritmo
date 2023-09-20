package org.lugaona.appmokito.ejemplos;

public class Palindrome {

    public static void main(String[] args) {
        String s="abc";
        System.out.println(isPalindrome(s));
    }

    static int isPalindrome(String s) {
        int lenght=s.length()-1;
        StringBuilder reverse=new StringBuilder();
        for(int v=lenght; v>=0;--v){
            reverse.append(s.charAt(v));
        }
        if(s.equalsIgnoreCase(reverse.toString())){
            return 1;
        }else{
            return 0;
        }
    }

}
