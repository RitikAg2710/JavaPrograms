package com.company;

public class Main
{
    public static void main(String[] args) {
        String str = "RITIK";
        String rev = "";

        int len = str.length();

        for(int i=len-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }

        System.out.println("reverse string is " +rev);
    }
}
