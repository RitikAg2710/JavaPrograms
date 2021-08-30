package com.company.HackerankJava;

//How to find the maximum occurring character in a given String?


public class MaxEleInArray {
    static final int n=256;
    static char MaxChar(String Str1){
        char result = ' ';
        int max=-1;
        int ctr[] = new int[n];
        for(int i=0;i<Str1.length();i++){
            ctr[Str1.charAt(i)]++;
        }

        for(int i=0;i<Str1.length();i++){
            if(max<ctr[Str1.charAt(i)]){
                max = ctr[Str1.charAt(i)];
                result = Str1.charAt(i);
            }

        }
        return result;

    }


    public static void main(String[] args) {
        String Strl1="testing";
        System.out.println("Given String "+Strl1);
        System.out.println("Sorted Max String "+MaxChar(Strl1));
    }
}
