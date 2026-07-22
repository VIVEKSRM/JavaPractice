package org.example;

import java.util.*;
import java.lang.*;

public class Test {

    public static void main(String[] args) {
       // System.out.println("Hello world!");

        String str ="Welcome to TCSS s";

        String strLower=str.toLowerCase();

        char[] str1 = strLower.replace(" ","").toCharArray();
        //System.out.println(str1);

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i <= str1.length-1; i++) {
            if (hm.containsKey(str1[i])) {
               // System.out.println("Duplicate character is :- "+str1[i]);
                int count=hm.get(str1[i]);
                hm.put(str1[i], count + 1);
            } else
                hm.put(str1[i], 1);
        }

        System.out.println(hm);


   }

    // str2=str.toLowerCase();
    // System.out.println(str2);
//
//        String[] strRev=str.split(" ");
//       // System.out.println("****strRev :- "+strRev);
//
//        for (int i=0; i<=strRev.length-1; i++) {
//            char[] ch=strRev[i].toCharArray();
//            System.out.print(" ");
//            for(int j=ch.length-1; j>=0; j--){
//                System.out.print(ch[j]);
//            }
//        }
//
//


    public void test1(){
        String str ="Welcome to TCS";
        String[] strRev=str.split(" ");
       // System.out.println("****strRev :- "+strRev);

        for (int i=0; i<=strRev.length-1; i++) {
            char[] ch=strRev[i].toCharArray();
            System.out.print(" ");
            for(int j=ch.length-1; j>=0; j--){
                System.out.print(ch[j]);
            }
        }



    }

    public void test2(){
        String str ="Welcome to TCS";
        String[] strRev=str.split(" ");
        // System.out.println("****strRev :- "+strRev);

        for (int i=0; i<=strRev.length-1; i++) {
            char[] ch=strRev[i].toCharArray();
            System.out.print(" ");
            for(int j=ch.length-1; j>=0; j--){
                System.out.print(ch[j]);
            }
        }



    }
}
