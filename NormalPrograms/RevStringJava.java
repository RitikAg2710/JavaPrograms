package com.company.NormalPrograms;

import java.util.Scanner;

public class RevStringJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name do you want");
        String s = sc.next();
        String Rev = "";

        for(int i=s.length()-1;i>=0;i--){
            Rev = Rev+s.charAt(i);
        }
        System.out.println("Reverse String " +Rev);

    }
    

}
