package com.company.HackerankJava;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;



public class Anagram {
    static boolean isAnagram(String a, String b) {
        a = a.replace(" ", " ").toLowerCase();
        b = b.replace(" ", " ").toLowerCase();

        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        if (Arrays.equals(c, d))
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}


