package com.company;

public class RevEachWordInString {

    public static void main(String[] args){

        String sc = "Welcome to my World";
        String[] words = sc.split("\\s");

        String RevString = "";

        for(String w:words){
            StringBuilder st = new StringBuilder(w);
            st.reverse();

            RevString = RevString+st.toString()+" ";
        }
        System.out.println(RevString);
    }
}
