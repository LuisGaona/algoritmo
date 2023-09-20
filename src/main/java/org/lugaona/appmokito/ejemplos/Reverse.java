package org.lugaona.appmokito.ejemplos;

public class Reverse {
    public static void main(String[] args) {
        String value="Geeks";
        System.out.println(reverseWord(value));
    }

    public static String reverseWord(String str)
    {
        // Reverse the string str
        char [] data=str.toCharArray();
        StringBuilder sb= new StringBuilder();
        for(var i=data.length-1;i>=0; i--){
            //System.out.println(data[i]);
            sb.append(data[i]);
        }
        return sb.toString();
    }
}
