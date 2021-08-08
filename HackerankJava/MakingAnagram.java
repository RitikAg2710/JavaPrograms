package com.company;

import java.util.Scanner;

public class MakingAnagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arry1 = new char[str1.length()];
        char[] arry2 = new char[str2.length()];

        for(int i=0;i<str1.length();i++){
            arry1[i] = str1.charAt(i);
        }

        for(int i=0;i<str2.length();i++){
            arry2[i] = str2.charAt(i);
        }

        int count=0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(arry1[i] == arry2[j]){
                    count++;
                    arry2[j]='0';
                    break;
                }
            }
        }

        System.out.println(str1.length()+str2.length()-(2*count));

    }
}
