package com.company.StringProblems;


public class DuplicateElem {
    public static void main(String[] args) {
        String s = "RitiikkkkAgrawal";
        System.out.println("Old String is "+s);
        System.out.println("New String is "+Duplicate(s));
        }
    public static String Duplicate(String s){
        String s1 = "";
        for(int i=0;i<s.length();i++){
            char b = s.charAt(i);
            if(s1.indexOf(b)==-1){
                s1 += b;
            }
        }

        return s1;
    }

}


